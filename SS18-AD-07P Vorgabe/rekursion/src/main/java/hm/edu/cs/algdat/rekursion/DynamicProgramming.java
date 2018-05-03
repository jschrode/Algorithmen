package hm.edu.cs.algdat.rekursion;

public class DynamicProgramming {

	protected static final int[] WEEKENDS = { 20, 18, 26, 16, 7, 6, 18, 21, 17, 14, 13, 21, 17, 18, 5, 25, 28, 20, 9,
			22, 28, 29, 15, 28, 10, 8, 6, 21, 5, 11, 28, 16, 5, 22, 21, 5, 12, 25, 27, 22, 20, 11, 16, 15, 11, 24, 22,
			18, 29, 13, 15, 23 };

	protected static final int[] DEMO = { 2, 4, 1, 1, 5, 6, 2 };

	public static void main(String[] args) {
//		System.out.println(maxSumWithDistanceRecursive(WEEKENDS, 4));
//		System.out.println(maxSumWithDistanceDynamic(WEEKENDS, 4));
//		System.out.println(maxSumWithDistanceRecursive(DEMO, 3));
//		System.out.println(maxSumWithDistanceDynamic(DEMO, 3));
	}

	public static int maxSumWithDistanceRecursive(int[] array, int distance) {
		if (array.length == 0) return 0;
		return maxSumWithDistanceRecursive(array, distance, array.length - 1);
	}

	private static int maxSumWithDistanceRecursive(int[] array, int distance, int index) {
		// TODO: Aufgabe 2.1
		return 0;
	}

	public static int maxSumWithDistanceDynamic(int[] array, int distance) {
		if (array.length == 0) return 0;
		int n = array.length;
		int[] sums = new int[n];
		
		// TODO: Aufgabe 2.2
		
		return sums[n - 1];
	}

}
