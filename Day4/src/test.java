import java.util.Scanner;

/**
 * Created by tranh on 01-Jul-16.
 */
public class test {
    public static double getResult(double a,double b) {
        double result=0;
        if (b>=0) {
            for (int i = 0; i < b; i++) {
                result = result + a;
            }
            return result;
        }
        else {
            if ((a<0&&b<0)) {
                return getResult(-a,-b);
            }
            else
                    return getResult(-a,-b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a=sc.nextDouble();
        System.out.print("Nhập b: ");
        double b=sc.nextDouble();
        System.out.println("a x b = "+getResult(a,b));
    }
        }


