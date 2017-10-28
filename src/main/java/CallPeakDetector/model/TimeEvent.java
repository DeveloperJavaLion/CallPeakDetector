package main.java.CallPeakDetector.model;

import java.util.Comparator;

/**
 * Created by lion on 28.10.17.
 */
public class TimeEvent {

    private long startTime;
    private long endTime;
    private boolean isStartTimeEvent;
    private int intersection;

    public TimeEvent(long startTime, boolean isStartTimeEvent) {
        this.startTime = startTime;
        this.isStartTimeEvent = isStartTimeEvent;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public boolean isStartTimeEvent() {
        return isStartTimeEvent;
    }

    public void setStartTimeEvent(boolean startTimeEvent) {
        this.isStartTimeEvent = startTimeEvent;
    }

    public int getIntersection() {
        return intersection;
    }

    public void setIntersection(int intersection) {
        this.intersection = intersection;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }


    public static final Comparator<TimeEvent> timeComparator = new Comparator<TimeEvent>() {
        @Override
        public int compare(TimeEvent timeEvent_1, TimeEvent timeEvent_2) {
            return (int) (timeEvent_1.getStartTime() -  timeEvent_2.getStartTime());
        }
    };


    public static final Comparator<TimeEvent> maxPeriodsComparator = new Comparator<TimeEvent>() {
        @Override
        public int compare(TimeEvent  timeEvent_1, TimeEvent  timeEvent_2) {
            return (  timeEvent_2.getIntersection() -  timeEvent_1.getIntersection());
        }
    };
}
