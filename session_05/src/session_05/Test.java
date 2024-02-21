package session_05;

public class Test {
	public static void main(String[] args) {
	int[] arr=new int[5];
	System.out.println(arr[0]);
	//arr[0]=1;
	//arr[1]=2;
	for (int i=0;i<=4;i++) {
		arr[i]=i+1;
		
	}
	System.out.println("Arrays element are as follow: ");
	for(int a:arr) {
		System.out.println(a);
	}
	}

}
