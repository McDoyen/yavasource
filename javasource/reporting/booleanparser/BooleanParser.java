package reporting.booleanparser;
// $ANTLR 3.x C:\\Mendix\\Antlr\\Boolean.g 2012-12-20 14:49:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class BooleanParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "B", "C", "CLOSE_PAREN", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "NOT", "NOT_ALLOWED", "NUMBER", "O", "OPEN_PAREN", "OR", "P", "Q", "R", "S", "T", "U", "V", "W", "WHITESPACE", "X", "Y", "Z"
	};

	public static final int EOF=-1;
	public static final int A=4;
	public static final int AND=5;
	public static final int B=6;
	public static final int C=7;
	public static final int CLOSE_PAREN=8;
	public static final int D=9;
	public static final int E=10;
	public static final int F=11;
	public static final int G=12;
	public static final int H=13;
	public static final int I=14;
	public static final int J=15;
	public static final int K=16;
	public static final int L=17;
	public static final int M=18;
	public static final int N=19;
	public static final int NOT=20;
	public static final int NOT_ALLOWED=21;
	public static final int NUMBER=22;
	public static final int O=23;
	public static final int OPEN_PAREN=24;
	public static final int OR=25;
	public static final int P=26;
	public static final int Q=27;
	public static final int R=28;
	public static final int S=29;
	public static final int T=30;
	public static final int U=31;
	public static final int V=32;
	public static final int W=33;
	public static final int WHITESPACE=34;
	public static final int X=35;
	public static final int Y=36;
	public static final int Z=37;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BooleanParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BooleanParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return BooleanParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Mendix\\Antlr\\Boolean.g"; }



	// $ANTLR start "eval"
	// C:\\Mendix\\Antlr\\Boolean.g:3:1: eval : boolean_expression EOF ;
	public final void eval() throws RecognitionException {
			// C:\\Mendix\\Antlr\\Boolean.g:3:9: ( boolean_expression EOF )
			// C:\\Mendix\\Antlr\\Boolean.g:3:14: boolean_expression EOF
			{
			pushFollow(FOLLOW_boolean_expression_in_eval16);
			boolean_expression();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_eval18); 
			}

		return ;
	}
	// $ANTLR end "eval"



	// $ANTLR start "boolean_expression"
	// C:\\Mendix\\Antlr\\Boolean.g:5:1: boolean_expression : boolean_term ( OR boolean_term )* ;
	public final void boolean_expression() throws RecognitionException {
			// C:\\Mendix\\Antlr\\Boolean.g:5:19: ( boolean_term ( OR boolean_term )* )
			// C:\\Mendix\\Antlr\\Boolean.g:5:22: boolean_term ( OR boolean_term )*
			{
			pushFollow(FOLLOW_boolean_term_in_boolean_expression26);
			boolean_term();
			state._fsp--;

			// C:\\Mendix\\Antlr\\Boolean.g:5:35: ( OR boolean_term )*
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==OR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:5:36: OR boolean_term
					{
					match(input,OR,FOLLOW_OR_in_boolean_expression29); 
					pushFollow(FOLLOW_boolean_term_in_boolean_expression31);
					boolean_term();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			} while (true);

			}

		return ;
	}
	// $ANTLR end "boolean_expression"



	// $ANTLR start "boolean_term"
	// C:\\Mendix\\Antlr\\Boolean.g:6:1: boolean_term : ( boolean_not | boolean_atom ) ( AND ( boolean_not | boolean_atom ) )* ;
	public final void boolean_term() throws RecognitionException {
			// C:\\Mendix\\Antlr\\Boolean.g:6:13: ( ( boolean_not | boolean_atom ) ( AND ( boolean_not | boolean_atom ) )* )
			// C:\\Mendix\\Antlr\\Boolean.g:6:16: ( boolean_not | boolean_atom ) ( AND ( boolean_not | boolean_atom ) )*
			{
			// C:\\Mendix\\Antlr\\Boolean.g:6:16: ( boolean_not | boolean_atom )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NOT) ) {
				alt2=1;
			}
			else if ( (LA2_0==NUMBER||LA2_0==OPEN_PAREN||LA2_0==WHITESPACE) ) {
				alt2=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:6:17: boolean_not
					{
					pushFollow(FOLLOW_boolean_not_in_boolean_term41);
					boolean_not();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Mendix\\Antlr\\Boolean.g:6:29: boolean_atom
					{
					pushFollow(FOLLOW_boolean_atom_in_boolean_term43);
					boolean_atom();
					state._fsp--;

					}
					break;

			}

			// C:\\Mendix\\Antlr\\Boolean.g:6:43: ( AND ( boolean_not | boolean_atom ) )*
			loop4:
			do {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==AND) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:6:44: AND ( boolean_not | boolean_atom )
					{
					match(input,AND,FOLLOW_AND_in_boolean_term47); 
					// C:\\Mendix\\Antlr\\Boolean.g:6:48: ( boolean_not | boolean_atom )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==NOT) ) {
						alt3=1;
					}
					else if ( (LA3_0==NUMBER||LA3_0==OPEN_PAREN||LA3_0==WHITESPACE) ) {
						alt3=2;
					}
					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// C:\\Mendix\\Antlr\\Boolean.g:6:49: boolean_not
							{
							pushFollow(FOLLOW_boolean_not_in_boolean_term50);
							boolean_not();
							state._fsp--;

							}
							break;
						case 2 :
							// C:\\Mendix\\Antlr\\Boolean.g:6:61: boolean_atom
							{
							pushFollow(FOLLOW_boolean_atom_in_boolean_term52);
							boolean_atom();
							state._fsp--;

							}
							break;

					}

					}
					break;

				default :
					break loop4;
				}
			} while (true);

			}

		return ;
	}
	// $ANTLR end "boolean_term"



	// $ANTLR start "boolean_not"
	// C:\\Mendix\\Antlr\\Boolean.g:7:1: boolean_not : NOT boolean_atom ;
	public final void boolean_not() throws RecognitionException {
			// C:\\Mendix\\Antlr\\Boolean.g:7:12: ( NOT boolean_atom )
			// C:\\Mendix\\Antlr\\Boolean.g:7:15: NOT boolean_atom
			{
			match(input,NOT,FOLLOW_NOT_in_boolean_not62); 
			pushFollow(FOLLOW_boolean_atom_in_boolean_not64);
			boolean_atom();
			state._fsp--;

			}

		return ;
	}
	// $ANTLR end "boolean_not"



	// $ANTLR start "boolean_atom"
	// C:\\Mendix\\Antlr\\Boolean.g:8:1: boolean_atom : ( atom | OPEN_PAREN boolean_expression CLOSE_PAREN );
	public final void boolean_atom() throws RecognitionException {
			// C:\\Mendix\\Antlr\\Boolean.g:8:17: ( atom | OPEN_PAREN boolean_expression CLOSE_PAREN )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==NUMBER||LA5_0==WHITESPACE) ) {
				alt5=1;
			}
			else if ( (LA5_0==OPEN_PAREN) ) {
				alt5=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:8:21: atom
					{
					pushFollow(FOLLOW_atom_in_boolean_atom76);
					atom();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Mendix\\Antlr\\Boolean.g:8:28: OPEN_PAREN boolean_expression CLOSE_PAREN
					{
					match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_boolean_atom80); 
					pushFollow(FOLLOW_boolean_expression_in_boolean_atom82);
					boolean_expression();
					state._fsp--;

					match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_boolean_atom84); 
					}
					break;

			}
		return ;
	}
	// $ANTLR end "boolean_atom"



	// $ANTLR start "atom"
	// C:\\Mendix\\Antlr\\Boolean.g:10:1: atom : ( WHITESPACE )* NUMBER ( WHITESPACE )* ;
	public final void atom() throws RecognitionException {
			// C:\\Mendix\\Antlr\\Boolean.g:10:9: ( ( WHITESPACE )* NUMBER ( WHITESPACE )* )
			// C:\\Mendix\\Antlr\\Boolean.g:10:16: ( WHITESPACE )* NUMBER ( WHITESPACE )*
			{
			// C:\\Mendix\\Antlr\\Boolean.g:10:16: ( WHITESPACE )*
			loop6:
			do {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WHITESPACE) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:10:16: WHITESPACE
					{
					match(input,WHITESPACE,FOLLOW_WHITESPACE_in_atom100); 
					}
					break;

				default :
					break loop6;
				}
			} while (true);

			match(input,NUMBER,FOLLOW_NUMBER_in_atom103); 
			// C:\\Mendix\\Antlr\\Boolean.g:10:35: ( WHITESPACE )*
			loop7:
			do {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WHITESPACE) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:10:35: WHITESPACE
					{
					match(input,WHITESPACE,FOLLOW_WHITESPACE_in_atom105); 
					}
					break;

				default :
					break loop7;
				}
			} while (true);

			}

		return ;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_boolean_expression_in_eval16 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_eval18 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean_term_in_boolean_expression26 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_OR_in_boolean_expression29 = new BitSet(new long[]{0x0000000401500000L});
	public static final BitSet FOLLOW_boolean_term_in_boolean_expression31 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_boolean_not_in_boolean_term41 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_boolean_atom_in_boolean_term43 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_boolean_term47 = new BitSet(new long[]{0x0000000401500000L});
	public static final BitSet FOLLOW_boolean_not_in_boolean_term50 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_boolean_atom_in_boolean_term52 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NOT_in_boolean_not62 = new BitSet(new long[]{0x0000000401400000L});
	public static final BitSet FOLLOW_boolean_atom_in_boolean_not64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_boolean_atom76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_boolean_atom80 = new BitSet(new long[]{0x0000000401500000L});
	public static final BitSet FOLLOW_boolean_expression_in_boolean_atom82 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_boolean_atom84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHITESPACE_in_atom100 = new BitSet(new long[]{0x0000000400400000L});
	public static final BitSet FOLLOW_NUMBER_in_atom103 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_WHITESPACE_in_atom105 = new BitSet(new long[]{0x0000000400000002L});
}
