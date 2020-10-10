package Algorithms;
import java.util.*;

public class SumOfElem {

	public static void main(String[] args) {
		int[] array1 = new int[20];
		int[] array2 = new int[20];
		int[] array3 = new int[20];
		int[] array4 = new int[20];
		int[] array5 = new int[20];
		
		long sum1 = 0;
		long sum2 = 0;
		long sum3 = 0;
		long sum4 = 0;
		long sum5 = 0;
		
		Random random = new Random();
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] = random.nextInt(10000));
			System.out.println(array2[i] = random.nextInt(100));
			System.out.println(array3[i] = random.nextInt(10));
			System.out.println(array4[i] = random.nextInt(1));
			System.out.println(array5[i] = random.nextInt());
			
			sum1 += array1[i];
			sum2 += array2[i];
			sum3 += array3[i];
			sum4 += array4[i];		
			sum5 += array5[i];	
			System.out.println("=====================");
		}
		
		System.out.println("Sum1 = " + sum1);
		System.out.println("Sum2 = " + sum2);
		System.out.println("Sum3 = " + sum3);
		System.out.println("Sum4 = " + sum4);
		System.out.println("Sum5 = " + sum5);
	}
}
