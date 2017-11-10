// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package customlvnl.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.IOUtils;
import system.proxies.FileDocument;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 1193052 - Download multiple attachments as .zip file
 */
public class ZipFileDocuments extends CustomJavaAction<java.lang.Boolean>
{
	private java.util.List<IMendixObject> __SourceFiles;
	private java.util.List<system.proxies.FileDocument> SourceFiles;
	private IMendixObject __TargetFile;
	private system.proxies.FileDocument TargetFile;

	public ZipFileDocuments(IContext context, java.util.List<IMendixObject> SourceFiles, IMendixObject TargetFile)
	{
		super(context);
		this.__SourceFiles = SourceFiles;
		this.__TargetFile = TargetFile;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.SourceFiles = new java.util.ArrayList<system.proxies.FileDocument>();
		if (__SourceFiles != null)
			for (IMendixObject __SourceFilesElement : __SourceFiles)
				this.SourceFiles.add(system.proxies.FileDocument.initialize(getContext(), __SourceFilesElement));

		this.TargetFile = __TargetFile == null ? null : system.proxies.FileDocument.initialize(getContext(), __TargetFile);

		// BEGIN USER CODE
		if (this.TargetFile == null) {
			throw new Exception("Zip target File is not Supplied");
		}
		if (this.__SourceFiles == null) {
			throw new Exception("Source File List is not Supplied");
		}

		zipFileDocuments(this.TargetFile.getMendixObject(), this.SourceFiles, getContext());

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ZipFileDocuments";
	}

	// BEGIN EXTRA CODE
	private void zipFileDocuments(IMendixObject destinationZipFile, List<system.proxies.FileDocument> filesToZip, IContext context) throws IOException {
		File tempFile = File.createTempFile("BulkZipFileDocument" + System.currentTimeMillis(), "tmp");
		ZipOutputStream zipfile = new ZipOutputStream(new FileOutputStream(tempFile));
		HashMap<String, Integer> filenames = new HashMap<String, Integer>();
		String filename;
		String newFileName;
		Integer fileIndex;
		for (FileDocument file : filesToZip) {
			if(file.getHasContents()){
				try {
					filename = file.getName();
					fileIndex = filenames.get(filename);			
					if(fileIndex == null){
						fileIndex = 1;
						newFileName = filename;
					} else {
						// handle unique files names add indix number in name.
						fileIndex++;
						int extentionIndex = filename.lastIndexOf(".");
						if(extentionIndex != -1) {
							newFileName = filename.substring(0, extentionIndex ) + "(" + fileIndex + ")" + filename.substring(extentionIndex, filename.length() ) ;
						} else {
							// file does not have a file extension
							newFileName = filename + "(" + fileIndex + ")";
						}
					}
					InputStream fileInputStream = Core.getFileDocumentContent(context, file.getMendixObject());
					zipfile.putNextEntry(new ZipEntry(newFileName));
					IOUtils.copy(fileInputStream, zipfile);
					fileInputStream.close();
					filenames.put(filename, fileIndex);
				} catch(RuntimeException e){
					// Catch  LocalFileSystemStore:: File does not exist errors
					ILogNode logger = Core.getLogger("ZipFileDocuments");
					logger.warn(e.toString(), e);
				}
			}
		}
		zipfile.close();
		InputStream zipInputStream = new FileInputStream(tempFile);
		Core.storeFileDocumentContent(context, destinationZipFile, zipInputStream);
		tempFile.delete();
	}
	// END EXTRA CODE
}
