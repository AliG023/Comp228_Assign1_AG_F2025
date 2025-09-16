package Assignment1_AlastairGraham_F2025;

import java.util.Scanner;

/** 
 * @author Alastair Graham
 * @since 2025-09-14
 * This class Converts Miles to Kilometers
 */

public class DistanceConverter {

	public void DistanceConv(Scanner scan){
		double km;
		double miles;

		System.out.println("What is the distance in Miles: ");
		miles = scan.nextDouble();
		
		km = miles * 1.609344;
		
		String result = String.format("%,.2f", km);
		System.out.println(miles +" miles equals " + result+" km \n");
		scan.nextLine();
	}
}
