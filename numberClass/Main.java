package numberClass;

public class Main {

	public static void main(String[] args) {
		Number F = new FractionNumber(3,2);
		FractionNumber fn = new FractionNumber();
		fn.inputNumber();
		F.add();
		F.subtract();
		F.multifly();
		F.divide();
	}

}
