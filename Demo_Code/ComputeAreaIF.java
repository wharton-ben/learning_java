import java.util.Scanner;

public class ComputeAreaIF {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    double radius; // Declare radius
    double area; // Declare area

    // Prompt and read radius
    System.out.print("Please enter a radius: ");
    radius = input.nextDouble();

    if (radius >= 0){
		// Compute area
		area = radius * radius * 3.14159;

		// Display results
		System.out.println("The area for the circle of radius " +
		  radius + " is " + area);
	}
  }
}
