import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by tranh on 12-Aug-16.
 */
public class MainB4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double slide1, slide2, slide3;
        try {
            System.out.println("Nhập cạnh 1: ");
            slide1 = input.nextDouble();
            System.out.println("Nhập cạnh 2: ");
            slide2 = input.nextDouble();
            System.out.println("Nhập cạnh 3: ");
            slide3 = input.nextDouble();
            try {
                TriangleB4 triangle = new TriangleB4(slide1, slide2, slide3);
            } catch (IllegalArgumentException e) {
                System.out.println("Độ dài 3 cạnh không thỏa mãn!");
                System.out.println("Lỗi " + e.toString());
            }
        } catch (InputMismatchException ex) {
            System.out.println("Cạnh của tam giác phải là 1 số!");
            System.out.println("Lỗi " + ex.toString());
        }
    }
}
