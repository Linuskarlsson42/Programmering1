package sortering;

import java.util.Arrays;

public class Sort {

	
	public static void bubblesort(int[] array) {
		int comparisons = 0;
		int swaps = 0;
		boolean hasSwapped = true; 
		for (int j = 0; j < array.length && hasSwapped; j++) {
			hasSwapped = false;
		for (int i = 0; i < array.length - 1 - j; i++) {
			comparisons++;
			if(array[i] > array[i+1]) {
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
				swaps++;
				hasSwapped = true;
			}
			
		}
		}
		System.out.println("comparisons: " + comparisons);
		System.out.println("swaps: " + swaps);
	}
	public static void insertionsort(int[] array) {
		for (int j = 0; j < array.length; j++) {
			int min = array[j];
			int index = j;
			for (int i = j+1; i < array.length; i++) {
				if (min > array[i]) {
					min = array[i];
					index = i;
				}
			}
			int temp = array[j];
			array[j] = array[index]; //array[index] = min
			array[index] = temp;
		}
	}
}
