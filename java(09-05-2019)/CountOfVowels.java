import java.util.Scanner;
class CountOfVowels{
	public static void main(String[] args) {
		int count =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str =sc.nextLine();
		String temp = str.toLowerCase();
		for(int i=0;i<temp.length();i++){
			if(temp.charAt(i) =='a' || temp.charAt(i) =='e' ||temp.charAt(i) =='i' ||temp.charAt(i) =='o' ||temp.charAt(i) =='u'  ){
				count++;
			}

        }
		System.out.println("NO of vowels :"+count );
	}

}