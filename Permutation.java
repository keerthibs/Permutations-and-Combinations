/**
 * Created by Monish Kumar on 04/12/16.
 * FileName - Permutation.java
 * Class - Permutation
 * Description - The Class file for Permutations.
 *               Has two important methods - permuteTake2 (which implements the second take taught in class)
 *                                           heapsPermute (which implements Heaps algorithm)
 */
import java.util.Arrays;

public class Permutation {

    /*
     * @method permuteTake2
     *         Overloaded function that is called from the main driver.
     *         Populates an array as needed and calls another function
     *         Returns the time taken to print the permutations
     */
    static double permuteTake2(int n) {
        long startTime, elapsedTime;
        int[] filledArray = new int[n+1];
        for (int i = 0; i <= n; i++) {
            filledArray[i] = i;
        }
        startTime = System.nanoTime();
        permuteTake2(filledArray, n);
        elapsedTime = System.nanoTime() - startTime;
        return (double)elapsedTime/1000000000.0;
    }

    /*
     * @method permuteTake2
     *         Overloaded function that implements the actual logic
     *         Calls visit to print the permutations
     */
    static void permuteTake2(int[] A, int n) {
        if(n==0)
            visit(A);
        else {
            for(int j=1;j<=n;j++) {
                swap(A, j, n);
                permuteTake2(A, n-1);
                swap(A, j, n);
            }
        }
    }

    /*
     * @method heapsPermute
     *         Overloaded function that is called from the main driver.
     *         Populates an array as needed and calls another function
     *         Returns the time taken to print the permutations
     */
    static double heapsPermute(int n) {
        long startTime, elapsedTime;
        int[] filledArray = new int[n];
        for (int i = 1; i <= n; i++) {
            filledArray[i-1] = i;
        }
        startTime = System.nanoTime();
        heapsPermute(filledArray, n);
        elapsedTime = System.nanoTime() - startTime;
        return (double)elapsedTime/1000000000.0;

    }

    /*
     * @method heapsPermute
     *         Overloaded function that implements the actual logic and prints the permutations
     */
	static void heapsPermute(int[] A, int n) {
		if (n == 1)
			System.out.println(Arrays.toString(A));
		else {
            for(int i=0; i<n; i++) {
                heapsPermute(A, n-1);
                if (n % 2 == 0)
                    swap(A, i, n-1);
                else
                    swap(A, 0, n-1);
            }
		}
	}

    /*
     * @method swap
     *         Uses a single extra space to swap two values in an array
     */
	static void swap(int[] arrayToSwap, int i, int j) {
		int temp;
        temp = arrayToSwap[i];
        arrayToSwap[i] = arrayToSwap[j];
        arrayToSwap[j] = temp;
	}

    /*
     * @method visit
     *         Used to print the values in an array
     */
    static void visit(int[] array) {
        int arrayLength = array.length;
        for(int i=1; i<arrayLength;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }
}
