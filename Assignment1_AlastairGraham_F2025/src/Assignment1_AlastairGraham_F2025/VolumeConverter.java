package Assignment1_AlastairGraham_F2025;

import java.util.Scanner;

/** 
 * @author Alastair Graham
 * @since 2025-09-14
 * This class Converts Liters into Gallons
 */

public class VolumeConverter {
	
	public void VolumeConv(Scanner scan) {
		double liters;
		double gals;

		System.out.println("What is the Volume in Liters: ");
		liters = scan.nextDouble();
		
		gals = liters * 0.264172;
		
		String result = String.format("%,.2f", gals);
		System.out.println(liters +" L equals " + result+" gals \n");
		scan.nextLine();
	}
}
