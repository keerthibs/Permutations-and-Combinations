/**
 * Created by Keerthi Bala Sundaram on 04/11/16.
 * FileName - Driver.java
 * Class - Driver
 * Description - The main driver program that calls the Combination and Permutations Methods in their respective classes
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
        int choice;
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Permutations");
            System.out.println("2. Combinations");
            System.out.println("Anything else for Exit");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the value for n");
                    n = scanner.nextInt();

                    double permuteTimeTaken = Permutation.permuteTake2(n);
                    double heapsTimeTaken = Permutation.heapsPermute(n);

                    System.out.println("\nPermute Take 2 | Time Taken - " + permuteTimeTaken + " seconds");
                    System.out.println("Heaps Algorithm | Time Taken - " + heapsTimeTaken + " seconds\n");
                    break;

                case 2:
                    System.out.println("Enter the value for n");
                    n = scanner.nextInt();
                    System.out.println("Enter the value for K");
                    int K = scanner.nextInt();

                    //Pre-Condition - A Boolean Array filled with False value
                    boolean[] array = new boolean[n + 1];
                    Arrays.fill(array,false);

                    Combinations.combination(array, n, K);
            }
        }while(choice==1 || choice==2);
	}
}
