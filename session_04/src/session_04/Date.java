package session_04;

public class Date {
	
	private int dd,mm,yy;
	private final float Pi=3.1412f;
	
//	public Date{
//		pi=3.14;
//	}
	
	public Date(int dd,int mm,int yy)
	{
//		pi=3.14f;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
//	public static void main(String[] args) {
//		final Date bdate=new Date(1,1,18);
//		bdate=new Date(1,2,80);
//	}
//	
}
