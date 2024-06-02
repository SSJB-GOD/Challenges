package challeges;

import java.util.*;
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		System.out.println("Welcome to Tempreture Converter..");
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter your tempreture in F:");
		float F = sc.nextInt();
		
		float C = (F - 32) *5/9;
		System.out.println("Your tempreture in Celsius is: "+ C+"C");
		
	}

}
