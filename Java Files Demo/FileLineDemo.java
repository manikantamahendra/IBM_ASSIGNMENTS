import java.io.*;
class FileLineDemo
{
static	int c=0;
public static void main(String args[])
{

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
