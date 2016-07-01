import java.util.Scanner;

/**
 * Created by hao on 25/06/2016.
 */
public class B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a, b, c: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        if (a==0&&b==0&&c!=0) {
            System.out.println("Phhương trình vô nghiệm!");
        }
        if (a==0&&b!=0)
            System.out.println("Phương trình có nghiệm duy nhất x= "+-c/b);
        if (a==0&&b==0&&c==0) {
            System.out.println("Phhương trình vô số nghiệm!");
        }
        else {
            double denta=b*b -4*a*c;
            if (denta<0)
                System.out.println("Phương trình vô nghiệm!");
            else
                if (denta==0)
                    System.out.println("Phương trình có nghiệm kép x = "+ (-b/2*a) );
                else
                    System.out.println("Phương trình có 2 nghiệp phân biệt x1= "+(-b+Math.sqrt(denta)/2*a)+" x2= "+(-b-Math.sqrt(denta)/2*a));
        }
    }
}
