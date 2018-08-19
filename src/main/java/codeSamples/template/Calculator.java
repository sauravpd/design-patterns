package codeSamples.template;

/**
 * Calculator class
 * @author saurav
 *
 */
public abstract class Calculator 
{
	final void peformCalculation()
	{
		startCalculation();
		setA();
		setB();
		calculate();
		endCalculation();
	}

	private void startCalculation() 
	{
		System.out.println("start Calculation");
	}

	abstract void setA();
	abstract void setB();
	abstract void calculate();

	private void endCalculation() 
	{
		System.out.println("End Calculation");
	}
}
