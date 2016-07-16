import java.util.Scanner;

/**
 * Created by tranh on 04-Jul-16.
 */
public class B14 {
    public static int[] insert(int[] arr, int value, int pos) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i <= pos; i++) {
            newArray[i] = arr[i];
        }
        newArray[pos] = value;
        for (int i = pos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }

    public static int[] edit(int[] arr, int value, int pos) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < pos; i++) {
            arr1[i] = arr[i];
        }
        arr1[pos] = value;
        for (int i = pos + 1; i < arr.length; i++) {
            arr1[i] = arr[i];

        }
        return arr1;
    }

    public static int[] delete(int[] arr, int pos) {
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < pos; i++) {
            arr1[i] = arr[i];
        }

        for (int i = pos; i < arr.length; i++) {
            arr1[i - 1] = arr[i];

        }
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println("Nhập độ rộng của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "= ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        int[] arr1 = insert(arr, 3, 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
