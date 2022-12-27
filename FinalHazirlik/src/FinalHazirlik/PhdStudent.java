package FinalHazirlik;

public class PhdStudent extends Student {
	int note;
	
	@Override public void successStatus(int note) {
		if (note>=75) {
			System.out.println("Successful");
		}
		else {
			System.out.println("Unsuccessful");
		}
	}
}
