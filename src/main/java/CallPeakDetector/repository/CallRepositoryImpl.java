package main.java.CallPeakDetector.repository;

import main.java.CallPeakDetector.model.PhoneCall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lion on 28.10.17.
 */
public class CallRepositoryImpl implements CallRepository{
    private static final String FILE = "resource/phoneCallHistory.txt";

    @Override
    public List<PhoneCall> listCalls() {
        List<PhoneCall> result = new ArrayList<PhoneCall>();
        Scanner scannerLog = null;
        try {
            scannerLog = new Scanner(new File(FILE));
            while (scannerLog.hasNext()) {
                String[] logs = scannerLog.next().split(":");
                PhoneCall newCall = new PhoneCall(Long.valueOf(logs[0]), Long.valueOf(logs[1]));
                result.add(newCall);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scannerLog.close();
        }

        return result;
    }
}
