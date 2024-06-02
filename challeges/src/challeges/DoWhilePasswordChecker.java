package challeges;

import java.util.Scanner;

public class DoWhilePasswordChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Set your password!!\n\n");
	
	String password;
	
	do {
		System.out.println("Please, enter the password: ");
		 password = sc.next();
		}while(!isValidPassWord(password));
	System.out.println("Thanks for entering the Valid password");
		
}

public static boolean isValidPassWord(String pass) {
	if(pass.length()>=6 ) {
		return true;
	}else {
	return false;
	}
}
}
