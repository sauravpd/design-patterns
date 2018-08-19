package codeSamples.template;

/**
 * template pattern Test class 
 * @author saurav
 *
 */
public class templateTest 
{
	public static void main(String[] args) 
	{
		Calculator add=new Addition();
		add.setA();
		add.setB();
		add.calculate();
		
		
		Calculator mult=new Multiplication();
		mult.setA();
		mult.setB();
		mult.calculate();
	}
}
