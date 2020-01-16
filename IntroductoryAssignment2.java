import java.util.Scanner;


public class IntroductoryAssignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		System.out.println("Please enter your first name:");
		firstName = input.nextLine();
		System.out.println("Please enter your last name:");
		lastName = input.nextLine();
		System.out.printf("Welcome %s %s\n", firstName, lastName);
		System.out.println("This is my first java program!");
		System.out.println("Java is fun and Ms. Thomas is Great!");
	}

}
