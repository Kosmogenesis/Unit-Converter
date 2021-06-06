
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuSelection =0;
		String nL = System.lineSeparator();
		
		while (menuSelection != 5) {
			System.out.println(
			"Select a unit to convert: " 
			+ nL  + nL 
			+ "Mass Conversions: " + nL 
			+ "1. Pounds to Kilograms " + nL 
			+ "2. Atomic Mass Unit to Kilograms " + nL + nL
			+  "Distance Conversions: " + nL 
			+ "3. Light years to Parsecs & Astronomical Units " + nL 
			+  "4. Feet to Meters and Kilometers" 
			+ nL + nL 
			+ "5. Quit");
			
			
		
		Scanner enterNum = new Scanner(System.in);
		double value;
		double conversion;
		double conversion2;
		
		
		switch(menuSelection = enterNum.nextInt()) {
		
		case 1:
			System.out.println("Enter the number of pounds that you would like to convert: ");
			value = enterNum.nextDouble();
			conversion = value * 0.453592f;
			conversion2 = value * 4.448f;
			if (value == 1) {
				System.out.println(value + " pound is equivalent to " + conversion + " kilograms and " + conversion2 + " newtons. " + nL);
			}
			else {
				System.out.println(value + " pounds is equivalent to " + Math.round(conversion)  + " kilograms and " + Math.round(conversion2) + " newtons." + nL);
			}
			break;
		
			
		case 2:
			System.out.println("Enter the number of Atomic Mass Units that you would like to convert: ");
			value = enterNum.nextDouble();
			conversion = value * 1.6605E-27f;
			if (value == 1) {
				System.out.println(value + " atomic mass unit is equivalent to " + conversion + " kilograms." + nL);
			}
			else {
				System.out.println(value + " atomic mass units is equivalent to " + conversion + " kilograms." + nL);
			}
			break;
		
		case 3:
			System.out.println("Enter the number of light years that you would like to convert: ");
			value = enterNum.nextDouble();
			conversion = value * 0.3063915344238f;
			conversion2 = value * 63241.1f;
			if (value == 1) {
				System.out.println(value + " light year is equivalent to " + conversion + " parsecs and " + conversion2 + " astronomical units." + nL);
			}
			else {
				System.out.println(value + " light years is equivalent to " + Math.round(conversion) + " parsecs and " + Math.round(conversion2) + " astronomical units." +  nL);
			}
			break;
		
		case 4:
			System.out.println("Enter the number of feet that you would like to convert: ");
			value = enterNum.nextDouble();
			conversion = value * 0.3048f;
			conversion2 = value * 0.0003048f;
			if (value == 1) {
				System.out.println(value + " foot is equivalent to " + conversion + " meters and " + conversion2 + " kilometers." + nL);
			}
			else {
				System.out.println(value + " feet is equivalent to " + conversion + " meters and " + conversion2 + " kilometers." + nL);
			}
			break;
				
			
		case 5:
			System.out.println("You have exited the unit converter.");
			break;
			
		default:
			enterNum.close();
			break;
			
		}
		}
	}


	}

	



