/**
 * Created by tranh on 05-Aug-16.
 */
public class Mouse extends Product {
    private String type;

    @Override
    public String toString() {
        return "Tên chuột: "+name+"\nId: "+id+"\nGiá: "+price+"\nLoại: "+type+"\n-------------\n";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Mouse(String id, String name, int price, String type) {

        super(id, name, price);
        this.type = type;
    }

}
