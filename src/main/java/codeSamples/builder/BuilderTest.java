package codeSamples.builder;

public class BuilderTest 
{
	public static void main(String[] args) 
	{
		Employee employee=new Employee.EmployeeBuilder()
				.setEmpID(11111)
				.setEmpName("Steve")
				.build();
		System.out.println(employee);
	}	
}
