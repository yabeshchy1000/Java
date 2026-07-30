public class SumOfInitialFourPrime {
    public static void main(String[] args) {
        int count=0, sum=0;
        for (int i=2; i <= 100 && count < 4; i++) {
            boolean isPrime = true;
            for (int j=2; j<i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
        }
        System.out.println("Sum of initial four prime numbers is " + sum);
    }    
}
