public class Square {
    public static void main(String[] args) {
	        
	        Number num = new Number();
	       System.out.println("The Sum of Square of first 20 Natural Number is " + num.squareNumber(20));
	    }
	}

	        class Number {
	            int squareNumber(int n) {
	            	int sum = 0;
	            	for(int i=1; i<=n; i++) {
	            		sum=sum+(i*i);
	            	}
	            	return sum;
	                
	            }
            }
