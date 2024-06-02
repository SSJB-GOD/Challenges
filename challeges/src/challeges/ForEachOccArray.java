package challeges;

import java.util.Scanner;

public class ForEachOccArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Occurrance of an Array in For Each\n");
		int[] arr = ArrayUtilites.inputArray();
		
		System.out.print("Please enter the number Your want to Find: ");
		int num = sc.nextInt();
		int occ = Occurrance(arr,num);
		System.out.println("Your Number of Occurances is: "+occ);
		
		
	}
	public static int Occurrance(int[] arr,int num) {
		int occ = 0;
		for(int nums : arr) {
			if(nums == num) {
			 occ++;
			}
		}
		return occ;
		
		
	}

}
