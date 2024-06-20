package challeges;

public class StringManipulation {
	
	
	public static void main(String[] args) {
		String name = "Jitesh";
		String lname = "Borkar";
		String fullName = name.concat(" ").concat(lname);
		System.out.println(fullName.toUpperCase());
		
		System.out.println(fullName.toLowerCase());
		System.out.println(fullName.length());
	}

}
