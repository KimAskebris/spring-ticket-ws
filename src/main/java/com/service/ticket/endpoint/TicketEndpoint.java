package com.service.ticket.endpoint;

import com.kimper.ticket.TicketRequest;
import com.kimper.ticket.TicketResponse;
import com.service.ticket.model.Ticket;
import com.service.ticket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TicketEndpoint {
    
   private static final String NAMESPACE_URI = "http://www.kimper.com/ticket";
    
   @Autowired
   TicketRepository ticketRepository;
   
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ticketRequest")
    @ResponsePayload
    public TicketResponse findTicket(@RequestPayload TicketRequest request) {
        TicketResponse response = new TicketResponse();
        Ticket ticket = ticketRepository.findByNameAndDate(request.getDeparture(), request.getDestination(), request.getDate());
        if (ticket != null) {
            response.setPrice(ticket.getPrice());
        } else {
            response.setError("Could not find any ticket");
        }
        return response;
    }
   
}
