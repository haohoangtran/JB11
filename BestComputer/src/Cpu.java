/**
 * Created by tranh on 05-Aug-16.
 */
public class Cpu extends Product {
    private float freq;

    public Cpu(String id, String name, int price, float freq) {
        super(id, name, price);
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Tên Cpu:"+name+"\nId: "+id+"\nGía: "+price+"\nTốc độ: "+freq+"\n-------------\n";
    }

    public float getFreq() {
        return freq;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }

}
