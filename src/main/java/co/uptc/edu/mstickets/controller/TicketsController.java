package co.uptc.edu.mstickets.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.mstickets.model.request.CreateTicketRequest;
import co.edu.uptc.mstickets.model.response.CreateTicketResponse;
import co.edu.uptc.mstickets.service.TicketsService;
import co.edu.uptc.mstickets.service.impl.TicketsServiceImpl;
import co.uptc.edu.mstickets.model.Ticket;

@RestController         
@RequestMapping("/v1/tickets")  
public class TicketsController {
	
	@Autowired
	TicketsServiceImpl service;
	
	
	@PostMapping(value ="")
	public ResponseEntity<CreateTicketResponse> createTicket(@RequestBody CreateTicketRequest body) throws IOException {
		CreateTicketResponse response = new CreateTicketResponse();
		response.setData(service.createTicket(body));
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	} 	
}
//@RequestBody  convierte un archivo Json en  un objeto
// montar un controlador 
//nos permite  mapear el controlador a traves de la ruta;
