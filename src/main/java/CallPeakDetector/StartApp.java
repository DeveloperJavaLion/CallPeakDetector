package main.java.CallPeakDetector;

import main.java.CallPeakDetector.service.CallService;
import main.java.CallPeakDetector.service.CallServiceImpl;

/**
 * Created by lion on 28.10.17.
 */
public class StartApp {
    public static void main(String[] args) {
        CallService callService = new CallServiceImpl();
        callService.searchMaxPeriods();
    }
}
