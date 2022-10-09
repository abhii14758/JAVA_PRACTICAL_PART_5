/*Created By 21CE013 ABHI BHIMANI
Question : Write a program to enter any 15 numbers from the user and store only even numbers in a file
named “Even.txt”. And display the contents of this file on the console. */

import java.io.*;
import java.util.*;


class PR_5_5
{
    public static void main(String... args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[15];
        for(int i=0;i<15;i++)
        {
            System.out.println("Enter the "+(i+1)+" number : ");
            arr[i]=sc.nextInt();
        }

        //Buffered Writer
        FileWriter writer=new FileWriter("Part5Practical5Even.txt");
        BufferedWriter buffer= new BufferedWriter(writer);

        for(int i=0;i<15;i++)
        {
            if(arr[i]%2==0)
            {
                buffer.write(arr[i]+" ");
            }
        }
        buffer.close();

        //Buffered Reader
        FileReader fr=new FileReader("Part5Practical5Even.txt");    
        BufferedReader br=new BufferedReader(fr);    
        int i;    
        System.out.println("Reading the file : ");
        while((i=br.read())!=-1)
        {  
            System.out.print((char)i);  
        }  
        br.close();    
        fr.close();    
    }
}
