package festivalOBjects;

import java.util.LinkedList;
import java.util.Queue;

public class Gate {

    private int fullPassEntries;
    private int fullVipPassEntries;
    private int freePassEntries;
    private int oneDayVipPassEntries;
    private int oneDayPassEntries;

    Queue<Attendee> gateQueue = new LinkedList<>();

    public synchronized void newAttendee(Attendee attendee){
        gateQueue.add(attendee);
    }

    private int calculateSumOfEntries(){
       return fullPassEntries + freePassEntries + fullVipPassEntries + oneDayVipPassEntries + oneDayPassEntries;
    }

    public synchronized void incrementGateStatisticsForGivenTicketType (){

        for(int i = 0; i <= gateQueue.size(); i++){

            switch (gateQueue.poll().getTicketType()){
                case FULL_PASS:
                    fullPassEntries++;
                    break;
                case FULL_VIP_PASS:
                    fullVipPassEntries++;
                    break;
                case FREE_PASS:
                    freePassEntries++;
                    break;
                case ONE_DAY_PASS:
                    oneDayPassEntries++;
                    break ;
                case ONE_DAY_VIP_PASS:
                    oneDayVipPassEntries++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(calculateSumOfEntries() + " people have entered");
        System.out.println(fullPassEntries + " have full passes");
        System.out.println(freePassEntries + " have free passes");
        System.out.println(fullVipPassEntries + " have full VIP passes");
        System.out.println(oneDayPassEntries + " have one day pass");
        System.out.println(oneDayVipPassEntries + " have one day VIP pass");

    }

}
