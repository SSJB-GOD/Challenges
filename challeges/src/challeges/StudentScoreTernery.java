package challeges;

import java.util.Scanner;

public class StudentScoreTernery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Student Score card..!\n\n");
		System.out.print("Please, enter marks of the Student: ");
		int marks = sc.nextInt();
		
		StudentScoreTernery score = new StudentScoreTernery();
		String category = score.score(marks);
		System.out.println("Your Grade is: "+ category);
		
	}
	
	public String score(int marks) {
	
		return  marks > 80 ? "Outstanding":(marks > 50 ? "A+":"B");
		 
	
	} 

}
