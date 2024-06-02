package challeges;

import java.util.Scanner;

public class ForMultiplicationTable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Multiplication Table Using for..!\n");
	System.out.print("Please enter the number: ");
	int num = sc.nextInt();
	int table = 0;
	for(int i = 1; i <= 10; i++) {
		table = num * i;
		System.out.println( num+" * "+ i +" = "+table);
	}

	
}


}
