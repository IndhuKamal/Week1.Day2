package week1.day2;

public class EmployeeDetails {
	public void printEmployeeName(String empName,int empId) {
		System.out.println(empName + empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
    public void printEmployeeSalary(double empSalary) {
    	System.out.println(empSalary);
    }
    public void printEmployeeMobileNumber(long mobNum) {
    	System.out.println(mobNum);
    
}
    public static void main(String[] args) {
    	EmployeeDetails emp = new EmployeeDetails();
    	emp.printEmployeeName("KKK ", 100);
		emp.getEmployeeAddress("Chennai");
		emp.printEmployeeSalary(100000);
		emp.printEmployeeMobileNumber(9898678655l);
	}
}