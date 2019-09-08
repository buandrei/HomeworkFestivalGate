package festivalObjects;
public class FestivalAttendeeThread extends Thread {
    private Gate gate;

    public FestivalAttendeeThread(Gate gate) {
        this.gate = gate;
    }

    public void run() {
        Attendee attendee = new Attendee(TicketType.randomTicketType());
        gate.newAttendee(attendee);
        System.out.println(attendee);
    }
}
