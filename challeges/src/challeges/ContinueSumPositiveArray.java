package challeges;

public class ContinueSumPositiveArray {
	public static void main(String[] args) {
		System.out.println("Welcome to Continue Sumof Positive array");
		int[] arr = ArrayUtilites.inputArray();
		int sum = 0;
		
		for(int num :arr) {
			if(num < 0) {
				continue;
			}
			sum += num;
			
		}
		
		System.out.println("Sum of all Positive Number is: " + sum);
	
	}

}
