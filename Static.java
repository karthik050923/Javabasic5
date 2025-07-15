import java.util.Scanner;
public class Static {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String operation = scan.next();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (operation.equals("addition")) {
            System.out.println("Addition: " + MathOperations.addition(num1, num2));
        } else if (operation.equals("subtraction")) {
            System.out.println("Subtraction: " + MathOperations.subtraction(num1, num2));
        } else if (operation.equals("multiplication")) {
            System.out.println("Multiplication: " + MathOperations.multiplication(num1, num2));
        } else if (operation.equals("division")) {
            System.out.println("Division: " + MathOperations.division(num1, num2));
        } 
	}
}
		

		
		
		class MathOperations {
			public static int addition(int a,int b) {
				return a + b;
			}
			public static int subtraction(int a,int b) {
				return a - b;
			}
			public static int multiplication(int a,int b) {
				return a * b;
			}
			public static int division(int a,int b) {
				return a / b;
			}
	}