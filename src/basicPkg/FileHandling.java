package basicPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class FileHandling 
{

	public static void readpropfile() throws Exception
	{
		//File f = new File("./TestData/test.properties"); //file connection
		//FileReader fr = new FileReader(f);
		
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties pr = new Properties();  //ctrl+shift+o
		
		pr.load(fr);
		System.out.println(pr.get("name"));
		System.out.println(pr.get("user"));
		
	}
	
	public static void readfile() throws Exception
	{
		File f = new File("C:\\TestData\\abc.txt"); //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();  //r=116
		
		while(r!=-1)
		{
			System.out.print((char)r); //th
			r = fr.read();  //  104
		}
		
	}
	
	public static void writefile() throws Exception
	{
		File f = new File("C:\\TestData\\xyz.txt"); //file connection
	
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line");
		fw.flush();
		fw.close();
		
	}
		
	public static void main(String[] args) throws Exception
	{
		readpropfile();

	}

}
