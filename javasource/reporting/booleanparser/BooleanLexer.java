package reporting.booleanparser;
// $ANTLR 3.x C:\\Mendix\\Antlr\\Boolean.g 2012-12-20 14:49:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class BooleanLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public BooleanLexer() {} 
	public BooleanLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public BooleanLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Mendix\\Antlr\\Boolean.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:13:7: ( A N D )
			// C:\\Mendix\\Antlr\\Boolean.g:13:10: A N D
			{
			mA(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:14:6: ( O R )
			// C:\\Mendix\\Antlr\\Boolean.g:14:9: O R
			{
			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:15:7: ( N O T )
			// C:\\Mendix\\Antlr\\Boolean.g:15:10: N O T
			{
			mN(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OPEN_PAREN"
	public final void mOPEN_PAREN() throws RecognitionException {
		try {
			int _type = OPEN_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:16:13: ( '(' )
			// C:\\Mendix\\Antlr\\Boolean.g:16:16: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPEN_PAREN"

	// $ANTLR start "CLOSE_PAREN"
	public final void mCLOSE_PAREN() throws RecognitionException {
		try {
			int _type = CLOSE_PAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:17:14: ( ')' )
			// C:\\Mendix\\Antlr\\Boolean.g:17:17: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSE_PAREN"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:18:12: ( ( '0' .. '9' )+ )
			// C:\\Mendix\\Antlr\\Boolean.g:18:15: ( '0' .. '9' )+
			{
			// C:\\Mendix\\Antlr\\Boolean.g:18:15: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
						EarlyExitException eee =
							new EarlyExitException(1, input);
						throw eee;
				}
				cnt1++;
			} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:19:13: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// C:\\Mendix\\Antlr\\Boolean.g:19:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// C:\\Mendix\\Antlr\\Boolean.g:19:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Mendix\\Antlr\\Boolean.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
						EarlyExitException eee =
							new EarlyExitException(2, input);
						throw eee;
				}
				cnt2++;
			} while (true);

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "NOT_ALLOWED"
	public final void mNOT_ALLOWED() throws RecognitionException {
		try {
			int _type = NOT_ALLOWED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Mendix\\Antlr\\Boolean.g:20:14: (~ ( ( '0' .. '9' ) | '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||input.LA(1)=='\u000B'||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '/')||(input.LA(1) >= ':' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_ALLOWED"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:22:11: ( ( 'a' | 'A' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:23:11: ( ( 'b' | 'B' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:24:11: ( ( 'c' | 'C' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:25:11: ( ( 'd' | 'D' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:26:11: ( ( 'e' | 'E' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:27:11: ( ( 'f' | 'F' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:28:11: ( ( 'g' | 'G' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:29:11: ( ( 'h' | 'H' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:30:11: ( ( 'i' | 'I' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:31:11: ( ( 'j' | 'J' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:32:11: ( ( 'k' | 'K' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:33:11: ( ( 'l' | 'L' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:34:11: ( ( 'm' | 'M' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:35:11: ( ( 'n' | 'N' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:36:11: ( ( 'o' | 'O' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:37:11: ( ( 'p' | 'P' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:38:11: ( ( 'q' | 'Q' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:39:11: ( ( 'r' | 'R' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:40:11: ( ( 's' | 'S' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:41:11: ( ( 't' | 'T' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:42:11: ( ( 'u' | 'U' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:43:11: ( ( 'v' | 'V' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:44:11: ( ( 'w' | 'W' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:45:11: ( ( 'x' | 'X' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:46:11: ( ( 'y' | 'Y' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// C:\\Mendix\\Antlr\\Boolean.g:47:11: ( ( 'z' | 'Z' ) )
			// C:\\Mendix\\Antlr\\Boolean.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Mendix\\Antlr\\Boolean.g:1:8: ( AND | OR | NOT | OPEN_PAREN | CLOSE_PAREN | NUMBER | WHITESPACE | NOT_ALLOWED )
		int alt3=8;
		int LA3_0 = input.LA(1);
		if ( (LA3_0=='A'||LA3_0=='a') ) {
			int LA3_1 = input.LA(2);
			if ( (LA3_1=='N'||LA3_1=='n') ) {
				alt3=1;
			}
			else {
				alt3=8;
			}
		}
		else if ( (LA3_0=='O'||LA3_0=='o') ) {
			int LA3_2 = input.LA(2);
			if ( (LA3_2=='R'||LA3_2=='r') ) {
				alt3=2;
			}
			else {
				alt3=8;
			}
		}
		else if ( (LA3_0=='N'||LA3_0=='n') ) {
			int LA3_3 = input.LA(2);
			if ( (LA3_3=='O'||LA3_3=='o') ) {
				alt3=3;
			}
			else {
				alt3=8;
			}
		}
		else if ( (LA3_0=='(') ) {
			alt3=4;
		}
		else if ( (LA3_0==')') ) {
			alt3=5;
		}
		else if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
			alt3=6;
		}
		else if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
			alt3=7;
		}
		else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\b')||LA3_0=='\u000B'||(LA3_0 >= '\u000E' && LA3_0 <= '\u001F')||(LA3_0 >= '!' && LA3_0 <= '\'')||(LA3_0 >= '*' && LA3_0 <= '/')||(LA3_0 >= ':' && LA3_0 <= '@')||(LA3_0 >= 'B' && LA3_0 <= 'M')||(LA3_0 >= 'P' && LA3_0 <= '`')||(LA3_0 >= 'b' && LA3_0 <= 'm')||(LA3_0 >= 'p' && LA3_0 <= '\uFFFF')) ) {
			alt3=8;
		}
		else {
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:14: OR
				{
				mOR(); 

				}
				break;
			case 3 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:17: NOT
				{
				mNOT(); 

				}
				break;
			case 4 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:21: OPEN_PAREN
				{
				mOPEN_PAREN(); 

				}
				break;
			case 5 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:32: CLOSE_PAREN
				{
				mCLOSE_PAREN(); 

				}
				break;
			case 6 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:44: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 7 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:51: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 8 :
				// C:\\Mendix\\Antlr\\Boolean.g:1:62: NOT_ALLOWED
				{
				mNOT_ALLOWED(); 

				}
				break;

		}
	}



}
