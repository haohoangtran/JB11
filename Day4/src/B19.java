import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class B19 {
    public static void swap(int x, int y) {
        int temp=x;
        x=y;
        y=temp;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x=sc.nextInt();
        System.out.println("Nhập y: ");
        int y=sc.nextInt();
        swap(x,y);
    }
}
