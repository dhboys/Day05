package Practice;

public class Sum {

	public int makeSum(int startValue ,int endValue) {
		int start = startValue;
		int end = endValue;
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		} // end for
		System.out.println("시작값: " + start);
		System.out.println("종료값: " + end);
		return sum;
	}// end makeSum메소드

	public static void main(String[] args) {

		Sum m = new Sum();
		int return1 = m.makeSum(1,100);
		int return2 = m.makeSum(2,200);
		int return3 = m.makeSum(3,300);
		
		System.out.println(return1);
		System.out.println(return2);
		System.out.println(return3);
		
	
	}
}
