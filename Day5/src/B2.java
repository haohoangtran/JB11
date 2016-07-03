import java.util.Scanner;

/**
 * Created by tranh on 02-Jul-16.
 */
public class B2 {
    public static int sumOfDigit(long number){
        long sum=0;
        while(number!=0) {
            sum=sum+ number%10;
            number=number/10;
        }
        return  (int) sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số: ");
        long number=sc.nextLong();
        System.out.println("Tổng các chữ số của "+number+" là: "+sumOfDigit(number));
    }
}
