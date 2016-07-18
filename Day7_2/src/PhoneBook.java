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

    private boolean isDuplicateNumber(String entryNumber) {
        if (phoneEntries.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getPhoneNumber().indexOf(entryNumber) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isDuplicateName(String entryName) {
        if (phoneEntries.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addEntry(PhoneEntry entry) {
        if (isDuplicateName(entry.getName()) || isDuplicateNumber(entry.getPhoneNumber().get(0))) {
            return false;
        } else {
            phoneEntries.add(entry);
            return true;
        }
    }

    public boolean addNumber(String number, String name) {
        if (!isDuplicateName(name))
            return false;
        else {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(name)) {
                    phoneEntries.get(i).setPhoneNumber(number);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteEntry(String entryName) {
        if (numberOfEntries == 0 || !isDuplicateName(entryName)) {
            return false;
        } else {
            int posOfEntryName = -1;

            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    posOfEntryName = i;
                }
                if (posOfEntryName != 1) {
                    phoneEntries.remove(posOfEntryName);
                    return true;
                }

            }
        }
        return false;
    }

    public PhoneEntry findEntryByName(String entryName) {
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getName().equals(entryName)) {
                return phoneEntries.get(i);
            }
        }
        return null;
    }

    public PhoneEntry findEntryByNumber(String entryNumber) {
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getPhoneNumberString().equals(entryNumber)) {
                return phoneEntries.get(i);
            }
        }
        return null;
    }

    public boolean modifyEntryName(String oldName, String newName) {

        if (isDuplicateName(oldName)) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(oldName)) {
                    phoneEntries.get(i).setName(newName);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean modifyEntryNumber(String entryName, String newNumber) {
        if (isDuplicateNumber(entryName)) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    phoneEntries.get(i).setPhoneNumber(newNumber);
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < phoneEntries.size(); i++) {
            str = str + phoneEntries.get(i).toString(phoneEntries.get(i).getName(), phoneEntries.get(i).getPhoneNumber());
        }
        return str;
    }

    public boolean editNumber(String oldNumber, String newNumber) {
        if (phoneEntries.size() == 0)
            return false;
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getPhoneNumberString().indexOf(oldNumber) != -1) {
                ArrayList<String> arrayList = phoneEntries.get(i).getPhoneNumber();
                for (int j = 0; j < arrayList.size(); j++) {
                    if (arrayList.get(j).equals(oldNumber)) {
                        arrayList.add(newNumber);
                        arrayList.remove(j);
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public ArrayList<PhoneEntry> findByFirstName(char charOfFirstName) {
        ArrayList<PhoneEntry> phoneEntriesFindByFirstName = new ArrayList();
        for (int i = 0; i < phoneEntries.size(); i++) {
            if (phoneEntries.get(i).getName().charAt(0) == charOfFirstName || phoneEntries.get(i).getName().charAt(0) == charOfFirstName + 32 || phoneEntries.get(i).getName().charAt(0) == charOfFirstName - 32) {
                phoneEntriesFindByFirstName.add(phoneEntries.get(i));
            }
        }
        return phoneEntriesFindByFirstName;
    }

}
