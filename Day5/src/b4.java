import java.util.Scanner;

/**
 * Created by tranh on 03-Jul-16.
 */
public class b4 {
    public static boolean isSorted(int[] array) {
        int dem = 0;
        int i = 0;
        if (array.length == 0)
            return true;
        else {
            while ((i <= array.length - 2) && array[i] <= array[i + 1]) {
                dem = i;
                i++;
            }
            if (dem == array.length - 2)
                return true;
            else
                return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ rộng mảng:");
        int n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.print("Nhập các phần tử: ");
        for (int i=0;i<n;i++) {
            System.out.println("a["+i+"]= ");
            arr[i]=sc.nextInt();
        }
        if (isSorted(arr))
            System.out.println("Mảng đã sắp xếp!");
        else
            System.out.println("Mảng chưa sắp xếp!");
    }

}
