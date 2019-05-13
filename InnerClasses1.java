interface mani{
	void fun();
}
class InnerClasses1 {
 public static void main(String[] args) {
 	mani m= new mani(){
 		@Override
 		public void fun(){
 			System.out.println("fun interface");
 		}
 	};
 InnerClasses1 mm = new InnerClasses1();
m.fun();
}
}