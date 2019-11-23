import java.util.*;

public class HybridSort {
	int min_val = 0;
	static int temp;
	int pos = 0;
	static boolean swapped = true;

//	boolean sorted = false;

	public static void main(String[] args) {
		


		int[] A = {12,22,1,110, 5, 3, 9, 8, 7, 6,0,29};
		int[] A2 = {11,2,3,5,2,1,1,0};
		int[] B = {1,2,3};
		int[] B2 = {2,2,2,2,2,2};
		int[] B3 = {2,-2,2,-2,2,2,-2};


		

		System.out.println("Original array: " + Arrays.toString(A));
		System.out.println();

//		A = HybridSort(A);

		System.out.println("Array sorted: " + Arrays.toString(A));
		System.out.println();
		
		HybridTest(A);
		HybridTest(B3);



	}
	public static void HybridTest(int[] arr) {
		int n = arr.length;
		boolean bswap = false;
		for (int a = 0; a < n; a++) { //First iteration for both Bubbles and Selection
			for (int b = 1; b < n; b++) { //Second iteration for bubbleSort
				if (arr[b-1] > arr[b]) {
					// Swap since the second element is larger than the first element
					int temp = arr[b-1];
					arr[b-1] = arr[b];
					arr[b] = temp;
					bswap = true;

				}
			}
			int min_index = a;
			for (int c = a+1; c < n; c++) {
				if (arr[c] < arr[min_index]) {
					min_index = c;
				}
				int temp = arr[min_index];
				arr[min_index] = arr[a];
				arr[a] = temp;
			}
			
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void BubbleSort(int [] bs_array){ //Create an array for the bubble sort function
		System.out.println("------------ Bubble Sort ------------");
		int ArrayLength = bs_array.length; //Length of the array
//		System.out.println(ArrayLength);
		swapped = false;
		for (int i = 0; i < ArrayLength; i++) { //first for loop to go through the first bubble sort 
			for (int x = 1; x < ArrayLength; x++) { //second for loop which will allow swapping between two different elements
				if (bs_array[x - 1] > bs_array[x]) { 
					temp = bs_array[x-1];
					bs_array[x-1] = bs_array[x];
					bs_array[x] = temp;
					swapped = true;
				}
			
			} 
			System.out.println(Arrays.toString(bs_array));   // printing arrays using helper methods

		} 
	}

	public static void SelectionMod(int[] ss_array) {
		int ss_ArrayLength = ss_array.length;
		int pos_min;
		int ss_swapped;
		int min_index;
	
		for (int a = 0;a < ss_ArrayLength;a++) {
			//		Finding the minimum in the unsorted array
			min_index = a;
			for (int b = a+1; b < ss_ArrayLength; b++) {
				if (ss_array[b] < ss_array[min_index]) { // Comparing if the element is smaller than the minimum index number
					min_index = b;
				}
				
				//Smallest element is found --> Swapping the smallest element
				int ss_temp = ss_array[min_index];
				ss_array[min_index] = ss_array[a];
				ss_array[a] = ss_temp;
		
				}
			}
		}
	//After using bubble sort 
	//The largest element goes to the far right.
	
	//Implementing Selection Sort modification to allow minimum value to go to the far left first.
	public static void SelectionSort(int[] ss_array) {
		int ss_swapped;
		int min_index;
//		System.out.println("------------ Selection Sort ------------");
		
		int ss_ArrayLength = ss_array.length;
		int pos_min;

		//Finding subarray boundary
		
		for (int a = 0;a < ss_ArrayLength;a++) {
			//		Finding the minimum in the unsorted array
			min_index = a;
			for (int b = a+1; b < ss_ArrayLength; b++) {
				if (ss_array[b] < ss_array[min_index]) { // Comparing if the element is smaller than the minimum index number
					min_index = b;
				}
				
				//Smallest element is found --> Swapping the smallest element
				int ss_temp = ss_array[min_index];
				ss_array[min_index] = ss_array[a];
				ss_array[a] = ss_temp;

			}
			System.out.println(Arrays.toString(ss_array));   // printing arrays using helper methods


		}
//		System.out.println(Arrays.toString(ss_array));   // printing arrays using helper methods
//

	}
	
		
	public static void HybridSort(int[] HybridArray) {
		System.out.println("------------ Hybrid Sort ------------");
		
		//Bubble Sort Modification
		int HybridArrayL = HybridArray.length; //Finding the length of the hybrid array
		int HybridTemp;
	
		//Initialising swap to false
		boolean HybridSwap = false;
		//This section allows the last element to go the last array
		for (int i = 0; i < HybridArrayL; i++) { //Will require to iterations to be able to find the largest element
//			SelectionSort(HybridArray);
			for (int x = 1; x < HybridArrayL; x++) {
				if (HybridArray[x - 1] < HybridArray[x]) {
					//Swapping and adding the largest element on the far left of the array
					HybridTemp = HybridArray[x-1];
					HybridArray[x - 1] = HybridArray[x];
					HybridArray[x] = HybridTemp;
					HybridSwap = true;
//					System.out.println(Arrays.toString(HybridArray));
					
				}
			}

			for (int x = 1; x < HybridArrayL; x++) {
				if (HybridArray[x - 1] > HybridArray[x]) {
					//Swapping and adding the largest element on the far left of the array
					HybridTemp = HybridArray[x-1];
					HybridArray[x - 1] = HybridArray[x];
					HybridArray[x] = HybridTemp;
					HybridSwap = true;
//					System.out.println(Arrays.toString(HybridArray));
					
				}
//				BubbleSort(HybridArray);
				System.out.print("Hybrid TEST");
//				System.out.println(Arrays.toString(HybridArray));

//				System.out.println("Selection Sort CALLED");
//
			}
			System.out.println(Arrays.toString(HybridArray));
		
//				BubbleSort(HybridArray);
				System.out.print("Hybrid TEST2");
//				System.out.println(Arrays.toString(HybridArray));

//				System.out.println("Selection Sort CALLED");
//
			}
		}
	}
//		for (int a = 0; a < a-1; a++) {
//			//Finding the minimum element 
//			
//			int HybridMinIndex = a;
//			for (int b = a + 1; b < HybridArrayL; b++) {
//				if (HybridArray[b] < HybridArray[HybridMinIndex]) { //Comparing the two elements to see if its smaller
//					HybridMinIndex = b; //Replacing the value of MinIndex if it is bigger
//				}
//				
//				//Smallest element is Found --> Swapping 
//				int HybridSTemp = HybridArray[HybridMinIndex];
//				HybridArray[HybridMinIndex] = HybridArray[a];
//				HybridArray[a] = HybridSTemp;
//				System.out.println("------------ Selection Sort ------------");
//
//				
//			}
//		}
//		System.out.println(Arrays.toString(HybridArray));   // printing arrays using helper methods
//
//	}



