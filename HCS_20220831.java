
public class HCS_20220831 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car("Black", 22);
		Car c3 = new Car("White", 20, "V8");
		//		Car c4 = new Car("White", "V8", 20); showing incorrect parameters, c4 doesn't exist
		Car myCar = new Car("red");

		///////////////////
		
		System.out.println( "c1\t"+c1.toString());
		System.out.println( "c2\t"+c2.toString());
		System.out.println( "c3\t"+c3.toString());
		System.out.println( "myCar\t"+myCar.toString());
		
		System.out.println( "c2\t"+c2.toString());
		System.out.println("Calling c2.paint(\"pink\")");
		c2.paint("pink");
		System.out.println( "c2\t"+c2.toString());
	}

}
