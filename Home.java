package src;

public class Home extends Product{
	
	double myPrice;
	String myMaterial;
	String myDimensions;
	String myType;
	
	public Home(double price, String material, String dimensions, String type)
	{
		myPrice = price;
		myMaterial = material;
		myDimensions = dimensions;
		myType = type;		
	}
	
	public double getPrice()
	{
		return myPrice;
	}
	
	public String getMaterials()
	{
		return myMaterial;
	}
	
	public String getDimensions()
	{
		return myDimensions;
	}
	
	public String getType()
	{
		return myType;
	}
}

