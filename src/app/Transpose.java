package app;

public class Transpose {
	public static void main(String[] args) {
		testMethod();
	}

	public static int[][] transposeArray(int[][] inputArray) {
		// put your code here!
	}

	public static void testMethod() {
		int[][] test1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] test1Output = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

		if (transposeArray(test1).equals(test1Output)) {
			System.out.println("Yay!");
		} else {
			System.out.println("try again!");
		}
	}
}