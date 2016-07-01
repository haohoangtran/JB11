import java.util.Scanner;

/**
 * Created by hao on 25/06/2016.
 */
public class b3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập năm:");
        int year=sc.nextInt();
        System.out.println("Nhập tháng:");
        int month=sc.nextInt();
        while (1>month||month>12) {
            System.out.println("Nhập tháng: ");
            month=sc.nextInt();
        }
        System.out.println("Nhập ngày:");
        int day=sc.nextInt();
        while (day<1||day>31) {
            System.out.println("Nhập ngày: ");
            day=sc.nextInt();
        }
        if (year%4!=0&& (month==2&&(day==29||day==30)))
                day=28;
        if ((year%4==0  && (year%100!=0||year %400==0))&&day==30)
                day=29;
        int h,q,m=0,k,j;
        q=day;
        switch (month) {
            case 1:
                m=13;
                break;
            case 2:
                m=14;
                break;
            case 3:
                m=3;
                break;
            case 4:
                m=4;
                break;
            case 5:
                m=5;
                break;
            case 6:
                m=6;
                break;
            case 7:
                m=7;
                break;
            case 8:
                m=8;
                break;
            case 9:
                m=9;
                break;
            case 10:
                m=10;
                break;
            case 11:
                m=11;
                break;
            case 12:
                m=12;
                break;
        }if (month==1||month==2) {
            j = (year - 1) / 100;
            k = (year - 1) % 100;
        }
        else {
            j = year / 100;
            k = year % 100;
        }
        h=(q + (26*(m+1))/10 + k + k/4 + j/4 + 5*j)%7;

        switch (h) {
            case 0:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Thứ 7");
                break;
            case 1:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Chủ Nhật");
                break;
            case 2:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Thứ 2");
                break;
            case 3:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Thứ 3");
                break;
            case 4:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Thứ 4");
                break;
            case 5:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Thứ 5");
                break;
            case 6:
                System.out.println("Ngày "+day+" tháng "+month+" năm "+year+ " là Thứ 6");
                break;
        }

    }
}
