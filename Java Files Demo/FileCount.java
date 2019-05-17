import java.io.*;
class FileCount
{
	
public static void main(String args[]) throws Exception
{
	
 int count=0;
 int word =0;
 int line =0;

int size=0;

	File file = new File("anotherFile.txt");
	FileReader fr=new FileReader(file);
    BufferedReader br=new BufferedReader(fr);
	String t;
while((t=br.readLine()) != null)
{  

   line++;
	if(!(t.equals(""))){

		size +=t.length();
		String[] wordList = t.split("\\s+"); 
        word += wordList.length; 
                 

	}

}
System.out.println("Total number of charecters in the file are :" +size);
System.out.println("total words :"+word);
System.out.println("Total lines are :" +line);
fr.close();
}
}