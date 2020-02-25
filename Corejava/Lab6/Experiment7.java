package Lab6;

import java.io.*;
import java.util.Scanner;

public class Experiment7 {

		public static void main(String[] args) throws IOException{
			File file=new File("D:/dgh.txt");
			boolean status=file.isDirectory();
			if(status) {
			String ar[]=file.list();
			for (String string : ar) {
			System.out.println(string);
			}
			}
			else if(file.isFile())
			System.out.println("Its a file");

			if(file.exists()) {
			System.out.println("file is present");
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
			}
			else {
			System.out.println("File not present");
			file.mkdirs();

			}

			FileOutputStream outputStream=null;
			try {
			outputStream=new FileOutputStream(file);
			outputStream.write("hello world".getBytes());
			} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
			}
			finally {
			outputStream.close();
			}
	}
}
