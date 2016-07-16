import java.util.Scanner;

/**
 * Created by tranh on 30-Jun-16.
 */
public class B7 {
    public static void main(String[] args) {
        int[] a= new int[9];
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập xâu:");
        String str=sc.nextLine();
        String s1=str.substring(0,str.length()/2);
        String s2="";
        for (int i=str.length()-1;i>=str.length()/2+1;i--) {
            s2=s2+str.charAt(i);
        }
        System.out.println(s2);
        if(str.endsWith(s2))
            System.out.println("Chuỗi đối xứng");
        else
            System.out.println("Chuỗi không đối xứng!");
    }
}
