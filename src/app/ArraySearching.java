package app;

import java.util.Random;

public class ArraySearching {
	public static void main(String[] args) {
		testMethod();
	}

	public static boolean doesArrayContain(int[][] matrix, int target) {
		// put your code here!
	}

	public static void testMethod() {
		int[][] testCase1 = random2DArrayTrue();
		int[][] testCase2 = random2DArrayFalse();

		
		if (doesArrayContain(testCase1, 1) && !doesArrayContain(testCase2, 1)) {
			System.out.println("You did it!!!");
		} else {
			System.out.println("try try again!");
		}

	}

	public static int[][] random2DArrayTrue() {
		Random r = new Random();
		int[][] array = random2DArrayFalse();
		array[r.nextInt(20)][r.nextInt(20)] = 1;
		return array;
	}

	public static int[][] random2DArrayFalse() {
		int[][] array = new int[20][20];
		return array;
	}
}