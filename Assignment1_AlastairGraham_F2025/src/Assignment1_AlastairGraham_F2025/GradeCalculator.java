package Assignment1_AlastairGraham_F2025;

import java.util.Scanner;

/** 
 * @author Alastair Graham
 * @since 2025-09-14
 * This class Calculates a students average grade
 */

public class GradeCalculator {

	public void GradeCalc(Scanner scan) {
		String name;
		int courseQty = 0;
		int i;
		float total = 0, avg;


		System.out.println("What is your name: ");
		name = scan.next();
		System.out.println("How many courses are you taking: ");
		courseQty = scan.nextInt();
		
		int grades[] = new int[courseQty];
			
			for (i = 0; i < courseQty; i++) {
				System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
				grades[i] = scan.nextInt();
				total = total + grades[i];
				}
				scan.nextLine();

		avg = total / courseQty;
			
		System.out.print(name + " recieved an average grade of: ");
		if (avg >= 90) {
			System.out.print("A+");
		} else if (avg >= 80 && avg < 90) {
			System.out.print("A");
		} else if (avg >= 70 && avg < 80) {
			System.out.print("B");
		} else if (avg >= 60 && avg < 70) {
			System.out.print("C");
		} else if (avg >= 50 && avg < 60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
	}
}
