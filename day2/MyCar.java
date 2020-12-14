package week1.day2;

public class MyCar {
	public void soundHorn() {
		
System.out.println("applied horn");
	}

	public static void main(String[] args) {
		OwnCar obj=new OwnCar();
		obj.applyBrake();
		MyCar mc=new MyCar();
		mc.soundHorn();
		
	}

}
