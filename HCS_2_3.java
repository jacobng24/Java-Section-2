
public class HCS_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMixer string1 = new StringMixer("apple");
		System.out.println(string1);
		/* HCS_2_3

Create a class call StringMixer

Each StringMixer object should have 2 strings str1 and str2

There should be two versions of the constructor
The first version should take in 2 strings and set str1 equal to the first parameter and str2 equal to second parameter .
The second version should take a single string then set str1 to the first half and str2 to the second half
examples of second version
calling new StringMixer("apple")
would result in str1 = "ap" and str2= "ple"
calling new StringMixer("please")
would result in str2 = "ple" and str2 = "ase"

Using the below for explanation of methods
StringMixer sm = new StringMixer("first","second"); //for example

There should be a method called combine which will return the 2 strings combined
sm.combine() would return "firstsecond"

There should be a method called add which returns the passed in String parameter between str1 and str2
sm.add("added") would return "firstaddedsecond"

There should be a method called disect which takes in an int parameter and returns str1 and str2 combined then take from
the passed in int index through the end of the string
sm.disect(6) would return "econd"

there should be a method called total which returns the length of str1 and str2 concatenated together
sm.total() would return 11

there should be a method called scramble which returns one string in this order first half of first word - first half of second word - second half of first word - second half of second word
sm.scramble() would return "fisecrstond"

there should be a toString() method to return a string representing the 2 strings
sm.toString() would return "Str1 = "first" Str2 = "second" */
	}

}
