class CommandLineAddition{
public static void main(String[] args) {
	int num =0;
	int len = args.length;
	if(len >1){
	for(int i=0;i<args.length;i++) {
		num += Integer.parseInt(args[i]);
	 }
	System.out.println( "The addition of numbers is :" +num);

  }
  else{
  	System.out.println("please Enter minimum two Numbers");
  }
}

	
}