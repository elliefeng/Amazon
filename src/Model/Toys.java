package Model;

public class Toys extends Product {

	public String myBrand;
	public String myModel;
	
	public Toys(double price, String brand, String type, int quantity, String image) {
		super.myPrice = price;
		myBrand = brand;
		super.myType = type;
		super.myQuantity = quantity;
		super.myImage = image;
		super.product_type = PRODUCT_TYPE.TOYS;
		
	}
	
	public String getBrand() {
		return myBrand;
	}
	
	public String getModel() {
		return myModel;
	}
	public String toString() {
		return (myType + ", " + myBrand + ": " + "$" + myPrice);
	}
		
}
