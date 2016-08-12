/**
 * Created by tranh on 05-Aug-16.
 */
public class Keyboard extends Product {
    private String type;

    public Keyboard(String id, String name, int price, String type) {
        super(id, name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tên bàn phím: "+name+"\nId: "+id+"\nGía: "+price+"\nLoại: "+type+"\n-------------\n";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
