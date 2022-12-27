package FinalHazirlik;

public class InheritanceBicyleMountain extends InheritanceBicyle{
//the MountainBike subclass adds one field
	 public int seatHeight;
			 
	 //the MountainBike subclass has one ctor
	 public InheritanceBicyleMountain(int startHeight,int startCadence,
			               int startSpeed,int startGear) {
	 super(startCadence,startSpeed,startGear);
			 seatHeight=startHeight;
	 }
			 
		 //the MountainBike subclass adds one method
		 public void setHeight(int newValue) {
				 seatHeight=newValue;
	 }
 }
