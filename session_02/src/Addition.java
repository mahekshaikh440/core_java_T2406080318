
public class Addition {
	public void add(int a,int b)
	{
		System.out.println("add="+(a+b));
		
	}
	public float add(float a,float b) 
	{
		float f=a+b;
		return f;
				
	}
	public int add(int a,int b,int c) {
		return (a+b+c);
	}
	
	  public int add(int... a)
	  {
	     int sum=0;
	    int len=a.length;
	   System.out.println("Length="+len);
	 
	for(int i:a)
	{
		sum+=i;
		
	}
	return sum;
	  }
	public static void main(String[] args )
	{
		Addition a=new Addition();
		a.add(10,20);
		System.out.println("Sum="+a.add(10.2f,30.4f));
		int addition=a.add(10,20,20);
		System.out.println("Addition="+addition);
		
		System.out.println("sum="+a.add(1,2,3,4,5,6,7));
	}
}
