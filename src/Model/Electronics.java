package Model;

public class Electronics extends Product
{
	
	public String myBrand;
	int commit;
	
	public Electronics(double price, String brand, String type, int quantity, String image)
	{
		super.product_type = PRODUCT_TYPE.ELECTRONICS;
		super.myPrice = price;
		myBrand = brand;
		super.myType = type;
		super.myQuantity = quantity;
		super.myImage = image;
	}
	
	public String toString() {
		return (product_type + ". " +myType + ", " + myBrand + ": " + "$" + myPrice);
	}
	
	@Override
	public String toStringCustom() {
		return "Brand: " + myBrand;
	}

	
}
