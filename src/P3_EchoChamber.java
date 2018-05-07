import java.util.Scanner;

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P3_EchoChamber {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your phrase? ");		 
		String phrase = console.nextLine(); 
		System.out.print("How many times to repeat? ");
		int number = console.nextInt(); 
		for (int i = 1; i <= number; i++)
		{
			System.out.println(phrase);
		}
	}

}
