package hw6;

public class CalTest {
	public static void main(String[] args) {
		while(true) {
			try {
				Calculator cal = new Calculator();
				cal.powerXY();
				break;
			}catch(CalException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}