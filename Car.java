
public class Car {
	private String color;
	private int wheelSize;
	private String engineSize;
	
	public Car()
	{
		color = "blue";
		wheelSize = 18;
		engineSize = "V6";
	}//Car
	
	public Car(String c)
	{
		color = c;
		wheelSize = 18;
		engineSize = "V6";
	}
	
	public Car(String c, int ws)
	{
		color = c;
		wheelSize = ws;
		engineSize = "V6";
	}
	
	public void paint(String c)
	{
		color = c;
	}
	
	public Car(String c, int ws, String es)
	{
		color = c;
		wheelSize = ws;
		engineSize = es;
	}
	
	public String toString()
	{
		String str ="\n\tColor:\t"+color+",\twheel size:\t"+wheelSize;
		str = str+",\tEngine size:\t" +engineSize;
		return str;
		
	}
	
}//class Car
