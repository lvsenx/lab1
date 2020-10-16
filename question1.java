package Day14_Lab1;

public class question1 {

	public static void main(String[] args) {
		
		String a="Hi";
		int b =36;
		stringTimes(a,b);
	}
	public static void stringTimes(String a,int b) {
		for(int i=1; i<=b;i++) {
			System.out.print(a);
		}
	}
}
