import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class B20 {
    public static String[] reverseArray(String[] arr) {
      String[] arrL;
        arrL=new String[arr.length];
        int j=0;
        for (int i=arr.length-1;i>=0;i--)
        {
            arrL[j]=arr[i];
            j++;
        }

        return arrL;


    }

    public static void main(String[] args) {
        String[] array;

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số phần tử của chuỗi String: ");
        int leng=sc.nextInt();
        array=new String[leng];
        for (int i=0;i<leng;i++) {
            System.out.println("Chuỗi "+(i+1));
            array[i]=sc.next();
        }
        array=reverseArray(array);
        System.out.print("Các phần tử [");
        for (int i=0;i<leng;i++) {


            if (i != leng - 1)

                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]+"]");
        };

    }
}
