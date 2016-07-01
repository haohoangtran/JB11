import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by hao on 24/06/2016.
 */
public class B4 {
    public static void BMI( ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao (m) :");
         double chieuCao = sc.nextDouble();
        System.out.println("Nhập vào cân nặng (kg) :");
        int canNang = sc.nextInt();
        double BMI = (double) canNang / (chieuCao * chieuCao);
        if (BMI < 18.5)
            System.out.println("Bạn bị thiếu cân!");

        else if (BMI < 25) {
            System.out.println(" Bạn là người lý tưởng!");
        } else {
            if (BMI <= 30) {
                System.out.println("Bạn thừa cân!");
            } else {
                System.out.println("Bạn béo phì!");
            }
        }
    }
    public static void main(String[] args) {
        String temp;char cha;
        do {
            BMI();
            Scanner sc=new Scanner(System.in);
            System.out.println("Bạn có muốn tiếp tục không?");
            System.out.println("1. Có");
            System.out.printf("2. Không!");
            temp=sc.nextLine();
            cha=temp.charAt(0);


        }while (cha=='1'||cha=='Y'||cha=='y');
        System.out.println("Đã thoát!");
    }
}