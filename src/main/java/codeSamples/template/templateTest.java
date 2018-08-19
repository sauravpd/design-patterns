package codeSamples.template;

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
