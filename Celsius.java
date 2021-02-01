// Name: Jenna Adams
// Lab Partner: Zachary Wallace
// Course and lab: CPSC 1061 - Lab 2
// Date: Jan 20, 2021
// Description: Celsius.java asks the user for a temperature in Fahrenheit and gives back the temperature in Celsius.

// ----------------------------------------------------------------

import java.util.Scanner;

public class Celsius {
	public static void main (String[] args) {
		System.out.println("This program will convert temperature in Fahrenheit to Celsius. Please enter a temperature.");
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		double celsius = (fahrenheit - 32.0) * (5.0/9.0) ;
		System.out.println("The temperature in Celsius is: " + celsius);
	}
}