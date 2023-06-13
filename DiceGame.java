import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name? ");
	String name;
	System.out.print(">");
	name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
	Random rand = new Random();
	int num, sum = 0;
	System.out.println("Rolling dice...");
	for (int i = 1; i <= 2; i++) {
	    num = rand.nextInt(6) + 1;
	    sum += num;
	    System.out.println("Die " + i + ": " + num);
	}
	System.out.println("Total value: " + sum);
	if (sum > 7) {
		System.out.println("You won!");
	} else {
		System.out.println("You lost");
	}
    }
}