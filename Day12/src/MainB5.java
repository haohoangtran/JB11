import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by tranh on 12-Aug-16.
 */
public class MainB5 {
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
                TriangleB5 triangle = new TriangleB5(slide1, slide2, slide3);
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (InputMismatchException ex) {
            System.out.println("Cạnh của tam giác phải là 1 số!");
            ex.printStackTrace();
        }
    }
}
