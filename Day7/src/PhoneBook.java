/**
 * Created by tranh on 11-Jul-16.
 */
public class PhoneBook {
    private int numberOfEntries;
    private PhoneEntry[] phoneEntries=new PhoneEntry[numberOfEntries];


    public PhoneBook() {

    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    public PhoneEntry[] getPhoneEntries() {
        return phoneEntries;
    }
    private boolean	isDuplicateNumber(String entryNumber) {
        if (numberOfEntries==0){
            return false;
        }
        else {
            for (int i=0;i<phoneEntries.length;i++) {
                if (phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean	isDuplicateName(String entryName) {
        if (numberOfEntries==0){
            return false;
        }
        else {
            for (int i=0;i<phoneEntries.length;i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean	addEntry(PhoneEntry entry) {
        if (isDuplicateName(entry.getName()) || isDuplicateNumber(entry.getPhoneNumber())) {
            return false;
        }
        else  {
            PhoneEntry[] tempOfPhoneEntries=new PhoneEntry[phoneEntries.length+1];
            for (int i=0;i<phoneEntries.length;i++) {
                tempOfPhoneEntries[i]=phoneEntries[i];
            }
            tempOfPhoneEntries[phoneEntries.length]=entry;
            phoneEntries=new PhoneEntry[tempOfPhoneEntries.length];
            for (int i=0;i<phoneEntries.length;i++) {
                phoneEntries[i]=tempOfPhoneEntries[i];
            }
            return true;
        }
    }
    public boolean	deleteEntry(String entryName) {
        if (numberOfEntries==0||!isDuplicateName(entryName)) {
            return false;
        }
        else {
            PhoneEntry[] tempOfPhoneEntries=new PhoneEntry[phoneEntries.length-1];
            for (int i=0;i<phoneEntries.length;i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    for (int j = 0; j < i; j++) {
                        tempOfPhoneEntries[j] = phoneEntries[j];
                    }
                    for (int j = i; j < phoneEntries.length - 1; j++) {
                        tempOfPhoneEntries[j] = phoneEntries[j + 1];
                    }
                }
            }
                phoneEntries=new PhoneEntry[tempOfPhoneEntries.length];
                for (int i=0;i<phoneEntries.length;i++) {
                    phoneEntries[i]=tempOfPhoneEntries[i];
                }
            }
            return true;
    }
    public PhoneEntry	findEntryByName(String entryName) {
        for (int i=0;i<phoneEntries.length;i++) {
            if (phoneEntries[i].getName().equals(entryName)) {
                return phoneEntries[i];
            }
        }
        return null;
    }
    public PhoneEntry findEntryByNumber(String entryNumber) {
        for (int i=0;i<phoneEntries.length;i++) {
            if (phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
                return phoneEntries[i];
            }
        }
        return null;
    }
    public boolean	modifyEntryName(String oldName, String newName) {

        if (isDuplicateName(oldName)) {
          for (int i=0;i<phoneEntries.length;i++) {
              if (phoneEntries[i].getName().equals(oldName)) {
                  phoneEntries[i].setName(newName);
                  return true;
              }
          }
        }
        return false;
    }
    public boolean	modifyEntryNumber(String entryName, String newNumber) {
        if (isDuplicateNumber(entryName)) {
            for (int i=0;i<phoneEntries.length;i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    phoneEntries[i].setPhoneNumber(newNumber);
                    return true;
                }
            }
        }
        return false;
    }
    public String toString() {
        String str="";
        for (int i=0;i<phoneEntries.length;i++) {
            str=str+phoneEntries[i].toString(phoneEntries[i].getName(),phoneEntries[i].getPhoneNumber());
        }
        return str;
    }

}
