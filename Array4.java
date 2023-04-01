import java.util.Scanner;

public class LargestPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arrNum = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arrNum[i] = scanner.nextInt();
        }

        int largestPrime = Integer.MIN_VALUE;
        for (int num : arrNum) {
            if (isPrime(num) && num > largestPrime) {
                largestPrime = num;
            }
        }

        if (largestPrime == Integer.MIN_VALUE) {
            System.out.println("There are no prime numbers in the array");
        } else {
            System.out.println("The largest prime number in the given array is: " + largestPrime);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
