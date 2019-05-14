import java.util.*;

public class FibonacciRecursion{

	public static int fibo(int a){
        if(a == 1 || a == 2){
            return 1;
        }
              
        return fibo(a-1) + fibo(a -2); // recursion
    }
 

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.println("Enter the nth Number :  ");
int n = input.nextInt();

System.out.println(fibo(n));
   }
   }