package challeges;

import java.util.Scanner;

public class ArrayOccurrence {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Occuracance of an Array..!");
		
		int[] numArr = ArrayUtilites.inputArray();
		System.out.println("Enter the Number ou want to fine..: ");
		int num = sc.nextInt();
		int occ = Occurrances(num,numArr);
		
		System.out.println("Your element was found "+occ+" times in the array.");
	}
	
	public static int Occurrances (int num, int[] numArr) {
		int occ = 0;
		int i = 0;
		while(i < numArr.length) {
			if(numArr[i]==num) {
				occ++;
			}
			i++;
		}
		
		return occ;
	}

}
