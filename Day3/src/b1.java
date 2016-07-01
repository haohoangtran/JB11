import java.util.Scanner;

/**
 * Created by hao on 25/06/2016.
 */
public class b1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year=sc.nextInt();
        System.out.println("Nhập tháng: ");
        int month=sc.nextInt();
        while (1>month||month>12) {
            System.out.println("Nhập tháng: ");
             month=sc.nextInt();
        }
        switch (month) {
            case 1:
                System.out.println("Tháng 1 năm "+year+" có 31 ngày");
                break;
            case 2:
                if (year%4==0  && year%100!=0||year %400==0)
                {
                    System.out.println("Tháng 2 năm "+year+" có 29 ngày");
                }
                else
                    System.out.println("Tháng 2 năm "+year+" có 29 ngày");
                break;
            case 3:
                System.out.println("Tháng 3 năm "+year+" có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng 4 năm "+year+" có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng 5 năm "+year+" có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng 6 năm "+year+" có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng 7 năm "+year+" có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng 8 năm "+year+" có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng 9 năm "+year+" có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng 10 năm "+year+" có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng 11 năm "+year+" có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng 12 năm "+year+" có 31 ngày");
                break;

        }
    }
}
