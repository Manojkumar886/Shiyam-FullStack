package Files;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class TestingMethodsInFiles {

	public static void main(String[] args) throws IOException 
	{
		//File file=new File("E:\\Files\\Folder01\\Testing.txt");
		//File file1=new File("E:\\Files\\Folder01\\SampleTesting.txt");
	//	System.out.println(file.exists());
//		file.mkdirs();sub folders
//		file.mkdir();//Folder creation
		//file.createNewFile();
		//file.renameTo(file1);
		
//		File file=new File("E:\\");
//		File[] ListAllDetails=file.listFiles();
//		
//		for(File listing:ListAllDetails)
//		{
//			System.out.println(listing);
//		}
		File file=new File("C:\\Users\\ELCOT\\Documents");
		File[] listfiles=file.listFiles();
		for(File listing:listfiles)
		{
			if(listing.isFile())
			{
//			System.out.println(listing);
			String filename = listing.getName();
			int lastDot = filename.lastIndexOf(".");
			String Execution1 = filename.substring(lastDot+1);
//			if(Execution1.equals("docx"))
			System.out.println(Execution1);
			}
		}
	}

}
