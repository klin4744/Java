// Kevin Lin 110277459
import java.util.*;
public class TestCourse1 {
	public static void main(String[] args) {
		Course1 course1 = new Course1("Data Structures");
		Course1 course2 = new Course1("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course1.dropStudent("Kim Smith");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		ArrayList<String> students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students.get(i) + ", ");
		System.out.println();
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
				students = course2.getStudents();
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students.get(i) + ", ");
	}
}
class Course1{
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;
	public Course1(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		this.students.add(student);
		this.numberOfStudents++;
	}
	public ArrayList<String> getStudents() {
		return this.students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		for(int i = 0; i<numberOfStudents; i++) {
			if(this.students.get(i).equals(student)) {
				this.students.remove(i);
				break;
			}
		}
		numberOfStudents--;
	}
	public void clear() {
		this.numberOfStudents = 0;
		this.students.clear();
	}
}