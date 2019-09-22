package ie.gmit.studentmanager;

public class StudentManager {
	// Set an initial capacity constant for the array. Before creating an
	// array you need to know what size it is.
	private static final int INITIAL_CAPACITY = 10;
	// Declare an array to hold the student objects
	private Student[] students = null;

	// Constructor - Create students array
	public StudentManager() {
		setStudents(new Student[INITIAL_CAPACITY]);
	}

	// Getters 
	public Student[] getStudents() {
		return students;
	}
	
	// Setters
	public void setStudents(Student[] students) {
		this.students = students;
	}

	// Create methods you may need and stub them out.
	
	// Add Method
	public boolean add(Student student) {
		return false;
	}
	
	// Delete Method
	public boolean delete(String studentId) {
		return false;
	}

	// Find Students with first name method
	public Student[] findStudentsWithFirstName(String firstName) {
		return null;
	}

	// Find total Students method
	public int findTotalStudents() {
		return -1;
	}

}
