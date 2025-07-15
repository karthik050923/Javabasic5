public class charpattern {
    public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			char x = 'A';
			for(int j=4; j>=i; j--) {
			System.out.print(x);
			x++;
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			char x = 'A';
			for(int j=1; j<=i; j++) {
			System.out.print(x);
			x++;
			}
			System.out.println();
		}


        char x = 'A';
		for(int i=1; i<=3; i++,x++) {
			for(int j=1; j<=i; j++) {
			System.out.print(x);
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--,x--) {
			for(int j=1; j<=i; j++) {
			System.out.print(x);
			}
			System.out.println();
		}
	}
}
