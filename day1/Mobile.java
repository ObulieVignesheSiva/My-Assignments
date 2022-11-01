package week1.day1;

public class Mobile {
	/*
	 * 
	 * *
	 *- Create package name as week1.day1 under src/main/java
	- Crate a  new class as "Mobile" under week1.day1
	- Create 2 methods (makeCall() , sendMsg()) with simple print statement
	- In first method create variable  mobileModel (String),mobileWeight (float)
	- In second method create variable  isFullCharged (boolean),mobileCost (int)
	- Create main method
	Create object for class and call  from main method and print them
	- print a statement---->"This is my mobile";
	-run and confirm the output printed in console
	**
	*
	*/
	public void makeCall() {
		String mobileModel="Samsung";
		float mobileweight=50.5f;
		System.out.println("makeCall");
		}
	public void sendMsg() {
		boolean isFullyCharged=true;
		int mobileCost=18000;
		System.out.println("sendMsg");
		}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is My Mobile");
		}

}
