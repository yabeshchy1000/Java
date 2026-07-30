import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isPrime = true;
        System.out.print("Enter a number to check : ");
        int num = input.nextInt();

        for (int i=2; i <= num/2; i++) {
            if (num%i == 0) {
                isPrime = false;
                break;
            }
        }

        if (num < 2) {
            System.out.println(num + " is neither prime nor composite number");
        }else if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is a composite number");
        }
        
        input.close();
    }
}