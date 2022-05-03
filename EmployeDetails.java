package week1.day2;

public class EmployeDetails {

	public void printEmployeeName(String empName, int empId) {
	System.out.println(" empName & empId " + empName +" "+ empId);

	}

	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee address: "+ empAddress);

	}

	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee salary: "+ empSalary);


	}
	 public void printEmployeeMobileNumber(long mobNum) {
		 System.out.println("Employee number: "+ mobNum);


	}



	public static void main(String[] args) {

		EmployeDetails obj=new EmployeDetails();

		obj.printEmployeeName("aravind", 00157);
		obj.getEmployeeAddress("besant,aefs,dgfjsgf -123654");
		obj.printEmployeeSalary(54654);
				obj.printEmployeeMobileNumber(996260);

	}

}