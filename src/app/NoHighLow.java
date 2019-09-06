package app;

public class NoHighLow {
	 public static void main(String[] args) {
	        testMethod();
	    }

	    public static int[] removeHighLow(int[] inputArray){
	        // put your code here!
	    }

	    public static void testMethod(){
	        int[] test1 = {1,6,5,3,7,5,3,10};
	        int[] test1Output = {6,5,3,7,5,3};

	        if (removeHighLow(test1).equals(test1Output)){
	            System.out.println("Yay!");
	        } else{
	            System.out.println("try again!");
	        }
	    }
}
