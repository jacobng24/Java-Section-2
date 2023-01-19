//HCS_2_3
public class StringMixer {
	private String str1;
	private String str2;
	private String str3;
	
	public StringMixer(String s1, String s2) {
		str1 = s1;
		str2 = s2;
		
	}
	public StringMixer(String s) {
		str1 = s.substring(0,s.length()/2);
		str2 = s.substring(s.length()/2, s.length());
		return;
		
	}
	
	public String combine() {
		String strfinal1 = str1 + str2;
		return strfinal1;
	}
	
	public String add(String s) {
		str3 = s;
		String strfinal1 = str1 + str3 + str2;
		return strfinal1;
 	}
	public String disect(int c) {
		String strfinal1 = str1 + str2;
		String dis = strfinal1.substring(c);
		return dis;
	}
	public int total() {
		String strfinal1 = str1 + str2;
		int count = strfinal1.length();
		return count;
	}


	public String scramble() {
		String s1= str1.substring(0, (str1.length()/2));
		String s2= str2.substring(0, (str2.length()/2));
		String s3= str1.substring((str1.length()/2));
		String s4= str2.substring((str2.length()/2));
		String strfinal1= s1+s2+s3+s4;
		return strfinal1;
}


public String toString() {
		String w =  "str1 = \""+str1+"\"\t\tStr2 = \""+str2+"\"\t";
		return w;
}

	

}


