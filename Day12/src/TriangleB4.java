import java.util.IllegalFormatException;

/**
 * Created by tranh on 12-Aug-16.
 */
public class TriangleB4 {
    private double slide1;
    private double slide2;
    private double slide3;

    public TriangleB4(double slide1, double slide2, double slide3) throws IllegalArgumentException {

        if (slide1 + slide2 > slide3 || slide1 + slide3 > slide2 || slide2 + slide3 > slide1 || slide1 <= 0 || slide2 <= 0 || slide3 <= 0) {
            throw new IllegalArgumentException();
        }

        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }
}
