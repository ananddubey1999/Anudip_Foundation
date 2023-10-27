public class l1PrimeNumber {
 public static void main(String[] args) {
        int lowerLimit = 1;
        int upperLimit = 100;

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}