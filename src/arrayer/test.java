package arrayer;

import java.util.Arrays;

import sortering.Sort;

public class test {
	public static void main(String[] args) {
		int[] tal = {41,5,5,3,23,5,5,3,3,2,2,4,4,2,22};
		Sort.insertionsort(tal);
		System.out.println(Arrays.toString(tal));
		
		
	}
}
