package Algorithms;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,5,95,0,-41};
		int[] arr2 = {72,621,-7,12};
		int[] array1 = new int[arr1.length + arr2.length];
		int[] array2 = new int[arr1.length + arr2.length];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.arraycopy(arr1, 0, array1, 0, arr1.length);
		System.arraycopy(arr2, 0, array1, arr1.length, arr2.length);
		System.out.println(Arrays.toString(array1));
		
		for(int i = 0; i < arr1.length; i++) {
			array2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			array2[arr1.length + i] = arr2[i];
		}		
		
		System.out.println(Arrays.toString(array2));
		
	}
}
