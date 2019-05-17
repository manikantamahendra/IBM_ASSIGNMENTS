import java.io.*;
import java.util.*;
class FileExist{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File Name :");
		String fileName = sc.nextLine();
		File file = new File(fileName);
		System.out.println("Did the file Exit :" + file.exists());
		System.out.println("Did the file is readable :" + file.canRead());
		System.out.println("Did the file is Writable :" +file.canWrite());
		System.out.println("Length of the File is :" +file.length() + "in Bytes");
		System.out.println("The Type of File is :" + file.isFile());

	}
	
}