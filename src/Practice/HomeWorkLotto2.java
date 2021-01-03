package Practice;

import java.util.Arrays;

public class HomeWorkLotto2 {

	public static void main(String[] args) {
		// 결과와 전체 배열을 만들어준다.
		
		int[] balls = new int[45];
		int[] result = new int[6];
		
		// 전체 배열의 각 인덱스를 채워준다
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;	
		}
		
		// 랜덤한 숫자를 뽑는 for loop만들기
		
		for (int i = 0; i < result.length; i++) {
			int num = (int)(Math.random() * 45  );
			
			if ( balls[num] == -1 ) {
				i--;
				continue;
			}
			result[i] = num;
			balls[num] = -1;
		}
		System.out.println(Arrays.toString(result));
	}
}
