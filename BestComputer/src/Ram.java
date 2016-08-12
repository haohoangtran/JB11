/**
 * Created by tranh on 05-Aug-16.
 */
public class Ram extends Product {
    private int capaccity;

    public int getCapaccity() {
        return capaccity;
    }

    public void setCapaccity(int capaccity) {
        this.capaccity = capaccity;
    }

    public Ram(String id, String name, int price, int capaccity) {

        super(id, name, price);
        this.capaccity = capaccity;
    }

    @Override
    public String toString() {
        return "Tên Ram: "+name+"\nId: "+id+"\nGía: "+price+"\nDung lượng: "+capaccity+"\n-------------\n";
    }
}
