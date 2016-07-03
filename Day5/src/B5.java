import java.util.Scanner;

/**
 * Created by tranh on 03-Jul-16.
 */
public class B5 {
    public static int getNumber(int[] arr,int number) {
        int dem=0;
        for (int i=0;i<arr.length;i++) {
            if (number==arr[i])
                dem++;
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các số từ 0 đến 100: ");
        int[] arr;
        String[] str;
        int i = 0;
        arr = new int[100];
        do {
            int n = sc.nextInt();
            if (n == 0)
                break;
            arr[i] = n;
            i++;
        } while (arr[i - 1] != 0);

        for (int j=0;j<i;j++){

            System.out.println("Số "+arr[j]+" xuất hiện "+getNumber(arr,arr[j])+" lần!");
        }
    }
}
