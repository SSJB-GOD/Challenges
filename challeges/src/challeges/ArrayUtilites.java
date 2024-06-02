package challeges;

import java.util.Scanner;

public class ArrayUtilites {
	public static int[] inputArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the size of array.:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		int i =0;
		while(i < size) {
			System.out.print("Please enter Element Number " +(i + 1)+": ");
			arr[i]=sc.nextInt();
			i++;
		}
		
	return arr;	
	}
	
	
	public static int[][] input2DArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the number of Rows");
		int rows = sc.nextInt();
		
		System.out.println("Please Enter the number of Columns");
		int columns = sc.nextInt();
		int[][] nums = new int[rows][columns];
		

		int i=0;
		while(i< rows) {
			int j = 0;
			while(j<columns) {
				
				System.out.println("Please enter elements rows: "+(i + 1)+
						", Columns:"+(j + 1)+" :");
				nums[i][j] = sc.nextInt();
				j++;
			}
			
			i++;
		}
		return nums;
		
 	}
	
	
	
	
	
	
	public static void displayArray(int[] numArr) {
		int i =0;
		while(i<numArr.length) {
			System.out.println(numArr[i]+" ");
			i++;
		}
		
	}
}
