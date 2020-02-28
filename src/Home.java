public class Home extends Product{
	
	double myPrice;
	String myMaterial;
	String myDimensions;
	String myType;
	int myQuantity;
	String myImage;
	
	public Home(double price, String material, String type, int Quantity, String image)
	{
		myPrice = price;
		myMaterial = material;
		myType = type;
		myQuantity = Quantity;
		myImage = image;
		
	}
	
	public double getPrice()
	{
		return myPrice;
	}
	
	public String getMaterials()
	{
		return myMaterial;
	}
	public String getQuantity() {
		return Integer.toString(myQuantity);
	}
	
	public String getType()
	{
		return myType;
	}
}

