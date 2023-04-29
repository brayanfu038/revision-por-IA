package co.edu.uptc.mstickets.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uptc.mstickets.model.request.CreateTicketRequest;
import co.edu.uptc.mstickets.service.TicketsService;
import co.edu.uptc.mstickets.util.FilesUtils;
import co.edu.uptc.mstickets.util.impl.FilesUtilsImpl;
import co.uptc.edu.mstickets.model.Ticket;

@Service
public class TicketsServiceImpl implements TicketsService {
	
	@Autowired
	FilesUtils filesUtils;
	
	@Override
	public Ticket createTicket(CreateTicketRequest ticket) throws IOException {
		Ticket newTicket = new Ticket();
		newTicket.setAmount(ticket.getPassengerAmount());
		newTicket.setCabinUnitValue(ticket.getCabinUnitValue());
		newTicket.setListChairs(ticket.getListChairs());
		newTicket.setPaymenMethod(ticket.getPaymenMethod());
		newTicket.setPurchaseDate(ticket.getPurchaseDate());
		newTicket.setStatus(ticket.getStatus());
		filesUtils.write("src/main/resources/static/ticket.txt", newTicket.toString());
		return newTicket;
	}

}
