package challeges;

import java.util.*;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int first = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int second = sc.nextInt();
		
		int c = first + second;
		    System.out.println(" Addition of first + second : "+ c);
		    c = first - second;
		    System.out.println(" Substraction of first - second : "+ c);
		    c = first * second;
		    System.out.println(" multiplication of first * second : "+ c);
		    c = first / second;
		    System.out.println(" division of first / second : "+ c);
		    c = first % second;
		    System.out.println(" modules of first % second : "+ c);
	}

}
