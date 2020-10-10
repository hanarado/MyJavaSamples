// 배열내 순서 바꾸기, 처음과 끝, 두번째와 끝에서 두번째 등...

package Algorithms;

import java.util.*;

public class ArrayFlipping {

	public static void main(String[] args) {
		int[] array = { 5, 4, 8, 0, -1, 6, 11 };
		
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		System.out.println(Arrays.toString(array));
	}

}
