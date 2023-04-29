package co.edu.uptc.mstickets.model.request;

import java.util.Date;
import java.util.List;

import co.uptc.edu.mstickets.model.Chair;
import co.uptc.edu.mstickets.model.Payment;
import co.uptc.edu.mstickets.model.Status;

public class CreateTicketRequest {
	
	private int passengerAmount;
	private Date purchaseDate;
	private float cabinUnitValue;
	private Payment paymenMethod;
	private List<Chair>listChairs;
	private Status status;
	
	public int getPassengerAmount() {
		return passengerAmount;
	}
	public void setPassengerAmount(int passengerAmount) {
		this.passengerAmount = passengerAmount;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public float getCabinUnitValue() {
		return cabinUnitValue;
	}
	public void setCabinUnitValue(float cabinUnitValue) {
		this.cabinUnitValue = cabinUnitValue;
	}
	public Payment getPaymenMethod() {
		return paymenMethod;
	}
	public void setPaymenMethod(Payment paymenMethod) {
		this.paymenMethod = paymenMethod;
	}
	public List<Chair> getListChairs() {
		return listChairs;
	}
	public void setListChairs(List<Chair> listChairs) {
		this.listChairs = listChairs;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
