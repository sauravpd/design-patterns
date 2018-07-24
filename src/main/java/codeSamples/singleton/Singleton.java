package codeSamples.singleton;

public class Singleton 
{
	private static Singleton instance;  

	//Singleton prevents the instantiation from any other class.  
	private Singleton() {  }  

	//Now we are providing gloabal point of access.  
	public static Singleton getInstance() 
	{    
		if (instance==null)  
		{  
			instance=new  Singleton();  
		}  
		return instance;  
	}  
}
