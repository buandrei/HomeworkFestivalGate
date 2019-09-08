package festivalOBjects;

public class StatsThread extends Thread {

    private Gate gate;

    public StatsThread(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        try {
            currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (gate.gateQueue.size() != 0) {
            System.out.println("Ticket statistics at current point");
            gate.incrementGateStatisticsForGivenTicketType();
            try {
                currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
