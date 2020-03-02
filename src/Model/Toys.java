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
	
	public String toString() {
		return (product_type + ". " + myType + ", " + myBrand + ": " + "$" + myPrice);
	}

	@Override
	public String toStringCustom() {
		// TODO Auto-generated method stub
		return "Toys: " + myBrand;
	}
		
}
