import java.awt.*;
import java.awt.List;
import java.util.*;
import java.util.ArrayList;

/**
 * Created by tranh on 05-Aug-16.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productArrayList=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        do {


        System.out.println("Phần mềm quản lý sản phầm");
        System.out.println("------------------------");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Xóa sản phẩm");
        System.out.println("3.Tìm sản phẩm theo tên");
        System.out.println("4. In theo tên");
        System.out.println("5.In theo giá");
        System.out.println("6.Hiển thị tất cả");
        System.out.println("0.Thoát");
        choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhập loại sản phẩm muốn thêm:");
                System.out.println("1.Case");
                System.out.println("2.Cpu");
                System.out.println("3.Keyboard");
                System.out.println("4.Monitor");
                System.out.println("5.Mouse");
                System.out.println("6.Ram");
                input.nextLine();
                choose = input.nextInt();
                input.nextLine();
                String name, id,type, resolution;
                int price, capaccity;
                float freq;
                switch (choose) {
                    case 1:
                        System.out.println("Nhập tên ram: ");
                        name = input.nextLine();
                        System.out.println("Nhập id: ");
                        id = input.nextLine();
                        System.out.println("Nhập dung lượng ram: ");
                        capaccity = input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập giá ram:");
                        price = input.nextInt();
                        input.nextLine();
                        Ram ram = new Ram(id, name, price, capaccity);
                        System.out.println("Nhập Tên cpu: ");
                        name = input.nextLine();
                        System.out.println("Nhập giá cpu: ");
                        price = input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập id cpu: ");
                        id = input.nextLine();
                        System.out.println("Nhập tốc độ Cpu:");
                        freq = input.nextFloat();
                        input.nextLine();
                        Cpu cpu = new Cpu(id, name, price, freq);
                        System.out.println("Nhập id case: ");
                        id = input.nextLine();
                        System.out.println("Nhập tên case:");
                        name=input.nextLine();
                        price=(cpu.getPrice()+ram.getPrice())*(int)1.1;
                        Product caseComputer=new Case(id,name,price,ram,cpu);
                        productArrayList.add(caseComputer);
                        break;
                    case 2:
                        System.out.println("Nhập tên cpu:");
                        name=input.nextLine();
                        System.out.println("Nhập giá: ");
                        price=input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập id: ");
                        id=input.nextLine();
                        System.out.println("Nhập tốc độ: ");
                        freq=input.nextFloat();
                        Product product=new Cpu(id,name,price,freq);
                        productArrayList.add(product);
                        break;
                    case 3:
                        System.out.println("Nhập tên Bàn phím:");
                        name=input.nextLine();
                        System.out.println("Nhập giá: ");
                        price=input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập id: ");
                        id=input.nextLine();
                        System.out.println("Nhập loại bàn phím: ");
                        type=input.nextLine();
                        Product keyboard=new Keyboard(id,name,price,type);
                        if (productArrayList.add(keyboard))
                            System.out.println("Thành công");
                        else
                            System.out.println("Thêm thất bại!");
                        break;
                    case 4:
                        System.out.println("Nhập tên Monitor:");
                        name=input.nextLine();
                        System.out.println("Nhập giá: ");
                        price=input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập id: ");
                        id=input.nextLine();
                        System.out.println("Nhập độ phân giải: ");
                        resolution=input.nextLine();
                        Product monitor=new Monitor(id,name,price,resolution);
                        if (productArrayList.add(monitor))
                            System.out.println("Thêm thành công!");
                        else
                            System.out.println("Thếm thất bại!");
                        break;
                    case 5:
                        System.out.println("Nhập tên chuột:");
                        name=input.nextLine();
                        System.out.println("Nhập giá: ");
                        price=input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập id: ");
                        id=input.nextLine();
                        System.out.println("Nhập loại chuột:");
                        type=input.nextLine();
                        Product mouse=new Mouse(id,name,price,type);
                        if (productArrayList.add(mouse))
                            System.out.println("Thêm thành công!");
                        else
                            System.out.println("Thếm thất bại!");
                        break;
                    case 6:
                        System.out.println("Nhập tên Ram:");
                        name=input.nextLine();
                        System.out.println("Nhập giá: ");
                        price=input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập id: ");
                        id=input.nextLine();
                        System.out.println("Nhập tốc độ Ram: ");
                        capaccity=input.nextInt();
                        input.nextLine();
                        Product ram1=new Ram(id,name,price,capaccity);
                        if (productArrayList.add(ram1))
                            System.out.println("Thêm thành công!");
                        else
                            System.out.println("Thếm thất bại!");
                        break;
                    default:
                        System.out.println("Bạn nhập sai!");
                }
                break;
            case 2:
                System.out.println("Nhập id sản phẩm cần xóa: ");
                id=input.nextLine();
                ProductManager manager=new ProductManager(productArrayList);
                manager.removeProduct(id);





            case 5:
                ProductManager productManager1=new ProductManager(productArrayList);
                productManager1.sortByPrice();
                System.out.println("Sắp xếp thành công!");
                break;
            case 6:
                ProductManager productManager=new ProductManager(productArrayList);
                productManager.showAllProduct();
                break;


        }
    } while (choose!=0);

}
}
