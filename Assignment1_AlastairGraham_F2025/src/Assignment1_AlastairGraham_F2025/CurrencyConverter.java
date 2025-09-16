package Assignment1_AlastairGraham_F2025;

import java.util.Scanner;
import java.util.Currency;

/** 
 * @author Alastair Graham
 * @since 2025-09-16
 * This class Converts Canadian Dollar to US Dollars
 */

public class CurrencyConverter {
	public void CurrencyConv(Scanner scan) {
		//Exchange Rate retrieved 09/16/2025
		double exRate = 0.73;
		Currency can = Currency.getInstance("CAD");
		Currency us = Currency.getInstance("USD");
		double cad;
		double usd;

		System.out.println("What is the amount in CAD: ");
		cad = scan.nextDouble();

		usd = cad * exRate;
		String result = String.format("%,.2f", usd);
		System.out.println(can.getSymbol()+ cad + " " + can.getCurrencyCode() +" equals " + us.getSymbol()+ result + " " + us.getCurrencyCode()+ " \n");
		scan.nextLine();
	}
}
