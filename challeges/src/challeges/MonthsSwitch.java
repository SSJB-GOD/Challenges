package challeges;

import java.util.Scanner;

public class MonthsSwitch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Month of the Year..!\n");
		System.out.print("Please enter your month of the year: ");
		int month = sc.nextInt();
		
		String MonthOfYear = GetMonths(month);
		System.out.println("Month of the year is: "+ MonthOfYear);
		
		
	}
	
	public static String GetMonths(int month) {
		return switch(month) {
		case 1 -> "Jan";
		case 2 -> "Feb";
		case 3 -> "March";
		case 4 -> "Apr";
		case 5 -> "May";
		case 6 -> "Jun";
		case 7 -> "Jul";
		case 8 -> "Aug";
		case 9 -> "Sep";
		case 10 -> "Oct";
		case 11 -> "Nov";
		case 12 -> "Dec";
		default -> "invalid Month"; 
		};
	}

}
