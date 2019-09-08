package festivalObjects;

import java.util.Random;

public class MainThread extends Thread {


    @Override
    public void run() {
        Gate gate = new Gate();
        StatsThread statsThread = new StatsThread(gate);
        Thread t1 = new Thread(statsThread);
        t1.start();
        int numberOfAttendees = getRandomAttendeeNumber();

        for (int i = 0; i < numberOfAttendees; i++) {
            runNewAttendeeThread(gate);
        }
    }

    private static int getRandomAttendeeNumber() {
        Random r = new Random();
        return r.nextInt(300) + 100;
    }

    public void runNewAttendeeThread(Gate gate) {
        FestivalAttendeeThread attendeeThread = new FestivalAttendeeThread(gate);
        Thread t = new Thread(attendeeThread);

        t.start();
        try {
            t.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
