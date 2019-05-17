import java.io.*;
class FileLineDemo
{
public static void main(String args[])
{
int c=0;
try{
	File file = new File("anotherFile.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String t;
while((t=br.readLine())!=null)
{
c++;
System.out.println(c + " " +t);
}
fr.close();

}catch(Exception ie){
	System.out.println("FIle not Exit" +ie);
}

}
}
