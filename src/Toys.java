

public class Toys extends Product {

	double myPrice;
	String myBrand;
	String myModel;
	String myType;
	String myImage;
	int myQuantity;
	
	public Toys(double price, String brand, String type, int Quantity, String image) {
		myPrice = price;
		myBrand = brand;
		myType = type;
		myQuantity = Quantity;
		myImage = image;
		
	}
	
	public double getPrice() {
		return myPrice;
	}
	
	public String getBrand() {
		return myBrand;
	}
	
	public String getModel() {
		return myModel;
	}
	
	public String getType() {
		return myType;
		
	}

	
	
}
