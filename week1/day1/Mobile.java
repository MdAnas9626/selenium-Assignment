package week1.day1;

public class Mobile {
	
	public void makecall() {
	String mobileModel = "IQOO";
	float mobileWeight = 185.7f;
	System.out.println(mobileModel+ "/n"+mobileWeight);
	
	}
	
	public void sendMsg() {
		boolean isFullCharged = false;
		int mobileCost =30000;
		System.out.println(isFullCharged+"/n"+ mobileCost);
		
	}
	public static void main(String[]args) {
		Mobile obj = new Mobile();
		obj.makecall();
		obj.sendMsg();
		System.out.println("This is my mobile");
		
	}
	

}
