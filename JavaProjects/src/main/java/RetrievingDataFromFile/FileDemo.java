package RetrievingDataFromFile;

import java.util.Scanner;
import java.io.*;

public class FileDemo
{
    public static void main(String[] args)
    {
        try{
	        File file = new File("log.txt");
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(file);
	        while(sc.hasNextLine()) {
	        	System.out.println(sc.nextLine());
	        }
        }
        catch (Exception e) {
        	System.out.println(e);
        }
    }
}
