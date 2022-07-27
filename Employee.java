package Assign1;

public class Employee {
	
	public void employeeName(String name) {
		System.out.println(name);
	}
	public void employeeId(int id) {
		System.out.println(id);
	}
	public void employeeAddress(String address) {
		System.out.println(address);
	}
	public void employeeSalary(double salary) {
		System.out.println(salary);
		}
	
	public void employeeMobileNumber(long mobilenumber) {
		System.out.println(mobilenumber);
	}

	public static void main(String[] args) {
	Employee detail=new Employee();
	detail.employeeName("deva");
	detail.employeeId(001);
	detail.employeeAddress("chennai");
	detail.employeeSalary(20000.00);
	detail.employeeMobileNumber(9876443555L);
	detail.employeeName("sai");
	detail.employeeId(002);
	detail.employeeAddress("Salem");
	detail.employeeSalary(15000.00);
	detail.employeeMobileNumber(9876446555L);
	detail.employeeName("viji");
	detail.employeeId(003);
	detail.employeeAddress("chennai");
	detail.employeeSalary(25000.00);
	detail.employeeMobileNumber(98764445555L);

	}

}
