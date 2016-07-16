/**
 * Created by tranh on 11-Jul-16.
 */
public class PhoneEntry {
    public String name;
    public String phoneNumber;
    public PhoneEntry() {

    }
    public PhoneEntry(String name,String phoneNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(String name,String phoneNumber) {
        return "Tên: "+name+"\n"+"Số điện thoại: "+phoneNumber+" \n"+"-------------\n";
    }
}
