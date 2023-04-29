package co.edu.uptc.mstickets.service;

import java.io.IOException;

import co.edu.uptc.mstickets.model.request.CreateTicketRequest;
import co.uptc.edu.mstickets.model.Ticket;

public interface TicketsService {
	Ticket createTicket(CreateTicketRequest ticket) throws IOException;
}
