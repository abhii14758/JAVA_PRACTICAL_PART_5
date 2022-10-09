/*Created By 21CE013 ABHI BHIMANI
Question : WAP to show use of character and byte stream. */

import java.io.*;

class PR_5_4
{  
    public static void main(String args[]) throws IOException
    {        
        FileInputStream in = null;
        FileOutputStream out = null;

        try
        {
            in = new FileInputStream("Part5Practical4Input.txt");
            out = new FileOutputStream("Part5Practical4Output.txt");
            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
