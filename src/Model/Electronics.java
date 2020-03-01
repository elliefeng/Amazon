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
	
	public double getPrice()
	{
		return myPrice;
	}
	
	public String getBrand()
	{
		return myBrand;
	}
	
	public String getQuantity(){
		{
			return Integer.toString(myQuantity);
		}
	}
	public String getType()
	{
		return myType;
	}
	
	public String toString() {
		return (myType + ", " + myBrand + ": " + "$" + myPrice);
	}

	
}
