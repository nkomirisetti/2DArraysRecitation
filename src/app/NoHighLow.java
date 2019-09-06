package app;

import java.util.ArrayList;
import java.util.Arrays;

public class NoHighLow {
	public static void main(String[] args) {
		testMethod();
	}

	public static ArrayList<Integer> removeHighLow(ArrayList<Integer> input) {
		// put your code here!
	}

	public static void testMethod() {
		ArrayList<Integer> test1 = new ArrayList<>(Arrays.asList( 1, 6, 5, 3, 10, 7, 5, 3 ));
		ArrayList<Integer> test1Output = new ArrayList<>(Arrays.asList( 6, 5, 3, 7, 5, 3 ));

		if (!removeHighLow(test1).contains(10) && !removeHighLow(test1).contains(1)) {
			System.out.println("Yay!");
		} else {
			System.out.println("try again!");
		}
	}
}
