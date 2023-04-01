import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the super set array: ");
        int sizeSuperSet = scanner.nextInt();

        int[] arrSuperSet = new int[sizeSuperSet];
        for (int i = 0; i < sizeSuperSet; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arrSuperSet[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the subset array: ");
        int sizeSubSet = scanner.nextInt();

        int[] arrSubSet = new int[sizeSubSet];
        for (int i = 0; i < sizeSubSet; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arrSubSet[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arrSuperSet) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of elements in subset array present in super set array:");
        for (int num : arrSubSet) {
            int freq = freqMap.getOrDefault(num, 0);
            System.out.println("Frequency of " + num + ": " + freq);
        }
    }
}
