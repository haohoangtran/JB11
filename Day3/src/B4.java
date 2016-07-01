import java.util.Scanner;

/**
 * Created by hao on 25/06/2016.
 */
public class B4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập xâu 1: ");
        String str1=sc.nextLine();
        System.out.println("Nhập xâu 2: ");
        String str2=sc.nextLine();
        int vt=-1;
        vt=str1.indexOf(str2);
        if (vt==-1) {
            System.out.println("Chuỗi \""+str2+"\" không là chuỗi con của chuỗi \""+str1+"\" .");
        }
        else {
            System.out.println("Chuỗi \""+str2+"\" là chuỗi con của chuỗi \""+str1+"\" .");
        }
        System.out.println(vt);
    }
}
