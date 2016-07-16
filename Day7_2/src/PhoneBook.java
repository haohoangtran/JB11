/**
 * Created by tranh on 11-Jul-16.
 */
import java.util.ArrayList;

public class PhoneBook {
    private int numberOfEntries;
    ArrayList<PhoneEntry> phoneEntries = new ArrayList();


    public PhoneBook() {

    }

    public int getNumberOfEntries() {
        return phoneEntries.size();
    }
    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }
    private boolean	isDuplicateNumber(String entryNumber) {
        if (phoneEntries.isEmpty()){
            return false;
        }
        else {
            for (int i=0;i<phoneEntries.size();i++) {
                if (phoneEntries.get(i).getPhoneNumber().indexOf(entryNumber)!=-1) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean	isDuplicateName(String entryName) {
        if (phoneEntries.size()==0){
            return false;
        }
        else {
            for (int i=0;i<phoneEntries.size();i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean	addEntry(PhoneEntry entry) {
        if (isDuplicateName(entry.getName()) || isDuplicateNumber(entry.getPhoneNumber().get(0))) {
            return false;
        }
        else  {
            phoneEntries.add(entry);
            return true;
        }
    }
    public boolean addNumber(String number,String name) {
        if (!isDuplicateName(name))
            return false;
        else {
            for (int i=0;i<phoneEntries.size();i++) {
                if (phoneEntries.get(i).getName().equals(name)) {
                    phoneEntries.get(i).setPhoneNumber(number);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean	deleteEntry(String entryName) {
        if (numberOfEntries==0||!isDuplicateName(entryName)) {
            return false;
        }
        else {
            int posOfEntryName=-1;

            for (int i=0;i<phoneEntries.size();i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    posOfEntryName=i;
                }
                if (posOfEntryName!=1) {
                    phoneEntries.remove(posOfEntryName);
                    return true;
                }

            }
        }
        return false;
    }
    public PhoneEntry findEntryByName(String entryName) {
        for (int i=0;i<phoneEntries.size();i++) {
            if (phoneEntries.get(i).getName().equals(entryName)) {
                return phoneEntries.get(i);
            }
        }
        return null;
    }
    public PhoneEntry findEntryByNumber(String entryNumber) {
        for (int i=0;i<phoneEntries.size();i++) {
            if (phoneEntries.get(i).getPhoneNumberString().equals(entryNumber)) {
                return phoneEntries.get(i);
            }
        }
        return null;
    }
    public boolean	modifyEntryName(String oldName, String newName) {

        if (isDuplicateName(oldName)) {
          for (int i=0;i<phoneEntries.size();i++) {
              if (phoneEntries.get(i).getName().equals(oldName)) {
                  phoneEntries.get(i).setName(newName);
                  return true;
              }
          }
        }
        return false;
    }
    public boolean	modifyEntryNumber(String entryName, String newNumber) {
        if (isDuplicateNumber(entryName)) {
            for (int i=0;i<phoneEntries.size();i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    phoneEntries.get(i).setPhoneNumber(newNumber);
                    return true;
                }
            }
        }
        return false;
    }
    public String toString() {
        String str="";
        for (int i=0;i<phoneEntries.size();i++) {
            str=str+phoneEntries.get(i).toString(phoneEntries.get(i).getName(),phoneEntries.get(i).getPhoneNumber());
        }
        return str;
    }

}
