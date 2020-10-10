package Algorithms;

import java.util.*;

public class ArrayAvgValue {

	public static void main(String[] args) {
		int[] array = new int[20];
		double average1;
		double average2;
		long sum = 0;

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10000);
		}

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		average1 = sum / array.length;
		average2 = (double) sum / array.length;
		
		System.out.println("Average 1 = " + average1);
		System.out.println("Average 2 = " + average2);
	}
}
