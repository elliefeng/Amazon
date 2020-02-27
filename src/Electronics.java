public class Electronics extends Product
{
	
	double myPrice;
	String myBrand;
	String myModel;
	String myType;
	String myImage;
	int myQuantity;
	
	public Electronics(double price, String brand, String type, int quantity, String image)
	{
		myPrice = price;
		myBrand = brand;
		myType = type;	
		myQuantity = quantity;
		myImage = image;
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

	
}
