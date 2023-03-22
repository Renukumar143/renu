package file;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class javaprogram2 {
//Write a Program to remove duplicates in an ArrayList.
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("noot");
		a.add("book");
		a.add("pen");
		a.add("book");
		a.add("pen");
		a.add("Scale");
		System.out.println("orignal List :" + a);
		Set<String> b = new LinkedHashSet<String>(a);
		System.out.println("New list :" + b);

	}

}
