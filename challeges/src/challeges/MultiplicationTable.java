package challeges;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
	 int  num = input();
	 table(num); //table method call take input form num which is actual parameter
	}
	
	public static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int table(int num) {
		
		int i = 1;
		 while(i <=10) {
			 System.out.println(num+" * "+i+" = "+(num*i));
			 i++;
			 
		 }
		return num;
		
	}

}
