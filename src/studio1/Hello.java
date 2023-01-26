package studio1;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Bill. How are you?");
		String mood = in.nextLine();
		String name = scan.nextLine();
		System.out.println("Greetings" + name);
		System.out.println("Hello and welcome to CSE 131!");
		System.out.println("You seem to be feeling " + mood);
	}

}
