package saml20.implementation;

import java.io.IOException;
import java.io.OutputStream;

import org.opensaml.common.SAMLException;

import saml20.implementation.metadata.SPMetadataGenerator;
import saml20.implementation.security.CredentialRepository;

public class MetadataHandler extends SAMLHandler {

	@Override
	public void handleRequest( SAMLRequestContext context ) throws SAMLException {
		printTraceInfo(context);
		printMetadata(context);
	}

	private static void printMetadata( SAMLRequestContext context ) throws SAMLException {
		try {
			OutputStream out;
			out = context.getResponse().getOutputStream();
			out.write(SPMetadataGenerator.generate(context.getIContext(), context.getSpMetadata().getSpMetadataObject(), CredentialRepository.getInstance()).toByteArray());

			out.close();
		}
		catch( IOException e ) {
			throw new SAMLException("Unable to write metadata back in the response", e);
		}
	}

}
