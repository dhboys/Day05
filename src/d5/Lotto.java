package d5;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		
		// p1
		
		// 결과 배열
		
		int[] balls = new int[6];
		
		for (int i = 0; i < balls.length; i++) {
			
			int num = (int)( Math.random() * 45 ) + 1;
			//중복 체크
			
			boolean duplicated = Ex1.contains(balls,  num);
			
			if (duplicated) {
				System.out.println("중복 발생"+ Arrays.toString(balls)+" : " +num);
				i--;
				continue;
			}
			
			balls[i] = num;
			
		} // end for
		System.out.println("--------------------");
		System.out.println(Arrays.toString(balls));
	}
}
