import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tranh on 12-Aug-16.
 */
public class B3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phép toán: ");
        String strInput = input.nextLine();
        String strCaculator = "";
        for (int i = 0; i < strInput.length(); i++) {
            if (strInput.charAt(i) != ' ') {
                if (strInput.charAt(i) == 'X') {
                    strCaculator += 'x';
                } else
                    strCaculator += strInput.charAt(i);
            }
        }
        int posOfOperator;
        if (strCaculator.indexOf("+") != -1) {
            posOfOperator = strCaculator.indexOf("+");
            try {
                int number1 = Integer.valueOf(strCaculator.substring(0, posOfOperator));
                int number2 = Integer.valueOf(strCaculator.substring(posOfOperator + 1, strCaculator.length()));
                System.out.println("Tổng 2 số là: " + (number1 + number2));
            } catch (NumberFormatException ex) {
                System.out.println("Bạn nhập sai số hạng trong phép toán!");
                System.out.println("Lỗi " + ex.toString());
            }
        } else if (strCaculator.indexOf("-") != -1) {
            posOfOperator = strCaculator.indexOf("-");
            try {
                int number1 = Integer.valueOf(strCaculator.substring(0, posOfOperator));
                int number2 = Integer.valueOf(strCaculator.substring(posOfOperator + 1, strCaculator.length()));
                System.out.println("Hiệu 2 số là: " + (number1 - number2));
            } catch (NumberFormatException ex) {
                System.out.println("Bạn nhập sai số hạng trong phép toán!");
                System.out.println("Lỗi " + ex.toString());
            }
        } else if (strCaculator.indexOf("x") != -1) {
            posOfOperator = strCaculator.indexOf("x");
            try {
                int number1 = Integer.valueOf(strCaculator.substring(0, posOfOperator));
                int number2 = Integer.valueOf(strCaculator.substring(posOfOperator + 1, strCaculator.length()));
                System.out.println("Tích 2 số là: " + (number1 * number2));
            } catch (NumberFormatException ex) {
                System.out.println("Bạn nhập sai số hạng trong phép toán!");
                System.out.println("Lỗi " + ex.toString());
            }
        } else if (strCaculator.indexOf(":") != -1) {
            posOfOperator = strCaculator.indexOf(":");
            try {
                int number1 = Integer.valueOf(strCaculator.substring(0, posOfOperator));
                int number2 = Integer.valueOf(strCaculator.substring(posOfOperator + 1, strCaculator.length()));
                System.out.println("Thương 2 số là: " + (number1 / (double) number2));
            } catch (NumberFormatException ex) {
                System.out.println("Bạn nhập sai số hạng trong phép toán!");
                System.out.println("Lỗi " + ex.toString());
            }
        } else
            System.out.println("Bạn nhập sai toán tử!");
    }
}
