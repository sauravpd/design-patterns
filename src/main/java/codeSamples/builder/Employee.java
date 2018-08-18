package codeSamples.builder;

public class Employee
{
	private int empID;
	private String empName;
	private String city;
	private int contact;
	
	public Employee(EmployeeBuilder builder) 
	{
		this.empID = builder.empID;
		this.empName = builder.empName;
		this.city = builder.city;
		this.contact = builder.contact;
	}

	public int getEmpID() {
		return empID;
	}
	

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", city=" + city + ", contact=" + contact + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public String getCity() {
		return city;
	}

	public int getContact() {
		return contact;
	}

	public static class EmployeeBuilder
	{
		private int empID;
		private String empName;
		private String city;
		private int contact;
		public EmployeeBuilder setEmpID(int empID) 
		{
			this.empID = empID;
			return this;
		}
		public EmployeeBuilder setEmpName(String empName) 
		{
			this.empName = empName;
			return this;
		}
		public EmployeeBuilder setCity(String city) 
		{
			this.city = city;
			return this;
		}
		
		public EmployeeBuilder setContact(int contact) 
		{
			this.contact = contact;
			return this;
		}

		public Employee build()
		{
			return new Employee(this);
		}
	}
}
