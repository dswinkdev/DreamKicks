import java.lang.reflect.Array;
import java.util.Scanner;

public class DreamKicks {

	public static void welcomeMsg() {
		System.out.println(":::::::::::::::::");
		System.out.println(": Dream ! Kicks :");
		System.out.println(":::::::::::::::::");

		System.out.println("\n\"Customize Your Dream Shoe.\"\n");
	}

	public static void shoeStyleMenu() {
		System.out.println("Choose a shoe style: ");
		System.out.println("(1) Running");
		System.out.println("(2) Sneaker");
		System.out.println("(3) Slider");
		System.out.println("(4) Boot");
	}

	public static void shoeColorMenu() {
		System.out.println("Choose a shoe color: ");
		System.out.println("(1) Red");
		System.out.println("(2) Blue");
		System.out.println("(3) Orange");
		System.out.println("(4) Purple");
	}

	public static void quitProgram() {
		System.out.println("You successfully canceled your order. Goodbye!");
	}

	public static void space() {
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String menuPress;

		welcomeMsg();	

		System.out.println("Ready to customize? Press Y/N");
		menuPress = scan.next();

		while (menuPress.equalsIgnoreCase("Y")){

			// display shoe menu
			shoeStyleMenu();
			
			
			
			int shoeStyle = scan.nextInt();

			if (shoeStyle == 1) {
				System.out.println("RUNNING");
			} if (shoeStyle == 2) {
				System.out.println("SNEAKER");
			} if (shoeStyle == 3) {
				System.out.println("SLIDER");
			} if (shoeStyle == 4) {
				System.out.println("BOOT");
			}

			System.out.println(shoeStyle);

			// display shoe color
			shoeColorMenu();
			int shoeColor = scan.nextInt();

			// RUNNING SHOE if statement
			if (shoeStyle == 1 && shoeColor == 1) {
				System.out.println("RED RUNNING SHOE");
			} if (shoeStyle == 1 && shoeColor == 2) {
				System.out.println("BLUE RUNNING SHOE");
			} if (shoeStyle == 1 && shoeColor == 3) {
				System.out.println("ORANGE RUNNING SHOE");
			} if (shoeStyle == 1 && shoeColor == 4) {
				System.out.println("PURPLE RUNNING SHOE");
			} 

			// SNEAKER SHOE if statement
			if (shoeStyle == 1 && shoeColor == 1) {
				System.out.println("RED RUNNING SNEAKER");
			} if (shoeStyle == 1 && shoeColor == 2) {
				System.out.println("BLUE RUNNING SNEAKER");
			} if (shoeStyle == 1 && shoeColor == 3) {
				System.out.println("ORANGE RUNNING SNEAKER");
			} if (shoeStyle == 1 && shoeColor == 4) {
				System.out.println("PURPLE RUNNING SNEAKER");
			} 

			// SLIDER SHOE if statement
			if (shoeStyle == 1 && shoeColor == 1) {
				System.out.println("RED RUNNING SLIDER");
			} if (shoeStyle == 1 && shoeColor == 2) {
				System.out.println("BLUE RUNNING SLIDER");
			} if (shoeStyle == 1 && shoeColor == 3) {
				System.out.println("ORANGE RUNNING SLIDER");
			} if (shoeStyle == 1 && shoeColor == 4) {
				System.out.println("PURPLE RUNNING SLIDER");
			} 

			// BOOT SHOE if statement
			if (shoeStyle == 1 && shoeColor == 1) {
				System.out.println("RED RUNNING BOOT");
			} if (shoeStyle == 1 && shoeColor == 2) {
				System.out.println("BLUE RUNNING BOOT");
			} if (shoeStyle == 1 && shoeColor == 3) {
				System.out.println("ORANGE RUNNING BOOT");
			} if (shoeStyle == 1 && shoeColor == 4) {
				System.out.println("PURPLE RUNNING BOOT");
			} 

			System.out.println(shoeStyle + " " + shoeColor);

		} if (menuPress.equalsIgnoreCase("N")){
			// quit program
			quitProgram();
			// close scanner
			scan.close();
		}	else {
			System.out.println("You've entered an invalid entry");
		}

	}

}
