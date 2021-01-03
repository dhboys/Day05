package Practice;

public class PigSaveTest {

	public static void main(String[] args) {
		
		PigSave save = new PigSave();
		save.deposit(100);
		save.deposit(500);
		
		int totalMoney = save.getTotal();
		
		totalMoney = 10000;  // 강제로 변경
		System.out.println(totalMoney);
		
		int afterMoney = save.getTotal();
		System.out.println(afterMoney);
		
	}
}
