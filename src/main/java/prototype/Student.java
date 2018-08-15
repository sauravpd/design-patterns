package prototype;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable
{
	private List<String> studentList;

	public Student() {
		studentList=new ArrayList<String>();
	}

	public Student(List<String> studentList)
	{
		this.studentList=studentList;
	}
	
	public List<String> getStudentList()
	{
		return studentList;
	}
	
	public void addStudent()
	{
		studentList.add("John");
		studentList.add("Mark");
		studentList.add("Mike");
		studentList.add("Sam");
	}
	
	@Override
	public Object clone()
	{
		List<String> tempStudentList=new ArrayList<>();
		for(String s:getStudentList())
		{
			tempStudentList.add(s);
		}
		return new Student(tempStudentList);
	}
}
