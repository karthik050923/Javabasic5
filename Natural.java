public class Natural {
    public static void main(String[] args) {
	        
	        Number num = new Number();
	       System.out.println("The Sum of first 50 Natural Number is " + num.naturalNumber(50));
	    }
	}

	        class Number {
	            int naturalNumber(int n) {
	            	int sum = 0;
	            	for(int i=1; i<=50; i++) {
	            		sum+=i;
	            	}
	            	return sum;
	                
	            }
}
