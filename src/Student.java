/**
 * Class to create Student Object
 */
class Student implements Comparable<Student> {
	// Instance variables`
	private String stuNum;
	private String stuFName;
	private String stuLName;
	private String fullName;

	/**
	 * Construtor to create Student Object and slice studentDetails into:
	 *  - Student ID
	 *  - Student First Name
	 *  - Student Last Name
	 *  - Student Full Name
	 * 
	 * @param studentDetails
	 */
	public Student(String studentDetails){
		String student[] = studentDetails.split(" ");
		this.stuNum = student[0];
		this.stuFName = student[1];
		this.stuLName =  student[2];
		this.fullName = this.stuFName.concat(" " + this.stuLName);
	}

	/**
	 * Student Dummy Construtor to create a Student Object with only StudentID
	 * 
	 * @param studentID
	 * @param dummy
	 */
	public Student(String studentID, String dummy){
		this.stuNum = studentID;
	}

	/**
	 * Method to return Student Object's student ID
	 * 
	 * @return stuNum
	 */
	public String studentNum(){
		return this.stuNum;
	}

	/**
	 * Method to return Student Object's full name
	 * 
	 * @return fullName
	 */
	public String fullName(){
		return this.fullName;
	}

	/**
	 * Method to compare Student Object with other Student Object
	 * 
	 * @param other
	 * @return int(
	 * 		>1 if this > other
	 * 		0 if this == other
	 * 		<1 if this < other
	 * )
	 */
	public int compareTo(Student other) {
		return this.stuNum.compareTo(other.stuNum);
	}
	
	/**
	 * Method to return String representation of Student Object
	 */
	public String toString(){
		return this.stuNum + " " + this.fullName;
	}
}
