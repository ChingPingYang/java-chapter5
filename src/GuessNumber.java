import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a number from 0 - 100.");
		int number = (int)(Math.random() * 101);
		
		int guess = input.nextInt();
		
		while (guess != number) {
			if (guess < number) {
				System.out.print("Too small.");
			} else if (guess > number) {
				System.out.print("Too big.");
			}
			System.out.println(" Try again.");
			guess = input.nextInt();
		}
		System.out.println("You win!");
		input.close();
	}

}
