package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=155;
		int orginalInput=input;
		int sum=0;
		while(input>0) {
			int rem=(input%10);
			sum=sum+(rem*rem*rem);
			input=input/10;
			
		}
		if(sum==orginalInput) {
			System.out.println("given num is Armstrng num");
		}
		else {
			System.out.println("not armstrng num");
		}

	}

}
