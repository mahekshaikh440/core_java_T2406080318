
public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	public Employee()
	{
		System.out.println("Default constructor called");
		empId=111;
		empName="Mahek";
		empSalary=24000.34d;
				
	}
	 
	public Employee(int i,String n,double d)
	{
		System.out.println("Prametrized constructor called");
		empId=i;
		empName=n;
		empSalary=d;
		
	}
	public String toString() {
		return "Employee ="+empId+" "+empName+" "+empSalary;
	}
	
	public static void main(String[] args )
	{
		Employee e=new Employee();
		System.out.println(e);
		Employee e1=new Employee(222,"Rahul",10569.654d);
		System.out.println(e1);
	
	}

}
