/**
 * Created by tranh on 05-Aug-16.
 */
public class Monitor extends Product {
    private String resolution;

    @Override
    public String toString() {
        return "Tên monitor: "+name+"\nId:"+id+"\nGía: "+price+"\nĐộ phân giải: "+resolution+"\n-------------\n";
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Monitor(String id, String name, int price, String resolution) {

        super(id, name, price);
        this.resolution = resolution;
    }

}
