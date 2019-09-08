package festivalOBjects;

public class Attendee {

    private TicketType ticketType;

    public Attendee(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    @Override
    public String toString() {
        return "festivalOBjects.Attendee ticket type = " + ticketType;
    }
}
