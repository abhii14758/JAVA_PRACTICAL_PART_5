/*Created By 21CE013 ABHI BHIMANI
Question : WAP to show how to create a file with different mode and methods of File class to find
path, directory etc. */

import java.util.*;
import java.io.*;

class PR_5_1
{
    public static void main(String... args)
    {

        //Creating the file
        try
        {
            File myObj=new File("Part5Practical1.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File created with name "+myObj.getName());
            }  
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        //Opening in writing mode
        try
        {
            FileWriter myObj=new FileWriter("Part5Practical1.txt");
            myObj.write("This is Part 5 Practical 5\nCreated Created By 21CE013 ABHI BHIMANI");
            myObj.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        //Reading from the file
        try
        {
            File myObj=new File("Part5Practical1.txt");
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                System.out.println(data);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        //Getting path of File and directory
        try
        {
            File myObj=new File("Part5Practical1.txt");
            String path = myObj.getAbsolutePath();
            String directory=new File(path).getParent();
            System.out.println("Path of file : "+path);
            System.out.println("Directory : "+directory);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
