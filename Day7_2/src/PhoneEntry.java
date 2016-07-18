import java.util.ArrayList;

/**
 * Created by tranh on 11-Jul-16.
 */
public class PhoneEntry {
    public String name;
    public ArrayList<String> phoneNumber = new ArrayList();

    public PhoneEntry() {

    }

    public PhoneEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber.add(phoneNumber);
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;

    }

    public String getPhoneNumberString() {
        String getphoneNumber = "";
        for (int i = 0; i < phoneNumber.size(); i++) {
            getphoneNumber = getphoneNumber + phoneNumber.get(i).toString() + " ";
        }
        return getphoneNumber + "\n";
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber.add(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(String name, ArrayList<String> phoneNumber) {
        String contact = name + "\n Số điện thoại: ";
        for (int i = 0; i < phoneNumber.size(); i++) {
            contact = contact + phoneNumber.get(i).toString() + " ";
        }
        contact = contact + "\n--------\n";
        return contact;
    }
}
