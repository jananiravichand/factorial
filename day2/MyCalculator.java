package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cc= new Calculator();
		int add=cc.add(30,20,10);
		System.out.println(add);
		
		int sub=cc.sub(30, 20);
		System.out.println(sub);
		
		double mul=cc.mul(30, 20);
		System.out.println(mul);
		
		float div=cc.div(30, 20);
		System.out.println(div);
		

	}

}
