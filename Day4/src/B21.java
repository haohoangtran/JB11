import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class B21 {
    public static void in(String arr) {
        System.out.println("Chào bạn "+arr);

    }
    public static void in(int age) {
        System.out.println("Bạn "+age+" tuổi!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)
                ;
        System.out.println("Bạn tên : ");
        String name=sc.nextLine();
        System.out.println("Bạn bao nhiêu tuổi: ");
        int age=sc.nextInt();

        in(name);
        in(age);


    }
}
