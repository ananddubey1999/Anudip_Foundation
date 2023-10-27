import java.util.*;

public class L8ArrayBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the sorted elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search");
        int target = scanner.nextInt();
        scanner.close();

        int start = 0;
        int End = arr.length - 1;
        int result = -1;

        while (start <= End) {
            int mid = start + (End - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                End = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
