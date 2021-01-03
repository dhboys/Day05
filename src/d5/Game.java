package d5;

import java.util.Scanner;

public class Game {
	// static 은 class에 붙는다.
	// String을 붙인건 출력값이 문자열이므로
	public static String showName(int number) {
		String result = "";
		switch (number) {
		case 0:
			result = "가위";
			break;
		case 1:
			result = "바위";
			break;
		case 2:
			result = "보";
			break;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int winStreak = 0;
		char before = 'S';

		while (winStreak <= 3) {

			System.out.println("가위=0, 바위=1, 보=2");

			int user = scanner.nextInt() % 3;

			String userStr = showName(user);
			System.out.println(showName(user));

			int com = (int) (Math.random() * 3);
			System.out.println(showName(com));

			// 승무패 로직
			int gap = (com - user) < 0 ? (com - user) + 3 : com - user;

			String gameResult = "";
			if (gap == 2) {
				gameResult = "W";

				if (before == 'U') {
					winStreak++;
				} else {
					before = 'U';
					winStreak = 1;
				}
			} else if (gap == 1) {
				gameResult = "L";

				if (before == 'C') {
					winStreak++;
				} else {
					before = 'C';
					winStreak = 1;
				}
			} else if (gap == 0) {
				gameResult = "D";
			}
			System.out.println("RESULT: " + gameResult);

		} // end while

	}
}
