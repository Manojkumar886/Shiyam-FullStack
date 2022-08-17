package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAsScanner 
{
	public static void main(String[] args) throws FileNotFoundException 
	{	
	File file=new File("E:\\Files\\Folder01\\SampleTesting.txt");
	Scanner scan=new Scanner(file.getAbsoluteFile());
	while(scan.hasNext())
	{
		System.out.println(scan.nextLine());
	}
	}
}
