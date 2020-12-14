package week1.day1;

public class Mobile {
	
		String phoneBrand = "Samsung";
		int phoneSize = 10;
		boolean isSmartPhone = false;
		long phoneNum = 7345623456L;
		String modelNum = "M30";
		double phonePrice = 16450.80;
		String simType  = "dual";
		public void makeCall() {
			System.out.println("call connected");
		}
		public void sendSms() {
		
System.out.println("Message sent");
	} 
	
public static void main(String[] args) {
	Mobile mob=new Mobile();
	mob.sendSms();
	mob.makeCall();
	System.out.println(mob.phonePrice);
	System.out.println(mob.phoneBrand);
	System.out.println(mob.modelNum);
	System.out.println(mob.simType);
	System.out.println(mob.phoneNum);
	
}
}
