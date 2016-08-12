import java.io.IOException;
import java.util.Scanner;

/**
 * Created by tranh on 12-Aug-16.
 */
public class B2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean check = true;
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Nhập vị trí:");
            int index;
            index = input.nextByte();
            try {
                System.out.println(array[index]);
                check = false;
            } catch (ArrayIndexOutOfBoundsException rt) {
                System.out.println("Lỗi");
                System.out.println(rt.toString());
                check = true;

            }


        } while (check);

    }
}
