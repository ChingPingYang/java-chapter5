import java.util.Scanner;
public class RepeatMultiplicationQuiz {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int sum = num1 * num2;
		System.out.println("What's " + num1 + " * " + num2 + "?: ");
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		while (answer != sum) {
			System.out.println("Wrong, please try again.");
			answer = input.nextInt();	
		}
		System.out.println("Correct");
				
	}

}
