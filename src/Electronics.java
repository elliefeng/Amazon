public class Electronics extends Product
{
	
	double myPrice;
	String myBrand;
	String myModel;
	String myType;
	
	public Electronics(double price, String brand, String model, String type)
	{
		myPrice = price;
		myBrand = brand;
		myModel = model;
		myType = type;	
	}
	
	public double getPrice()
	{
		return myPrice;
	}
	
	public String getBrand()
	{
		return myBrand;
	}
	
	public String getModel()
	{
		return myModel;
	}
	
	public String getType()
	{
		return myType;
	}

	
}
