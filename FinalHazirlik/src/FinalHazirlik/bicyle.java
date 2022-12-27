package FinalHazirlik;

public class bicyle {
	int cadence=0;
	int speed=0;
	int gear=1;
	
	void changeCadence(int newValue) {
		cadence=newValue;
	} 
	void changeGeart(int newValue) {
		gear=newValue;
	}
	void speedUp(int increment) {
		speed=speed+increment;
	}
	void applyBrakes(int decrement) {
		speed=speed-decrement;
	}
	void printStates() {
		System.out.println("cadence:"+cadence+" speed:"+speed
				+" gear:"+gear);
	}
}
