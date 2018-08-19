package codeSamples.template;

/**
 * Addition class
 * @author saurav
 *
 */
public class Addition extends Calculator
{
	private int a;
	private int b;
	@Override
	void setA() 
	{
		a=10;
	}

	@Override
	void setB() 
	{
		b=10;
	}

	@Override
	void calculate() 
	{
		System.out.println("Addition is : "+(a+b));
	}
}
