import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arrNum = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrNum[i] = input.nextInt();
        }
        Arrays.sort(arrNum);
        System.out.print("The elements in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrNum[i] + " ");
        }
        System.out.print("\nThe elements in descending order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arrNum[i] + " ");
        }

        input.close();
    }
}
