public class Factorial {
    int num;

    Factorial(int n) {
        num = n;
    }

    public void calculateFactorial() {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial(5);
        obj.calculateFactorial();
    }
}
