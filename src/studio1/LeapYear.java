package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;
		System.out.println("What year is it?");
		year = scan.nextInt();
		boolean isleapyear = ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);
		System.out.println(isleapyear);		
	
		
	}

}
