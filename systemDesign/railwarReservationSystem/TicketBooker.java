package systemDesign.railwarReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class TicketBooker {
    // available tickets
    static int cnf = 2;
    static int rac = 1;
    static int wl = 1;

    static List<Passenger> allPassenger = new ArrayList<>();
    static List<Passenger> cnfList = new ArrayList<>();
    static List<Passenger> racList = new ArrayList<>();
    static List<Passenger> wList = new ArrayList<>();

    public void bookTicket(Passenger p){
        if(TicketBooker.wl == 0){
            System.out.println("All Tickets are filled");
            return;
        }
        int id = allPassenger.size();
        p.id = id+p.name.substring(0,3);
        if(cnf > 0){ 
            p.status = "CNF";    
            allPassenger.add(p);
            cnfList.add(p);
            System.out.println("Ticket Booked");
            System.out.println("Status : CNF");
            System.out.println("----------------------------------------");
            cnf--;
        }else if(cnf == 0 && rac>0){
            p.status = "RAC"; 
            allPassenger.add(p);
            racList.add(p);
            System.out.println("Ticket Booked");
            System.out.println("Status : RAC");
            System.out.println("----------------------------------------");
            rac--;
        }else{
            p.status = "WL"; 
            allPassenger.add(p);
            wList.add(p);
            System.out.println("----------------------------------------");
            System.out.println("Ticket Booked");
            System.out.println("Status : WL");
            System.out.println("----------------------------------------");
            wl--;
        }
    }
    public void cancelTicket(String id){
        int c = 0;
        for(Passenger i : allPassenger){
            c++;
            if(i.id.equals(id)){
                if (i.status.equals("CNF")) {
                    cnf++;
                    allPassenger.remove(c-1);
                }
            }else{
                System.out.println("Invalid ID");
                return;
            }
        }
    }


}
