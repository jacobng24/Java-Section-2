public class HCS_20220912 {
		public static void main(String[] args) {
			String str= "a line of text";
			int num = str.length();
			System.out.println("str length is " +num);
			System.out.println(str.substring(3));
			System.out.println(str.substring(3,14));
			System.out.println(str.substring(3,12));
			String temp =str.substring(4,7);
			System.out.println(str.indexOf("of"));
			str= "a line of text of";
			System.out.println(str.indexOf("Of"));
			System.out.println("search for \"of\"" +str.indexOf("of"));
			System.out.println("search for \"Of\"" +str.indexOf("Of"));
			String s1 = "temp" ,s2 = "temp";
	        System.out.println(s1.equals(s2));
			System.out.println(s1+".equals("+s2+") "+s1.equals(s2));
			s2= "temp";
			System.out.println(s1+".equals("+s2+") "+s1.equals(s2));
			System.out.println(s1+".equalsIgnoreCase("+s2+") "+s1.equalsIgnoreCase(s2));
			System.out.println("\"a\".compareTo(\"b\") = "+ "a".compareTo("b"));
			System.out.println("\"a\".compareTo(\"c\") = "+ "a".compareTo("c"));
			System.out.println("\"cat\".compareTo(\"able\") = "+ "cat".compareTo("able"));
			System.out.println("\"cat\".compareTo(\"cable\") = "+ "cat".compareTo("cable"));
			Integer num2 = 15;
			 int val =num2 +num;
			 System.out.println(num2+ " + "+num+ " = "+val);
			 Double num3 = 3.2;
			System.out.println("Integer,Max-Value"+Integer.MAX_VALUE);
			System.out.println("Integer,Min-Value"+Integer.MIN_VALUE);
			System.out.println("Math.abs(-4)=" +Math.abs(-4));
			System.out.println("Math.abs(-4.8)=" +Math.abs(-4.8));
			System.out.println("Math.pow(3,2)=" +Math.pow(3,2));
			System.out.println("Math.pow(3,2)=" +Math.pow(3.5,2));
			//int temp2 = Math.pow(3,2); //invalid due to double return from Math.pow
			System.out.println("Math.sqrt(25) = " +Math.sqrt(25));
			System.out.println("Math.sqrt(25.5) = " +Math.sqrt(25.5));
			double gen = Math.random();
			System.out.println("Math.random()= "+Math.random());
			System.out.println("Math.random()= " +gen);
			System.out.println("Math.random() * 10 = " +(gen*10));
			System.out.println("(int)Math.random() * 10 = " +(int)(gen*10));







			



		}

}