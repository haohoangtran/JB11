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
                        System.out.println(phoneBook.toString());


                }
            }
        } while (true);


    }
}


