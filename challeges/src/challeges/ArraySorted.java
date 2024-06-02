package challeges;

public class ArraySorted {
	public static void main(String[] args) {
		int numArr[] = ArrayUtilites.inputArray();
		System.out.println("Welcome to Sorted Array..!\n\n");
		boolean isDec = Decrease(numArr);
		boolean isInc = Increase(numArr);
		if(isDec || isInc) {
			System.out.println("Your Array is Sorted");
		}
		else {
			System.out.println("Your Array is not Sorted");
		}
		
	}

	public static boolean Decrease(int[] numArr) {
		// TODO Auto-generated method stub
		int i =1;
		while(i< numArr.length) {
			if(numArr[i] > numArr[i-1]) {
				return false;
			}
			
			i++;
		}
		
		return true;
	}

	public static boolean Increase(int[] numArr) {
		// TODO Auto-generated method stub
		int i =1;
		while(i< numArr.length) {
			if(numArr[i] < numArr[i-1]) {
				return false;
			}
			
			i++;
		}
		
		return true;
	}
	
	

}
