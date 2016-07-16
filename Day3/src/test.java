import java.util.Scanner;

/**
 * Created by tranh on 06-Jul-16.
 */
public class test {
    public static long getNumber(long number) {
        String str= String.valueOf(number);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int)(number % 10);
            number = number / 10;
        }
        for (int i = 0; i < str.length(); i++)
            for (int j = 0; j < str.length(); j++) {
                if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
            }
        int pos=0;
        while (arr[pos]==0) {
            pos++;
        }
        if (pos!=0) {
            int temp = arr[pos];
            arr[pos] = arr[0];
            arr[0] = temp;
        }
        String newStr = "";
                for (int i = 0; i < str.length(); i++) {
                    newStr = newStr + arr[i];
                }
                return Long.valueOf(newStr);
            }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        System.out.println("Số bé nhất : "+getNumber(number));
    }
}
