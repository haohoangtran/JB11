import java.util.Scanner;

/**
 * Created by tranh on 26-Jun-16.
 */
public class b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] arr=new int[100];
        int i=0;int n;int dem=0;
        System.out.println("Nhập các phần tử của mảng:");
        do {
            System.out.println("arr["+i+"]= ");
            n=sc.nextInt();;
            arr[i]=n;
            i++;
            dem++;
        }
        while (n!=0);
        int total=0;double medium=0;
        for (int j=0;j<dem;j++)
        {
            total=total+arr[j];
        }
        medium=(double)total/dem;
        System.out.println("Tổng= "+total);
    }
}
