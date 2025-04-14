class Student {
	String name;
	String rollNo;
	double marks;

	// Constructor
	Student(String name, String rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	// Method to display student details
	void display() {
		System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
	}

	// Main method to test the class
	public static void main(String[] args) {
		Student student = new Student("Milind Tajane", "CS061", 78.50);
		student.display();
	}
}
