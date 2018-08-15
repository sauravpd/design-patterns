package prototype;

import java.util.List;

/**
 * Prototype Test class
 * @author saurav
 *
 */
public class PrototypeTest 
{
	public static void main(String[] args) 
	{
		Student student1=new Student();
		student1.addStudent();
		
		Student student2=(Student) student1.clone();
		List<String> student2List=student2.getStudentList();
		student2List.add("Steve");
		
		System.out.println("Student 1 details : "+student1.getStudentList());
		System.out.println("Student 2 details : "+student2.getStudentList());
	}
}
