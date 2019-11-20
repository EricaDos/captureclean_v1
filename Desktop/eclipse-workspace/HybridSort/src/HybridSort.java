import java.util.*;

public class HybridSort {
	int min_val = 0;
	static int temp;
	int pos = 0;
	static boolean swapped = true;
//	boolean sorted = false;

	public static void main(String[] args) {
		


		int[] A = {1,110, 5, 3, 9, 8, 7, 6,0};
		int[] A2 = {1,2,3};

		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

//		A = HybridSort(A);

		System.out.println("Array sorted: " + Arrays.toString(A));
		System.out.println();
		
		BubbleSort(A);
		BubbleSort(A2);
	}
	
	

}

