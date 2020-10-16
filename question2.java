package Day14_Lab1;

public class question2 {

	public static void main(String[] args) {
		
		
		love6(11,5);
	}
	public static void love6(int a, int b) {
		if(a==6 || b==6) {
			System.out.println("True");
		}else if((a+b)==6) {
			System.out.println("True");
		}else if((a-b)==6 || (b-a)==6) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
