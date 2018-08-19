package codeSamples.strategy;

public class Bird extends Animal
{
	public Bird() 
	{
		flyType=new ItFlys();
	}
}
