package inheritance;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpInfo("Vimal","E001", "234223");
		e.displayEmpInfo();
		
		Manager mgr = new Manager();
		
		mgr.setMgrInfo("Anvay","E002", "234234", "Comp");
		
		mgr.displayMgrInfo();
		
	}

}

class Employee {
	String name;
	String empId;
	String salary;
	
	public void displayEmpInfo(){
		System.out.println("Emp: "+empId);
		System.out.println("Emp Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
	public void setEmpInfo(String n, String eId, String sal){
		name = n;
		empId = eId;
		salary = sal;
	}
}

class Manager extends Employee {
	String dept;
	
	public void displayMgrInfo(){
		displayEmpInfo();
		System.out.println("Dept: "+dept);
	}
	
	public void setMgrInfo(String n, String eId, String sal, String d){
		setEmpInfo(n, eId, sal);
		dept = d;
	}
}