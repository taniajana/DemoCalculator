import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		System.out.println("Addition of two numbers ="+(n1+n2));
		
	}
}
