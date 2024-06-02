package challeges;

 class Course {
	 static int maxCapacity=120;
	 String courseName;
	 int enrolledStudents;
	 
	 String[] enrolledStudent;
	 
	 
	 Course(String courseName) {
		 this.courseName = courseName;
		 this.enrolledStudents = 0;
		 this.enrolledStudent= new String[maxCapacity];
		 System.out.println("Course Name: "+courseName);
		 
	 }
	 
	 
	 static void setMaxCapacity(int maxCapacity) {
		
		 Course.maxCapacity= maxCapacity;
		 
	 }
	 
	 void enrolledStudent(String StudentName) {
		 enrolledStudent[enrolledStudents] = StudentName;
		 System.out.println("Enrolled Student are: "+enrolledStudent[enrolledStudents]);
		 enrolledStudents++;
		 
	 }
	 void unenrolledStudent(String StudentName) {
		 
		
		 enrolledStudents--;
		 
	 }
	 
	 
	 public static void main(String[] args) {
		 	Course java = new Course("java");
		 	java.enrolledStudent("Jitesh");
		 	java.enrolledStudent("Prem");
		 	java.enrolledStudent("Pratik");
		 	java.enrolledStudent("Santosh");
		 	java.enrolledStudent("ramesh");
		 	java.unenrolledStudent("Jitesh");
		 	
		 	Course Python = new Course("Python");
		 	Python.enrolledStudent("Pranali");
		 	
		 	Python.enrolledStudent("Tejaswini");



		 	
		
	}

}
