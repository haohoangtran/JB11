import java.util.Date;
import java.util.Scanner;

/**
 * Created by tranh on 18-Jul-16.
 */
public class Main {

    public static void main(String[] args) {
        Account account=new Account();
        Date date=new Date();
        account.setId(1122);
        account.setSoDu(20000);
        account.setLaiSuatNam(4.5/100);
        account.rutTien(2500);
        account.napTien(3000);
        account.setDate(date);
        System.out.println("Số dư: "+account.getSoDu());
        System.out.println("Lợi nhuận tháng: "+account.getLoiNhuanHangThang());
        System.out.println("Ngày tạo: "+date.toString());


    }
}
