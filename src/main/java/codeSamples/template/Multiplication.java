package codeSamples.template;

public class Multiplication extends Calculator
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
		System.out.println("Multiplication is : "+a*b);
	}
}
