package d5;

import java.util.Arrays;

public class CopyEx {

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,4,5,6,7,8,9 };
		
		int[] arr2 = new int[5];
		
		// arraycopy는 static
		System.arraycopy(arr, 0, arr2, 0, 5);
		System.out.println(Arrays.toString(arr2));
	}
}
