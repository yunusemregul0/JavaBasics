package FinalHazirlik;

public class InheritanceBicyle {
	//the InheritanceBicyle class has three fields
	public int cadence,gear,speed;
	
	//one ctor
	public InheritanceBicyle(int startCadence,int startSpeed,int startGear) {
		gear=startGear;
		cadence=startCadence;
		speed=startSpeed;
	}
	
	//four methods
	public void setCadence(int newValue){
		cadence=newValue;
	}
	public void setGear(int newValue) {
		gear=newValue;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed +=increment;
	}	
	
	
}

