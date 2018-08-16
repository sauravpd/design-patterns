package codeSamples.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 * @author saurav
 *
 */
public class Company implements Employee
{

	List<Employee> empList=new ArrayList<>();
	
	@Override
	public void showEmployeeDetails() 
	{
		for(Employee emp:empList)
		{
			emp.showEmployeeDetails();
		}
	}
	
	public void addEmployee(Employee e)
	{
		empList.add(e);
	}
	
	public void removeEmployee(Employee e)
	{
		empList.remove(e);
	}
}
