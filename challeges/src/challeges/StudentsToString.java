package challeges;

import java.util.Scanner;

public class StudentsToString {
	String name;
	int age;
	String rollNumber;
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StudentsToString student = new StudentsToString("jitesh",24,"208921");
		System.out.println(student);
	}


	public StudentsToString(String name, int age, String rollNumber) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
	}


	@Override
	public String toString() {
		return "StudentsToString [name = " + name
				+ ", age = " + age 
				+ ", roll Number = " + rollNumber + "]";
	}
	
	
	

}
