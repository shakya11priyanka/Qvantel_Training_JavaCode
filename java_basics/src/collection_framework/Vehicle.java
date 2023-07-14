package collection_framework;

public class Vehicle {
     String move;
     String model;
     int price;
     boolean fourDrive;
	public Vehicle(String move, String model, int price, boolean fourDrive) {
		super();
		this.move = move;
		this.model = model;
		this.price = price;
		this.fourDrive = fourDrive;
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourDrive() {
		return fourDrive;
	}
	public void setFourDrive(boolean fourDrive) {
		this.fourDrive = fourDrive;
	}
	@Override
	public String toString() {
		return "Vehicle [move=" + move + ", model=" + model + ", price=" + price + ", fourDrive=" + fourDrive + "]";
	}
     
     
     
}
