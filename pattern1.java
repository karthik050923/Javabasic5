public class pattern1 {
    public static void main(String[] args) {
       int rows = 5;
for (int i = 0; i < rows; i++) {
    int number = 1;
    for (int j = 0; j < rows - i; j++) {
        System.out.print("  ");
    }
    for (int k = 0; k <= i; k++) {
        System.out.print(number + "   ");
        number = number * (i - k) / (k + 1);
    }
    System.out.println();
}
 
    }

}
