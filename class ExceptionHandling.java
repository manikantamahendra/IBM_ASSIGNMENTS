import java.lang.Scanner;
class ExceptionHandling{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter first number :");
		int first = sc.nextInt();
		System.out.println("Please enter Second number :");
		int second=sc.nextInt();
      ExceptionHandling eh = new ExceptionHandling();
      eh.exception1(first,second);
 
	}
	void exception1(int first,int second){
		try{
			int result;
		result = first / second;
		System.out.println("result is "+result);
        }
        catch(ArithmeticException ae){
			System.out.println("dont enter zero in remainder");
		}
		catch(NumberFormatException nfe){
			System.out.println("Number only");
		}
		
}

	}
	
}