public class PrimeCheck {
    int num;

    PrimeCheck(int n) {
        num = n;
    }

    public void checkPrime() {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }

    public static void main(String[] args) {
        PrimeCheck obj = new PrimeCheck(17);
        obj.checkPrime();
    }
}
