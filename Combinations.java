/**
 * Created by Keerthi Bala Sundaram on 04/12/16.
 * FileName - Combinations.java
 * Class - Combinations
 * Description - The Class file for Combinations.
 *               Has two methods - combination (which implements the algorithm taught in class)
 *                                 visit (which prints the combinations)
 */
public class Combinations {

	static int count = 0;

    /*
     * @method visit
     *         Used to print the values in an array
     */
	static void visit(boolean[] array) {
		int length = array.length;
		for (int i = 1; i < length; i++) {
			if (array[i]) {
				System.out.print(i+" ");
			}
		}
		count++;
		System.out.println();
	}

    /*
     * 
     *         Function that implements the actual logic and calls the visit function for printing
     */
	static void combination(boolean[] array, int n, int K) {
		if (K > n) {
			return;
		} else if (K == 0) {
			visit(array);
		} else {
			combination(array, n - 1, K);
			array[n] = true;
			combination(array, n - 1, K - 1);
			array[n] = false;
		}
	}
}
