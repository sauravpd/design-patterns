package codeSamples.strategy;

public class StrategyTest 
{
	public static void main(String[] args) 
	{
		Animal bird=new Bird();
		System.out.println("Bird : "+bird.fly());
		
		Animal dog=new Dog();
		System.out.println("Dog: "+dog.fly());
	}
}
