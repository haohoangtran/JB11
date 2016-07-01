import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class b13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng!");
        int size=sc.nextInt();
        int[] arrayList;int min=0,max=0;
        arrayList=new int[size];
        for (int i=0;i<size;i++) {
            System.out.println("Nhập phần tử "+(i+1)+":");
            arrayList[i]=sc.nextInt();
            if (i==0)
            {
                min=arrayList[0];
                max=arrayList[0];
            }
            if(min<arrayList[i])
                min=arrayList[i];
            if (max>arrayList[i])
                max=arrayList[i];

        }
        System.out.print("Các phần tử [");
        for (int i=0;i<size;i++) {


            if (i != size - 1)

                System.out.print(arrayList[i] + ", ");
            else
                System.out.print(arrayList[i]+"]");
        }
    }
}
