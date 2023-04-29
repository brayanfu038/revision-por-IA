package co.uptc.edu.mstickets.model;

public class Chair {
	
	private int column;
	private int row;
	private String namePassenger;
	public Chair(int column, int row, String namePassenger) {
		super();
		this.column = column;
		this.row = row;
		this.namePassenger = namePassenger;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int colum) {
		this.column = colum;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getNamePassenger() {
		return namePassenger;
	}
	public void setNamePassenger(String namePassenger) {
		this.namePassenger = namePassenger;
	}
	
}
