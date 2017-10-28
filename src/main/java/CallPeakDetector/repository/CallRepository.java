package main.java.CallPeakDetector.repository;

import main.java.CallPeakDetector.model.PhoneCall;

import java.util.List;

/**
 * Created by lion on 28.10.17.
 */
public interface CallRepository {
    public List<PhoneCall> listCalls();
}
