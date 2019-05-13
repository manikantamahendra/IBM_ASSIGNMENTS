interface mani{
	void fun();
}
class manikanta {
 public static void main(String[] args) {
 	mani m= new mani(){
 		@Override
 		public void fun(){
 			System.out.println("fun interface");
 		}
 	};
 manikanta mm = new manikanta();
m.fun();
}
}