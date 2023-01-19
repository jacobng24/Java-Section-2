
public class HCS_20220908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog d1 = new Dog(1, "dog1");
			
			System.out.println(d1);
			d1.bark();
			Dog d2 = new Dog(2, "dog2");
			d2.bark();
			d2.bark(4);
			
			System.out.println("calling d1.sleep() "+d1.sleep());
			int d1S = d1.sleep();
			int d2S = d2.sleep();
			System.out.println("Calling d1.sleep() "+d1S);
			System.out.println("Calling d2.sleep() "+d2S);
			
			double avgSleep = (d1S+d2S)/2.0;
			System.out.println("Average sleep "+avgSleep);
			
			d1.sleep("twinkle twinkle little star");
		}
	}
class Dog{
	private int id;
	private String name;
	
	public Dog(int i, String n)
	{
		id = i;
		name = n;
	}
	public void bark()
	{
		System.out.println("I'm "+name+" and I'm barking");
	}
	public void bark(int num)
	{
		System.out.println("I'm "+name+" and I'm barking "+num+" times");
	}
	public int sleep()
	{
		int val = ((int)(Math.random()*8)) + 1;
		System.out.println("val generate in sleep "+val);
		return val;
	}
	public int sleep(String lul)
	{
		int val = ((int)(Math.random()*8)) + 1;
		//System.out.println("val generate in sleep "+val);
		System.out.println("I'm being put to sleep by "+lul);
		return val;
	}
	public String toString()
	{
		return "ID:\t"+id+"\tName:\t"+name;
	}
}
