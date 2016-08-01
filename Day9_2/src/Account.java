import java.util.Date;

/**
 * Created by tranh on 18-Jul-16.
 */
public class Account {
    private int id;
    private double soDu,laiSuatNam;
    private Date date;

    public Account() {

    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Account(int id, int sodu) {
        this.id=id;
        this.soDu =sodu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public double getLaiSuatNam() {
        return laiSuatNam;
    }

    public Date getDate() {
        return date;
    }

    public void setLaiSuatNam(double laiSuatNam) {
        this.laiSuatNam = laiSuatNam;
    }
    public  double getLaiSuatThang() {
        return laiSuatNam/12;
    }
    public double getLoiNhuanHangThang() {
        return getLaiSuatThang()* getSoDu();
    }
    public void   rutTien(double value) {
        this.soDu = getSoDu()-value;
    }
    public void napTien(double value) {
        this.soDu=getSoDu()+value;
    }

}
