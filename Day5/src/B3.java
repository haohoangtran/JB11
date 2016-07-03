import java.util.Scanner;

/**
 * Created by tranh on 02-Jul-16.
 */
public class B3 {
    public static int[] getAray(long number) {
        String str = String.valueOf(number);
        String str2 = new StringBuffer(str).reverse().toString();
        int[] arr;
        arr = new int[str2.length()];
        long number2 = Long.valueOf(str2);
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int) (number2 % 10);
            number2 = number2 / 10;
        }
        return arr;
    }

    public static int getDigit(int number) {
        if (number < 10)
            return number;
        else
            return number % 10 + number / 10;
    }

    public static int getSize(long number) {
        int[] arr = getAray(number);
        return arr.length;
    }

    public static boolean isRightPrefix(long number) {
        int[] arr = getAray(number);
        if ((arr[0] == 4 || arr[0] == 5 || arr[0] == 6) || (arr[0] == 3 && arr[1] == 7))
            return true;
        else
            return false;
    }

    public static int getPrefix(long number, int n) {
        int[] arr = getAray(number);
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + arr[i];
        }
        return Integer.valueOf(str);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int arr[] = getAray(number);
        int sum = 0;

        for (int i = arr.length - 2; i >= 0; i -= 2) {
            sum = sum + getDigit(arr[i] * 2);
        }
        return sum;
    }

    public static int sumOfOddPlace(long number) {
        int arr[] = getAray(number);
        int sum = 0;

        for (int i = arr.length - 1; i > 0; i -= 2) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static boolean isValid(long number) {

        if (!isRightPrefix(number) || getSize(number) < 13 || getSize(number) > 16) {
            return false;
        } else {
            int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
            if (sum % 10 == 0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;
        do {
            System.out.println("Nhập mã thẻ cần check (nhập 0 để dừng chương trình) :");
            number = sc.nextLong();
            if (number == 0) {
                break;
            }
            if (isValid(number)) {
                System.out.println("Mã thẻ hợp lệ!");
            } else {
                System.out.println("Mã thẻ không hợp lệ!");
            }
        } while (number != 0);


    }
}
