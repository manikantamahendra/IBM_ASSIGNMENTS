import java.util.Scanner;   
class  StringPalendrome{  
   public static void main(String args[])  
   {  
       StringReverseDemo sr = new StringReverseDemo();
       sr.reverse();
   }  
}  

class StringPalendromeDemo{
   void reverse(){
    String reverse="";
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String :");  
     String str = sc.nextLine();   
         
      for ( int i = str.length() - 1; i >= 0; i-- ){
          
         reverse = reverse + str.charAt(i);

      }  
      if (str.equals(reverse))  
         System.out.println(" palendrome");  
      else  
         System.out.println("Not palendrome"); 
}
}