package ie.gmit.studentmanager;

public class StudentManager {
	// Set an initial capacity constant for the array. Before you create an 
	// array you need to know what size it is.
	private static final int INITIAL_CAPACITY = 10;
	// Create an array to hold the student objects
	private Student[] students = null;
	
	// Constructor - instantiate students array
	public StudentManager() {
		setStudents(new Student[INITIAL_CAPACITY]);
	}
	
	// Getters and Setters
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	// Create methods you may need and stub them out.
	public boolean add(Student student) {
		return false;
	}

	public boolean delete(String studentId) {
		return false;
	}
	
	public Student[] findStudentsWithFirstName(String firstName) {
		return null;
	}

	public int findTotalStudents() {
		return -1;
	}


}
