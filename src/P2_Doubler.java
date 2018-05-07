import java.util.Scanner;

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P2_Doubler {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What is your number? ");
		int number = console.nextInt();
		System.out.print("Your number doubled is: " + (number * 2));
	}

}
