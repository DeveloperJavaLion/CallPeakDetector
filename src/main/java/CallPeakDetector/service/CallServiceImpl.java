package main.java.CallPeakDetector.service;

import main.java.CallPeakDetector.model.PhoneCall;
import main.java.CallPeakDetector.model.TimeEvent;
import main.java.CallPeakDetector.repository.CallRepository;
import main.java.CallPeakDetector.repository.CallRepositoryImpl;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lion on 28.10.17.
 */
public class CallServiceImpl implements CallService{
    CallRepository callRepository = new CallRepositoryImpl();

    @Override
    public void searchMaxPeriods() {

        int counter = 0;

        ArrayList<TimeEvent> timeEvents = new ArrayList<>();

        for (PhoneCall call : callRepository.listCalls()){
            timeEvents.add(new TimeEvent(call.callStart, true));
            timeEvents.add(new TimeEvent(call.callEnd, false));
        }

        Collections.sort(timeEvents, TimeEvent.timeComparator);

        for (int i = 0; i < timeEvents.size(); i++) {
            if (timeEvents.get(i).isStartTimeEvent()) {
                timeEvents.get(i).setEndTime(timeEvents.get(i + 1).getStartTime());
                timeEvents.get(i).setIntersection(++counter);
            } else {
                timeEvents.get(i).setIntersection(--counter);
            }
//            System.out.println(timeEvents.get(i).getIntersection()+ "-"+timeEvents.get(i).getStartTime()+ ":"
//                    + timeEvents.get(i).getEndTime()+ ":" +timeEvents.get(i).isStartTimeEvent());
        }
        outputOfResult(timeEvents);
    }

    private void outputOfResult(ArrayList<TimeEvent> timeEvents){
        Collections.sort(timeEvents, TimeEvent.maxPeriodsComparator);

        for (TimeEvent timeEvent : timeEvents){
            if (timeEvent.getIntersection() != timeEvents.get(0).getIntersection()) {
                break;
            } else {
                System.out.println("The peak for this call log is " + timeEvent.getIntersection() + " simultaneous calls," +
                        " that occurred between " + timeEvent.getStartTime() + " and "+ timeEvent.getEndTime());
            }
        }
    }
}
