package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class ReadAnENcrpt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("E:\\Files\\Folder01\\Testing.zip");
		FileInputStream fis=new FileInputStream(file);
		InflaterInputStream iis=new InflaterInputStream(fis);
		
		byte[] arr=new byte[fis.available()];
		iis.read(arr);
		iis.close();
		fis.close();
		
		System.out.println(file.getName()+"   My content is \n"+new String(arr));		
	
	}

}
