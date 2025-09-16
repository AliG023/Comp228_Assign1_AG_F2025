package Assignment1_AlastairGraham_F2025;

import java.util.Scanner;

public class Assignment1MainDriver {

	public static void main(String[] args) {
		
		GradeCalculator gc = new GradeCalculator();
		DistanceConverter dc = new DistanceConverter();
		VolumeConverter vc = new VolumeConverter();
		CurrencyConverter cc = new CurrencyConverter();
		int selection;
			
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
			System.out.printf("Please select the Application you would like to use: \n 1 = Grade Calculator \n 2 = Disctance Converter \n 3 = Volume Converter \n 4 = Currency Calculator \n 0 = Close Application \n");
			System.out.print("Enter your choice: ");
			selection = scan.nextInt();
				if (selection == 0) {
				System.out.println("Application Closed");
				break;
				}
				switch(selection) {
				case 1:
					System.out.println("Starting Grade Calculator... ");
					gc.GradeCalc(scan);
					break;
				case 2:
					System.out.println("Starting Distance Converter... ");
					dc.DistanceConv(scan);
					break;
				case 3:
					System.out.println("Starting Volume Converter... ");
					vc.VolumeConv(scan);
					break;
				case 4:
					System.out.println("Starting Currency Calculator... ");
					cc.CurrencyConv(scan);
					break;
				default:
					System.out.println("Invalid Selection. Please Try Again: \n");
					break;
				}
			}
		}
	}
}