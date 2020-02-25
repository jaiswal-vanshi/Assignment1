package Lab6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Experiment2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file=new FileReader("c://corejava//capgemini//hello.txt");
		BufferedReader reader =new BufferedReader(file);
		int p=1;
		String s="";
		
		while((s=reader.readLine())!=null)
		{
			System.out.println(p++ + s);
		}
	}

}
