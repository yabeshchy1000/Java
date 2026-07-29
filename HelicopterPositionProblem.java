import java.util.Scanner;

public class HelicopterPositionProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        int r = input.nextInt();
        System.out.println("Enter the position of Helicopter : ");
        System.out.print("Enter x-axis : ");
        int x = input.nextInt();
        System.out.print("Enter y-axis : ");
        int y = input.nextInt();
        
        double TempRadius = Math.sqrt(x*x + y*y);
        if (TempRadius == r) {
            System.out.println("Helicopter is exactly on circumference");
        } else if (TempRadius == 0) {
            System.out.println("Helicopter is in the center of the circle");
        } else if (TempRadius > r) {
            System.out.println("Helicopter is outside the circle");
        } else {
            System.out.println("Helicopter is inside the circle");
        }
        input.close();      // due to resource leak
    }
}
