When generating new java files with Antlr please copy them and the grammar (*.g) file to this directory.

In de java file add the following as the first line:
package reporting.booleanparser;

In BooleanParser.java remove all
				try {
				
en

        } 
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        	// do for sure before leaving
        }
