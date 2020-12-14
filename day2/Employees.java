package week1.day2;

public class Employees {
	 public void printEmployeeAddress(String empName) {
		 System.out.println(empName);
		System.out.println("Chennai");

	}
	public void printEmployeePhoneNumber(String empName, int Id) {
		System.out.println(73392);
		
	}
	public String getEmployeeName(int empId) {
		String name;
		if(empId==001) {
			name="Janu";
		}
		else {
			name="na";
		}
		return name;

	}

	public static void main(String[] args) {
		Employees emp =new Employees();
		//emp.printEmployeeAddress("Janu");
		//emp.printEmployeePhoneNumber("Janu", 001);
		String empName = emp.getEmployeeName(001);
System.out.println(empName);
	
	}
	}
	
