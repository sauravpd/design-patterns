package codeSamples.composite;

/**
 * Composite Test class
 * @author saurav
 *
 */
public class CompositeTest 
{
	public static void main(String[] args) 
	{
		Developer dev1=new Developer("Steve",111,"Sr.Software Developer");
		Developer dev2=new Developer("Mike",112,"Software Developer");
		Manager mngr1=new Manager("John",222, "Project Manager");
		
		Company company=new Company();
		company.addEmployee(dev1);
		company.addEmployee(dev2);
		company.addEmployee(mngr1);

		company.showEmployeeDetails();
	}
}
