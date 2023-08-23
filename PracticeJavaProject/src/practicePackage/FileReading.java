package practicePackage;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("E:\\Divya\\WritingIntoFile.txt");
		int c= f.read();
		
	}

}
