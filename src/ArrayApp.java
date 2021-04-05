import java.io.FileNotFoundException;

/**
 * Class that creates Array from data list received from file
 * 
 * @author TWLCOM001 - Comfort Twala
 * @version 1.0
 */
class ArrayApp {
    // Instance variables
    private Student[] datalist;
    private fileHandler file;    
    
	/**
	 * Constructor to craete and assign values to ArrayApp
	 * 
	 * @throws FileNotFoundException
	 */
    public ArrayApp() throws FileNotFoundException{
        file = new fileHandler("data/oklist.txt");
        datalist = file.dataArray();
    }

	/**
	 * Method to print student details given the student's studentID
	 * 
	 * @param studentID
	 * @return Student name belonging to studentID.
	 */
    public String printStudent(String studentID){
		for (Student student: this.datalist){
			if (student.studentNum().equals(studentID)){
				return student.fullName(); 
			}
		}
		return "Access Denied!";
	}

	/**
	 * Method to print all student details within the array  
	 */	
	public void printAllStudents(){
		for (Student student: this.datalist){
			System.out.println(student);
		}	
	}
}