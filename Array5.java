import java.util.Scanner;

public class MoveOnesToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arrNum = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arrNum[i] = scanner.nextInt();
        }

        int countOnes = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] != 1) {
                arrNum[countOnes++] = arrNum[i];
            }
        }

        while (countOnes < arrNum.length) {
            arrNum[countOnes++] = 1;
        }

        System.out.print("Array elements after moving Ones to end: ");
        for (int num : arrNum) {
            System.out.print(num + " ");
        }
    }
}
