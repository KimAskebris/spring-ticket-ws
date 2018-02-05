package com.service.ticket.repository;

import com.service.ticket.model.Ticket;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class TicketRepository {
    
    private static final Map<Integer, Ticket> tickets = new HashMap<>();
    
    @PostConstruct
    public void tickets() {
        
        Ticket ticket1 = new Ticket();
        ticket1.setDepature("STO");
        ticket1.setDestination("PAR");
        ticket1.setId(1);
        ticket1.setPrice(2000);
        ticket1.setDate("2018-02-25");
        tickets.put(ticket1.getId(), ticket1);
                
        Ticket ticket2 = new Ticket();
        ticket2.setDepature("PAR");
        ticket2.setDestination("NYC");
        ticket2.setId(2);
        ticket2.setPrice(4000);
        ticket2.setDate("2018-03-17");
        tickets.put(ticket2.getId(), ticket2);
        
        Ticket ticket3 = new Ticket();
        ticket3.setDepature("WAS");
        ticket3.setDestination("TYO");
        ticket3.setId(3);
        ticket3.setPrice(7000);
        ticket3.setDate("2018-03-29");
        tickets.put(ticket3.getId(), ticket3);
        
        Ticket ticket4 = new Ticket();
        ticket4.setDepature("MOW");
        ticket4.setDestination("PAR");
        ticket4.setId(4);
        ticket4.setPrice(3500);
        ticket4.setDate("2018-04-29");
        tickets.put(ticket4.getId(), ticket4);
        
        Ticket ticket5 = new Ticket();
        ticket5.setDepature("STO");
        ticket5.setDestination("LON");
        ticket5.setId(5);
        ticket5.setPrice(1500);
        ticket5.setDate("2018-05-10");
        tickets.put(ticket5.getId(), ticket5);
    }
    
    public Ticket findByNameAndDate(String depature, String destination, String date){
        for (Map.Entry<Integer, Ticket> entry : tickets.entrySet()) {
            String tempDepature = entry.getValue().getDepature();
            String tempDest = entry.getValue().getDestination();
            String tempDate = entry.getValue().getDate();
            if (tempDepature.equals(depature) && tempDest.equals(destination) && tempDate.equals(date)) {
                return entry.getValue();
            }          
        }
        return null;
    }
    
    
}
