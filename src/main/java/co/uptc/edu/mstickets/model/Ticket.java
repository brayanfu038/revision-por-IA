package co.uptc.edu.mstickets.model;

import java.util.Date;
import java.util.List;

public class Ticket {
	private int id;
	private int passengerAmount;
	private Date purchaseDate;
	private float cabinUnitValue;
	private Payment paymenMethod;
	private List<Chair>listChairs;
	private Status status;
	
	public Ticket() {
		
	}
	public Ticket(int amount, Date purchaseDate, float cabinUnitValue, Payment paymenMethod, Status status) {
		super();
		this.passengerAmount = amount;
		this.purchaseDate = purchaseDate;
		this.cabinUnitValue = cabinUnitValue;
		this.paymenMethod = paymenMethod;
		this.status = status;
	}
	public int getAmount() {
		return passengerAmount;
	}
	public void setAmount(int amount) {
		this.passengerAmount = amount;
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
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", passengerAmount=" + passengerAmount + ", purchaseDate=" + purchaseDate
				+ ", cabinUnitValue=" + cabinUnitValue + ", paymenMethod=" + paymenMethod + ", listChairs=" + listChairs
				+ ", status=" + status + "]";
	}
	
}
