import java.util.Scanner;

/**
 * Created by hao on 25/06/2016.
 */
public class b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số thứ 1:");
        int number1=sc.nextInt();
        System.out.print("\nNhập số thứ 2:");
        int number2=sc.nextInt();
        System.out.print("\nNhập toán tử: :");
        String op=sc.next();
        if (op.length()>=2) {
            System.out.println("Bạn đã nhập sai toán tử! (các toán tử: +, -, x, : )");
        }
        else {
            if(op.charAt(0)!='x'&&op.charAt(0)!='+'&&op.charAt(0)!='-'&&op.charAt(0)!=':')
                System.out.println("Bạn đã nhập sai toán tử! (các toán tử: +, -, x, : )");
            else { switch (op) {
                case "+":
                    System.out.println("Kết quả: "+ (number1+number2));
                    break;
                case "-":
                    System.out.println("Kết quả: "+ (number1-number2));
                    break;
                case "x":
                    System.out.println("Kết quả: "+ (number1*number2));
                    break;
                case ":":
                    System.out.println("Kết quả: "+ ((double)number1/number2));
                    break;
            }

            }
        }
    }
}

