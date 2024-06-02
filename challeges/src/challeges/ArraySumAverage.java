package challeges;

public class ArraySumAverage {
	public static void main(String[] args) {
		System.out.println("Welcome to Array Sum and Average of all Element..!");
		
		int[] numArray = ArrayUtilites.inputArray();
		long sum = sum(numArray);
		double avg = avg(numArray);
		
		System.out.println("sum of the array is: "+sum);
		System.out.println("Avarge of the array is: "+avg);
		

		
	}
	public static long sum(int[] num) {
		long sum = 0;
		int i =0;
		while(i < num.length ) {
			sum += num[i];
			i++;
			
		}
	return sum;	
	}
	public static double avg(int[] num) {
		double sum = sum(num);
		return (sum / num.length) ;
	}

}
