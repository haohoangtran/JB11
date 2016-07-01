import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class B18 {

    public static boolean isLeapYear(int year) {
        return (year%4==0&&(year%100!=0||year%400==0));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year=sc.nextInt();
        if (isLeapYear(year))
            System.out.println("Năm nhuận!");
        else
            System.out.println("Năm không nhuận!");
    }
}
