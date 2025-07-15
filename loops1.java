public class loops1 {
    public static void main(String[] args) {
        for(int j=1; j<=5; j++) {
			if(j==2)
				System.out.println("KKK");
			for(int i=1; i<=3; i++) {
				System.out.println(i +" karthik");
				if(j==3)
					continue;
					System.out.println("MV");
			}	
			if(j==4)
				break;
		}
    }
}
