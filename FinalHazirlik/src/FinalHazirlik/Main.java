package FinalHazirlik;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		//string to integer
		String s1= "12";
		String s2="18";
		
		int sayi1=Integer.parseInt(s1);
		int sayi2= Integer.valueOf(s2);
		
		//int to string
		int a1=12;
		int a2=23;
		
		String a_1=a1+"";
		String a_2=String.valueOf(a2);
		String a_3=Integer.toString(a1);
		
		//byte operators
		System.out.println(10>>2);// 10/2^=10/4=2
		System.out.println(20>>2);// 20/2^2=5
		System.out.println(10<<2);// 10*2^2=40
		
		//SHORT if else USE
		int not=80;
		String durum=not>60 ? "Geçti":"Kaldı";
		
		//for loop different use 
		int[] numbers= {1,55,3,4,5,-8,7,8,9,5};
		for (int item:numbers) {
			System.out.println("count is: "+item);
		}
		
		//search an item
		int[] numbers2={1,55,3,4,5,-8,7,8,9,5,11,12};
		int searchFor=12;
		int i=0;
		boolean foundIt=false;
		
		for (int i1 = 0; i1 < numbers2.length; i1++) {
			if (numbers2[i1]==searchFor) {
				foundIt=true;
				break;
			}
			i=i1+1;
		}
		if (foundIt) {
			System.out.println("found "+searchFor+"index "+i);
		}
		else {
			System.out.println(searchFor+" not in the array");
		}
		
		//use BREAK with tag
		int[][] arrayOfInts= {{32,87,3,589},{12,1076,2000,8},{622,127,77,955}};
		int a=0;
		boolean foundIt2=false;
		int b=0;
		search:
		for (int j = 0; j < arrayOfInts.length; j++) {
			b=j;
			for (int j2 = 0; j2 < arrayOfInts.length; j2++) {
				if (arrayOfInts[j][j2]==searchFor) {
					foundIt2=true;
					break search;
				}
				a=j2;
			}
		}
		if (foundIt2) {
			System.out.println("found "+searchFor+"at "+b+","+a);
		}else {
			System.out.println(searchFor+" not found");
		}
		
		//use of continue
		String searchMe="peter piper picked a "+"peck of pickled pappers";
		int max=searchMe.length();
		int numPs=0;
		for (int t = 0; t < max; t++) {
			if (searchMe.charAt(t)!='p') {
				continue;			
			}
			numPs++;
		}
		System.out.println("found "+numPs+" p's in the string.");
		
		/*take input from keyboard import java.util.Scanner
		next()=take input until space
		nextInt()=input type to integer
		nextFloat()=input type to float
		nextDouble()=input type to double
		*/
		System.out.println("ifade girişi yapınız: ");
		
		Scanner ifade=new Scanner(System.in);
		String tara=ifade.next();
		
		System.out.println("ifade: "+tara);
		
		//call different parameter method this method at out of class
		toplamSayi(1,2,3);
		toplamSayi(numbers2);
		
		/*ARRAYS
		 * for sort index=sort
		 * for find index number=binarySearch
		 * for find two equal array=equals
		 * put a value to an array=fill
		 */
		
		String[][] names= {{"Mr. ","Mrs. ","Ms. "},{"Smith","Jones"}};
		System.out.println(names[0][0]+names[1][0]);
		
		char[] copyFrom= {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		char[] copyTo=new char[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo));
		
		/*ARRAYLIST
		 * add=for add a new component 
		 * remove(index)=remove component at this index
		 * indexOf=Search array components if not found -1 value return
		 * get(index)=get that value on index
		 */
		
		/*Strings
		 * charAt(index)=Return a character at this index
		 * substring(start,end)=reverse between start to end
		 * lastIndexof(string variable)=return last position which found variable
		 * replace(x,y)=write y in x place
		 */
		
		//CLASSES
		bicyle b1=new bicyle();
		bicyle b2=new bicyle();
		
		b1.changeCadence(50);
		b1.speedUp(10);
		b1.changeGeart(2);
		b1.printStates();
		
		b2.changeCadence(50);
		b2.speedUp(10);
		b2.changeGeart(2);
		b2.speedUp(10);
		b2.changeGeart(3);
		b2.printStates();
		
		//Encapsulation
		Dikdortgen d1= new Dikdortgen();
		d1.setEn(3);
		d1.setBoy(5);
		System.out.println("d1 alan: "+d1.alanHesap());
		
		//Constructor
		Dikdortgen d2=new Dikdortgen();
		System.out.println("d2 alan: "+d2.alanHesap());
		
		Dikdortgen d3=new Dikdortgen(8,5);
		System.out.println("d3 alan: "+d3.alanHesap());
		
		//Find object number with static method
		System.out.println("nesne sayisi: "+Dikdortgen.getNesneSayisi());
		
		/*INHERITANCE principle
		 * we use extends key to create Derived Class from base
		 * public class BaseClass {
   			// Fields and methods
			}

			public class DerivedClass extends BaseClass {
   			// Fields and methods
			}
		 */
		InheritanceBicyle ib1=new InheritanceBicyle(15,20, 5);
		InheritanceBicyleMountain ibm1=new InheritanceBicyleMountain(5, 5, 5, 5);
		
		ib1.cadence=5; ib1.gear=8; ib1.speed=25; ib1.applyBrake(5);
		ibm1.cadence=8; ibm1.gear=5; ibm1.speed=40; ibm1.applyBrake(10); ibm1.seatHeight=8;
		
		/*Method Override @Override
		 * 
		 * public class BaseClass {
   			public void printMessage() {
      			System.out.println("This is the base class");
   			}
		}

		public class DerivedClass extends BaseClass {
   		@Override
   				public void printMessage() {
      			System.out.println("This is the derived class");
   			}
		}		 
		 */
		
		/*Override method with parameter
		  public class BaseClass {
   			public void printMessage(String message) {
      		System.out.println("Message: " + message);
   			}
		}

			public class DerivedClass extends BaseClass {
   			@Override
   			public void printMessage(String message) {
      		System.out.println("Overridden message: " + message);
   			}
		}
		 */
		
		KopekExtendsHayvan kpk =new KopekExtendsHayvan();
		kpk.yas=5;
		kpk.yasSoye();
		kpk.sesCikar();
		
		/* ABSTRACTION
		 * The Java language, thanks to "abstraction" (abstraction) classes, a class does not just describe the properties and methods that are required and how they work. 
		 * This hides the details of how the class is built, and exposes only essential properties and methods to aggression.
		 * We can not define an object from abstract class
		 * 
		 * public abstract class AbstractClass {
   				public abstract void printMessage();
			}

			public class ConcreteClass extends AbstractClass {
   			@Override
   			public void printMessage() {
      		System.out.println("This is a concrete class");
   			}
			}
		 */
		//We create abstract student class and use student class's properties 
		BachelorsDegreeStudent bs1=new BachelorsDegreeStudent();
		bs1.successStatus(49);
		
		PhdStudent ps1=new PhdStudent();
		ps1.successStatus(80);
		
		//POLYMORPHISM
		/* same method can do different things for example draw method
		 * 
	  	public abstract class Shape {
   			public abstract void draw() ;		
		}	

		public class Circle extends Shape {
   			@Override
   			public void draw() {
      		System.out.println("Drawing a circle");
   			}
		}

		public class Rectangle extends Shape {
   			@Override
   			public void draw() {
      		System.out.println("Drawing a rectangle");
   			}
		}
		 */
		
		
		
	}
	
	/*Different parameter numbers in a method
	 * we write this method out of class because this method 
	 * a static method
	 */
	public static void toplamSayi(int... sayilar) {
		int toplam=0;
		for(int i:sayilar) {
			toplam+=i;
		}
		System.out.println("toplamlari: "+toplam);
	}

}
