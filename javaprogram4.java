package file;

import java.util.Scanner;

public class javaprogram4 {
//Print Multiplication table Program in java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number what table you want");
		int a = sc.nextInt();
		int b;
		for (int i = 1; i <= 10; i++) {
			b = a * i;

			System.out.println(i + "*" + a + "=" + b);
		}
	}

}
