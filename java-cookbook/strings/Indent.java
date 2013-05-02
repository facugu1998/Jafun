import java.io.*;

/** Indent - prepend leading spaces
 * @author Ian F. Darwin, http://www.darwinsys.com/
 * @version $Id: Indent.java,v 1.3 2004/02/09 03:34:03 ian Exp $
 */

public class Indent {
	/** the default number of spaces. */
	static int nSpaces = 10;

    public static void main(String[] av) {
        Indent c = new Indent();
        switch(av.length) {
            case 0: c.process(new BufferedReader(
                        new InputStreamReader(System.in))); break;
            default:
		for (int i=0; i<av.length; i++)
			try {
				c.process(new BufferedReader(new FileReader(av[i])));
			} catch (FileNotFoundException e) {
				System.err.println(e);
			}
        }
    }

    /** print one file, given an open BufferedReader */
    public void process(BufferedReader is) {
        try {
            String inputLine;

			//+
            while ((inputLine = is.readLine()) != null) {
				for (int i=0; i<nSpaces; i++) System.out.print(' ');
                System.out.println(inputLine);
            }
			//-
            is.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}