package challeges;
import java.util.*;

public class Swap {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b = sc.nextInt();
		
		System.out.println("Before Swap: ");
		System.out.println("Value of A: "+ a);
		System.out.println("Value of B: "+ b + "\n\n");
		
		
		int c = a;
			a = b;
			b = c;
			
		System.out.println("After Swap");
		System.out.println("Value of A: "+ a);
		System.out.println("Value of B: "+ b);
		
		
	}

}
