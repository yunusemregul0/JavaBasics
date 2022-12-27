package FinalHazirlik;

public abstract class Student {
	private int number,classNumber;
	
	public void setNumber(int number) {
		this.number=number;
	}
	public abstract void successStatus(int number);
}
