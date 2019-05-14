import java.util.Scanner;
class TrafficLights extends Thread{
	public static void main(String[] args) {
		TrafficLights td =new TrafficLights();
        td.start();
    }
	@Override
	public void run(){
		try
		{
			Thread.sleep(5000);
			Scanner sc= new Scanner(System.in);
			System.out.println("Please Enter the signal color :");
			String str= sc.nextLine();
			if(str.equalsIgnoreCase("Red")){
				System.out.println("STOP");
			}
			else if(str.equalsIgnoreCase("Orange")){
				System.out.println("READY");
			}
			else
			{
				System.out.println("GO");
			}
		}catch(InterruptedException ie){
			System.out.println("error");
		    



		}
		}
	
}
	
