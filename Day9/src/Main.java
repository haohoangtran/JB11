/**
 * Created by tranh on 18-Jul-16.
 */
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStartTime());
        stopWatch.start();
        int i=0;
        while (i<1000) {
            System.out.println(i);
            i++;
        }
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.stop());


    }
}
