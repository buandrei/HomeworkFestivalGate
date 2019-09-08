package festivalObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum TicketType {
    ONE_DAY_VIP_PASS, FULL_PASS, FULL_VIP_PASS, FREE_PASS, ONE_DAY_PASS ;

    private static final List<TicketType> ticketList =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int size = ticketList.size();
    private static final Random randomTicketValueFromListSize = new Random();

    public static TicketType randomTicketType(){
        return ticketList.get(randomTicketValueFromListSize.nextInt(size));
    }
}
