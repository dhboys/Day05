package Practice;

public class MakeCalculator {

	public int add(int x, int y) {
		int start = x;
		int end = y;
		int add = start + end;
	
		return add;
	}
	
	public static void main(String[] args) {
		
		MakeCalculator a = new MakeCalculator();
		int result1 = a.add(2,5);
		System.out.println("두 수의 합: "+result1);
		
	}
}
