import java.util.Scanner;

/**
 * Created by tranh on 06-Jul-16.
 */
public class test {
    public static void main(String[] args) {
        int resul=0;
        for (int i=0;i<=100;i+=2) {
            if (i!=50)
                resul+=i;
        }
        System.out.println(resul);
    }
}
