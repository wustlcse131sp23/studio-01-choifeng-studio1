package studio1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("What's the first number?");
		int n1 = in.nextInt();
		System.out.print("What's the second number?");
		int n2 = in.nextInt();
		double average = (n1+n2)/2.0;
		System.out.print(average);
	}

}
