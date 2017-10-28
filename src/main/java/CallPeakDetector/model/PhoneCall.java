package main.java.CallPeakDetector.model;

/**
 * Created by lion on 28.10.17.
 */
public class PhoneCall {
    public long callStart;
    public long callEnd;

    public PhoneCall(long start, long callEnd) {
        this.callStart = start;
        this.callEnd = callEnd;
    }

    public long getCallStart() {
        return callStart;
    }

    public void setCallStart(long callStart) {
        this.callStart = callStart;
    }

    public long getCallEnd() {
        return callEnd;
    }

    public void setCallEnd(long callEnd) {
        this.callEnd = callEnd;
    }
}
