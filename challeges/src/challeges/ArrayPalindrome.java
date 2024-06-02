package challeges;

public class ArrayPalindrome {
	public static void main(String[] args) {
		System.out.println("Welcome to Array of Palindrome...!");
		
		int[] numArr = ArrayUtilites.inputArray();
		boolean isPali = isPalindrome(numArr);
		if(isPali) {
			System.out.println("Your arrya is palindrome");
		}
		else {
			System.out.println("Your Array is not Palindrome.");
		}
		
		
		
	}
	public static boolean isPalindrome(int[] numArr) {
		int i =0;
		while(i < numArr.length / 2) {
			if(numArr[i]  != numArr[(numArr.length - 1 ) - i]) {
			return false;
				
			}
			i++;
		}
		
		return true;
		
	}

}
