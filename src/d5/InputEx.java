package d5;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		String str = scanner.nextLine();

		// 상태를 유지하지 않는다...  ex) Arrays.toString()
		System.out.println(str);
		// 문자열을 int로 바꿀 때
		int value = Integer.parseInt(str);
		
		System.out.println(value);
	
	}
}
