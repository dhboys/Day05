package Practice;

public class BodyMassIndexMachine {

	public char getResult(float indexValue) {
		if (indexValue > 30) {
			return 'A';
		} else if (indexValue > 24) {
			return 'B';
		} else if (indexValue > 15) {
			return 'C';
		} else {
			return 'G';
		}
	}

	public float calculate(float weight, float height) {

		float hData = height * height;
		float result = weight / hData;
		return result;

	}

	public static void main(String[] args) {
		BodyMassIndexMachine cal = new BodyMassIndexMachine();

		float h = 1.8F;
		float w = 77F;

		float index = cal.calculate(w, h);
		System.out.println(index);
		System.out.println("건강 지수: "+cal.getResult(index));
	}
}
