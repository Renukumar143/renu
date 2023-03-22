package file;

public class javaprogram1 {
//How do we reverse a string
	public static void main(String[] args) {
		String a = "java program";
		String b = "";
		char c;
		for (int i = a.length() - 1; i >= 0; i--) {
			c = a.charAt(i);
			b += c;
		}
		System.out.println("original String :" + a);
		System.out.println("Reverse :" + b);
	}

}
