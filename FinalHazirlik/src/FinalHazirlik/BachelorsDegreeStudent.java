package FinalHazirlik;

public class BachelorsDegreeStudent extends Student {
	int note;
	
	@Override public void successStatus(int note) {
		if (note>=50) {
			System.out.println("Successful");
		}
		else {
			System.out.println("Unsucccessful");
		}
	}
}
