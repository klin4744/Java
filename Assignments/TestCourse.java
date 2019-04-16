public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course1.dropStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
				students = course2.getStudents();
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students[i] + ", ");
	}
}
class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		if(students.length < numberOfStudents) {
			String arr[] = new String[numberOfStudents+1];
			for(int i = 0; i<arr.length; i++) {
				arr[i] = students[i];
			}
			this.students = arr;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents() {
		String arr[] = new String[numberOfStudents];
		for(int i = 0; i<numberOfStudents; i++) {
			arr[i] = students[i];
		}
		return arr;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		String arr[] = new String[numberOfStudents];
		int index = 0;
		for(int i = 0; i<numberOfStudents; i++) {
			if(students[index] == null) break;
			if(!students[index].equals(student)) {
				arr[i] = students[index];
			}else {
				arr[i] = students[index + 1];
				index++;
			}
			index++;
		}
		numberOfStudents--;
		this.students = arr;
	}
	public void clear() {
		this.numberOfStudents = 0;
		this.students = new String[100];
	}
}