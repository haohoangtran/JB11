/**
 * Created by tranh on 18-Jul-16.
 */
public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean check = false;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
        check = true;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        if (check)
            return getEndTime() - getStartTime();
        else
            return 0;
    }

}
