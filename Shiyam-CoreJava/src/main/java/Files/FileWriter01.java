package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\Files\\Folder01\\SampleTesting.txt");
		//System.out.println(file.exists());
		FileWriter fw=new FileWriter(file);
		fw.write("I have completed java full stack in zealous tech corb");
		fw.close();
	}
}
