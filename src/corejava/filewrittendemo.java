package corejava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewrittendemo {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\ck0n9\\OneDrive\\Desktop\\21stAug.txt");
	f.createNewFile();
	try
	{
		FileWriter fw=new FileWriter("C:\\Users\\ck0n9\\OneDrive\\Desktop\\21stAug.txt");
		fw.write("hello today is thursday.");
		fw.append(" bye");
		fw.close();
	}
	catch(Exception e)
	{
		System.out.println("error:file not found");
	}
}
}
