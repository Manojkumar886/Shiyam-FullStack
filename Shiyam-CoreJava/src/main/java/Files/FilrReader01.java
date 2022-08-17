package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilrReader01 {

	public static void main(String[] args) throws IOException 
	{	
		// TODO Auto-generated method stub
		File file=new File("E:\\Files\\Folder01\\SampleTesting.txt");
		FileReader fr=new FileReader(file);
		int asci=0;
		while((asci=fr.read())!=-1)
		{
			System.out.print((char)asci);
		}
		
	}

}
