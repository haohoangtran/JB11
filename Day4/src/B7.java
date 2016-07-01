import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class B7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập xâu:");
        String str=sc.nextLine();
        String s1=str.substring(0,str.length()/2);
        String s2=new StringBuffer(s1).reverse().toString();
        if(str.endsWith(s2))
            System.out.println("Chuỗi đối xứng");
        else
            System.out.println("Chuỗi không đối xứng!");
    }
}
