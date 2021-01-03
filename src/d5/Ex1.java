package d5;

public class Ex1 {

	// 0. 키워드를 붙인다 -> public static void
	// 1. 이름 -> 로직이므로 '동사' 로 만듬  : contains() { ... }
	// 2. 입력되는 값은 새로운 변수로 생각된다
	//     -> ( 타입 이름, 타입 이름 , 타입 이름, ..... )
	// 3. 출력되는 결과 타입 => 이름 없는 변수
									// 입력 받을 데이터
	public static boolean contains(int[] targetArr , int target) {
		boolean result = false;
		
		for (int i = 0; i < targetArr.length; i++) {
			if( targetArr[i] == target ) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
