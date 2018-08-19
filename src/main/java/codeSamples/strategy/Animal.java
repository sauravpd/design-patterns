package codeSamples.strategy;

public class Animal 
{
	private String name;
	private String sound;
	Flys flyType;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void  setFlyingAbility(Flys flyType) 
	{
		this.flyType=flyType;
	}
	
	public String fly()
	{
		return flyType.fly();
	}
}
