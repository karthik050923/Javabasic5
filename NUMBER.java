import java.util.Scanner;
public class NUMBER {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();
        
        Number num = new Number();
        num.checkNumber(number);
    }
}

        class Number {
            public void checkNumber(int n) {
                if (n>0) {
                    System.out.println(n +" This is postive number.");
                } else if (n<0) {
                    System.out.println(n +" This is negative number.");
                }
                  else {
                    System.out.println(n +" Number is Zero.");
                }
            }
        }