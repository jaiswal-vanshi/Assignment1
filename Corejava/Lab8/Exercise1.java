package Lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 extends Thread{

FileReader reader;
FileWriter writer;
@Override
public void run() {
try {
reader=new FileReader("C:\\Users\\HP\\Desktop\\source.txt");
writer=new FileWriter("target.txt");
} catch (IOException e1) {
e1.printStackTrace();
}
int x=0;
int c=1;
while(x!=-1) {
try {
x=reader.read();
writer.write(x);
c++;
}
catch(IOException e) {

}
if(c%10==0) {
try {
System.out.println("10 characters are copied.");
Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

}
try {
reader.close();
writer.close();
}
catch(IOException e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
new Exercise1().start();
}
}