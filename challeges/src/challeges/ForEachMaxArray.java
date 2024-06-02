package challeges;

public class ForEachMaxArray {
	public static void main(String[] args) {
		System.out.println("Welcome to Maximum Array");
		int[] numArr = ArrayUtilites.inputArray();
		
		int max = Integer.MIN_VALUE;
		for(int num: numArr) {
			if(num > max) {
				max = num;
			}
			
			
		}
		System.out.println("Maximum Array is: "+max);

		
		
	}

}
