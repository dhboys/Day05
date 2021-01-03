package Practice;

public class BokBulBokTest {

	public static void main(String[] args) {
		
		BokBulBok run = new BokBulBok();
		// 복불복 기계안에 준비작업
		run.ready();
		
		// 10번 결과를 확인해본다.
		// 그 중에 한번은 x가 나와야한다.
		for (int i = 0; i < 10; i++) {
			char result = run.selectOne();
			System.out.println(i+"번째: "+result);
		}
		
	}
}
