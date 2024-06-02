package challeges;

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		int num = scan();
		int sum = OddNumSum(num);
		System.out.println("OddSum till "+num+" is:" +sum);
	}

	
	public static int scan() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Please Enter Your Number: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int OddNumSum(int odd) {
		int sum =0;
		int i = 1;
		 while(i <= odd) {
			 while(i%2 != 0 ) {
				 sum += i;
				 i++;
			 }
			 
			 i++;
		 }
		return sum;
		
	}
}
