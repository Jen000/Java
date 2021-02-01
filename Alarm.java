// Name: Jenna Adams
// Lab Partner: Brandon Lackey
// Course and lab: CPSC 1061 - Lab 3
// Date: Jan 27, 2021
// Description: Alarm.java evaluates what time it is after x hours from now, 
// x being the users input.

// ----------------------------------------------------------------

import java.util.Scanner;

public class Alarm{
	public static void main(String[] args) {
			// in an effort to minimize the amount of variables I have put the equation for each calculation below
	
		System.out.print("You need to set an alarm. How many hours from now would you like the alert to go off? ");
		Scanner input = new Scanner(System.in);
		long alarmHours = input.nextLong();


		long currentSecond = (System.currentTimeMillis() / 1000) % 60; 
		long currentMinute = ((System.currentTimeMillis() / 1000) / 60) % 60;
		long currentHour = ((((System.currentTimeMillis() / 1000) / 60) / 60) - 5) % 24;

		long alarmTime = ((alarmHours % 24) + currentHour) % 24;
		System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond +" EST.");
		System.out.println("In " + alarmHours + " hours, the time will be " + alarmTime + ":" + currentMinute + ":" + currentSecond +" EST.");



	}
}