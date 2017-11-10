grammar Boolean;

eval    :    boolean_expression EOF;

boolean_expression:  boolean_term (OR boolean_term)*;
boolean_term:  (boolean_not|boolean_atom) (AND (boolean_not|boolean_atom))*;
boolean_not:  NOT boolean_atom;
boolean_atom    :   atom | OPEN_PAREN boolean_expression CLOSE_PAREN;

atom    :      WHITESPACE* NUMBER WHITESPACE*;


AND 		:	 A N D;
OR 		:	 O R;
NOT	 	:	 N O T;
OPEN_PAREN 	:	 '(';
CLOSE_PAREN 	:	 ')';
NUMBER    	: 	('0'..'9')+;
WHITESPACE 	: 	('\t' | ' ' | '\r' | '\n'| '\u000C')+   { $channel = HIDDEN; }  ;
NOT_ALLOWED 	: 	~( ('0'..'9') |  '\t' | ' ' | '\r' | '\n'| '\u000C' ) ;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
