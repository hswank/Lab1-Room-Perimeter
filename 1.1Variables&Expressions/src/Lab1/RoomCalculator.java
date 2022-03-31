package Lab1;
import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		int userContinue;
		boolean flag = true;
		
		while (flag == true) {
	
		
			System.out.print("Please enter the room length");
			length = input.nextDouble();

			System.out.print("Please enter the room width");
			width = input.nextDouble();
			
			System.out.print("Please enter the room height");
			height = input.nextDouble();

			area = length * width;
			perimeter = (length * 2) + (width * 2);
			volume = length * width * height;
			
			System.out.printf("Area: %.1f%nPerimeter: %.1f%nVolume: %.1f%n%n", area, perimeter, volume);
			
			System.out.print("Do you want to measure a new room? Enter 1 for yes, 2 for no.");
			userContinue = input.nextInt();
			
			if (userContinue == 2) {
				flag = false;
			}
		
		}
		
	}

}
