class FloatAddition{
	public static void main(String[] args) {
	float num =0;
	int len = args.length;
	
	if(len >1){
	for(int i=0;i<args.length;i++) {
		num += Float.parseFloat(args[i]);
	 }
	 String str = String.format("%.02f",num);
	System.out.println(str);

  }
  else{
  	System.out.println("please Enter minimum two Numbers");
     }
      }
 }