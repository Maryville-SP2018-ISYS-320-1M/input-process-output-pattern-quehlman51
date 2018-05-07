import java.util.Scanner;

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P4_ScalableBox {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many units tall would you like? ");
		int height = console.nextInt();
		System.out.print("How many units wide would you like? ");
		int width = console.nextInt();
		
		drawBoxCap(width);
		drawBoxInsides(height, width);
		drawBoxCap(width);
	}
	
	public static void drawBoxCap(int width) {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides(int height, int width) {
		for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
			drawBoxInsideLine(width);
		}
	}
	
	public static void drawBoxInsideLine(int width) {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
