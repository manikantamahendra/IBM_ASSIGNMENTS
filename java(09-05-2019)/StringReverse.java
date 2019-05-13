import java.util.*;
class StringReverse{
	public static void main(String[] args) {
		StringReverseDemo sr =new StringReverseDemo();
		sr.reverse();
		
	}
}


class StringReverseDemo{
	void reverse(){
		String reverse ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str= sc.nextLine();
		for ( int i = str.length() - 1; i >= 0; i-- ){
          
         reverse = reverse + str.charAt(i);

      }  
        System.out.println("reverse of the String is " +reverse);
	}
}