import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by tranh on 11-Jul-16.
 */
public class Main {
    static PhoneBook phoneBook = new PhoneBook();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfEntries;
        int choose = -1;
        do {
            System.out.println("------DANH BẠ ĐIỆN THOẠI-------");
            System.out.println("1. Nhập liên hệ.");
            System.out.println("2. Thêm một liên hệ.");
            System.out.println("3. Sửa liên hệ.");
            System.out.println("4. Xóa liên hệ.");
            System.out.println("5. Tìm kiếm liên hệ.");
            System.out.println("6. Hiển thị tất cả liên hệ.");
            System.out.println("7. Thêm số điện thoại vào tên có sẵn.");
            System.out.println("8. Sửa số đã có trong danh bạ!");
            System.out.println("9. Tìm theo chữ cái!");
            System.out.println("0. Thoát.");
            System.out.println("Mời lựa chọn chức năng: ");
            choose = sc.nextInt();
            if (choose == 0)
                break;
            else {
                switch (choose) {
                    case 1:
                        System.out.println("Nhập số liên hệ cần thêm:");
                        numberOfEntries = sc.nextInt();
                        sc.nextLine();
                        phoneBook.setNumberOfEntries(numberOfEntries);
                        for (int i = 0; i < numberOfEntries; i++) {
                            PhoneEntry phoneEntry = new PhoneEntry();
                            System.out.println("Nhập tên" + (i + 1) + ": ");
                            String contactName = sc.nextLine();
                            phoneEntry.setName(contactName);
                            sc.nextLine();
                            System.out.println("Nhập số điện thoại: ");
                            String contactNumber = sc.nextLine();
                            phoneEntry.setPhoneNumber(contactNumber);
                            phoneBook.setNumberOfEntries(numberOfEntries);
                            phoneBook.addEntry(phoneEntry);
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        PhoneEntry phoneEntry = new PhoneEntry();
                        System.out.println("Nhập tên:");
                        String contactName = sc.nextLine();
                        phoneEntry.setName(contactName);
                        System.out.println("Nhập số điện thoại:");
                        String contactNumber = sc.nextLine();
                        phoneEntry.setPhoneNumber(contactNumber);
                        phoneBook.addEntry(phoneEntry);
                        System.out.println("Đã thêm " + contactName);
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("Nhập tên liên hệ cần sửa: ");
                        String str1 = sc.nextLine();
                        System.out.println("Nhập tên sẽ sửa: ");
                        String str2 = sc.nextLine();
                        if (phoneBook.modifyEntryName(str1, str2))
                            System.out.println("Đã sửa " + str1 + " thành " + str2);
                        else
                            System.out.println("Tên liên hệ không tồn tại!");
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.println("Nhập tên liên hệ sẽ xóa");
                        String str = sc.nextLine();
                        if (phoneBook.deleteEntry(str))
                            System.out.println("đã xóa " + str);
                        else
                            System.out.println("Không xóa được!");
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.println("NHập tên tìm kiếm: ");
                        String nameOfSearch = sc.nextLine();
                        if (phoneBook.findEntryByName(nameOfSearch) != null)
                            System.out.println(phoneBook.findEntryByName(nameOfSearch).toString(phoneBook.findEntryByName(nameOfSearch).getName(), phoneBook.findEntryByName(nameOfSearch).getPhoneNumber()));
                        else
                            System.out.println("Không tìm thấy");
                        break;
                    case 6:
                        System.out.println("Số liên hệ: " + phoneBook.getNumberOfEntries());
                        System.out.println(phoneBook.toString());
                        break;
                    case 7:
                        sc.nextLine();
                        System.out.println("Nhập tên : ");
                        String name = sc.nextLine();
                        if (phoneBook.findEntryByName(name) != null) {
                            System.out.println("Nhập số sẽ thêm vào: ");
                            String number = sc.nextLine();
                            if (phoneBook.addNumber(number, name)) {
                                System.out.println("Đã thêm số điện thoại!");
                            } else
                                System.out.println("Không thêm được!");
                        }
                        break;
                    case 8:
                        sc.nextLine();
                        System.out.println("Nhập Sdt cṹ: ");
                        String oldNumber = sc.nextLine();
                        System.out.println("Nhập Sdt mới: ");
                        String newNumber = sc.nextLine();
                        if (phoneBook.editNumber(oldNumber, newNumber)) {
                            System.out.println("Đã sửa số " + oldNumber + " thành " + newNumber);
                        } else
                            System.out.println("Không thể sửa!");
                        break;
                    case 9:
                        sc.nextLine();
                        System.out.println("Nhập chữ cái: ");
                        String strFind = sc.nextLine();
                        ArrayList<PhoneEntry> phoneEntryArrayList = phoneBook.findByFirstName(strFind.charAt(0));
                        if (phoneEntryArrayList.size() == 0)
                            System.out.println("Không tìm thấy!");
                        else {
                            for (int i = 0; i < phoneEntryArrayList.size(); i++) {
                                System.out.println(phoneEntryArrayList.get(i).toString(phoneEntryArrayList.get(i).getName(), phoneEntryArrayList.get(i).getPhoneNumber()));
                            }
                        }
                        break;

                    default:
                        break;
                }
                if (choose == 0)
                    break;
            }
        } while (true);


    }
}


