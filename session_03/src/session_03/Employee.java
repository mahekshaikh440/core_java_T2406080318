package session_03;

public class Employee {
	private int empNo;
	private float salary;
	private  static float totalSalary;
	public static int count;
	public Employee() {}
	public Employee(float salary) {
		this.empNo=count++;
		this.salary=salary;
		totalSalary+=salary;
		
	}
	public static int getCount()
	{

		return count ;
	}
	public String toString() {
		return "Employee [empNo="+empNo+", "+"Salary="+salary+"]";
	}

	public static void main(String[] args) {
		Employee e1=new Employee(1000.37f);
		System.out.println(e1);
		Employee e2=new Employee(2000.37f);
		System.out.println(e2);
		Employee e3=new Employee(3000.37f);
		System.out.println(e3);
		System.out.println("total employee= "+Employee.getCount());
		System.out.println("total salary="+ totalSalary);
		
	}
}
