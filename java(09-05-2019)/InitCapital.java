import java.util.Scanner;
class InitCapital{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String str = sc.nextLine();
		new InitCapital().capital(str);
        
	}
	void capital(String str ){
	System.out.print(str.toUpperCase().charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                System.out.println(str.toUpperCase().charAt(i+1));
            }
        }    

	}
}