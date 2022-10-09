/*Created By 21CE013 ABHI BHIMANI
Question : When to use Character Stream over Byte Stream? When to use Byte Stream over Character
Stream? Give example.
Ans:Byte streams are used to perform input and output of 8-bit bytes.
    Byte streams are useful when we want to read/write binary data.
    Character stream is used to perform input and output operations of 16-bit Unicode.
    Character streams are used to read/write characters.*/

    import java.io.*;
 
    // Main class
    public class PR_5_2
        {
        // Main driver method
        public static void main(String[] args)
            throws IOException
        {
     
            // Initially assigning null as we have not read
            // anything
            FileReader sourceStream = null;
     
            // Try block to check for exceptions
            try {
     
                // Reading from file
                sourceStream = new FileReader(
                    "Part5Practical2.txt");
     
                // Reading sourcefile and writing content to
                // target file character by character.
     
                int temp;
     
                // If there is content inside file
                // than read
                while ((temp = sourceStream.read()) != -1)
                    System.out.println((char)temp);
               
              // Display message for successful execution of program
              System.out.print("Program successfully executed");
            }
     
            // finally block that executes for sure
            // where we are closing file connections
            // to avoid memory leakage
            finally {
     
                // Closing stream as no longer in use
                if (sourceStream != null)
                    sourceStream.close();
            }
        }
    }
    