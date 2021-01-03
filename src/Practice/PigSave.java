package Practice;

public class PigSave {
	
	// private 사용하면 클래스의 범위 밖에서는 사용x
	private int total;             // 인스턴스 변수 = 데이터
	public int getTotal() {
		return total;
	}
	
	public void deposit(int amount) {            // 메서드
		System.out.println("저금통 입금");
		total = total + amount;
	}
	
	public void withdraw() {                     // 메서드
		System.out.println("저금통 출금");
	}
}
