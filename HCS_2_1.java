import java.util.Scanner;
public class HCS_2_1 {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student("Hudson");
		Student s3 = new Student("Liam", "Lowry");
		Student s4 = new Student ("Ronit", "Sebastian", 16);
		Student s5 = new Student ("Andrew", "Bongoyan", 16, 245);
		s5.SetAge(200);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first name:");
		String setFirst = sc.nextLine();
		System.out.print("Please enter last name:\t");
		String setLast = sc.nextLine();
		System.out.print("Please enter age:\t");
		int setAge = sc.nextInt();
		System.out.print("Please enter ID number:\t");
		int setID = sc.nextInt();

		Student myStudent = new Student(setFirst, setLast, setAge, setID);
		
		System.out.println( "\nStudent 1"+s1.toString());
		System.out.println( "\nStudent 2"+s2.toString());
		System.out.println( "\nStudent3"+s3.toString());
		System.out.println( "\nStudent4"+s4.toString());
		System.out.println( "\nStudent5"+s5.toString());
		System.out.println( "\nMy Student"+myStudent.toString());
		
	}
}
