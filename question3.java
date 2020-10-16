package Day14_Lab1;

public class question3 {

	public static void main(String[] args) {
		
		specialEleven(23);
	}
	public static void specialEleven(int a) {
		if(a==1) {
			System.out.println("False");
		}else if(a%11==0 || a%11==1){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
