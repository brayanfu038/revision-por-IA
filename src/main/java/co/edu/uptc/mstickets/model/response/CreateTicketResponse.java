package co.edu.uptc.mstickets.model.response;

import co.uptc.edu.mstickets.model.Ticket;

public class CreateTicketResponse {
	private Ticket data;

	public Ticket getData() {
		return data;
	}

	public void setData(Ticket data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CreateTicketResponse [data=" + data + "]";
	}
}
