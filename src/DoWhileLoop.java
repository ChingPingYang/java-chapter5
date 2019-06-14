import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		
		int sum = 0;
		int user;
		Scanner input = new Scanner(System.in);
		System.out.println("This program will stop once your input \"0\".");
		
		do {
			System.out.println("Put your number: ");
			user = input.nextInt();
			sum += user;		
		} while (user != 0);
		System.out.println("total= " + sum);
				
	}
}
