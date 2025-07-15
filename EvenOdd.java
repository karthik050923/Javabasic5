public class EvenOdd {
    int num;

    EvenOdd(int n) {
        num = n;
    }

    public void checkEvenOdd() {
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd(10);
        obj.checkEvenOdd();
    }
}
