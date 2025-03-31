package exceptionHandling;

public class Pen {
	
	String id;
	
	Pen(String id){
		this.id = id;
	}

	@Override 
	public String toString()
	{
		return id;
	}
}
