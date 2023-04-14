package Lab1;
import java.util.*;
public class ArrProcessing {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = inp.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
		Arrays.sort(arr);
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double average = sum / arr.length;
		System.out.println("Sorted arrat: " + Arrays.toString(arr));
		System.out.println("Sum: " + sum);
		System.out.println("Average value: " + average);
	}
}
