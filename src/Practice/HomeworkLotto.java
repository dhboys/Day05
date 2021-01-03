package Practice;

public class HomeworkLotto {

	public static void main(String[] args) {

		int ballCount = 45;
		int[] balls = new int[ballCount];

		for (int i = 0; i <= ballCount; ++i) {
			balls[i] = 1 + i;
		}

		for (int i = 0; i < 6; ++i) {
			int randomNum = (int) (Math.random() * ballCount );
			int temp = balls[randomNum];
			balls[randomNum] = balls[ballCount - 1];
			balls[ballCount - 1] = temp;
			--ballCount;
		} // end for

		for (int i = 0; i < 6; ++i) {
			System.out.println("당첨번호: "+balls[ballCount + i]);
		}
	}

}
