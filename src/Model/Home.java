package Model;

public class Home extends Product{
	
	public String myMaterial;
	
	public Home(double price, String material, String type, int quantity, String image)
	{
		super.myPrice = price;
		myMaterial = material;
		super.myType = type;
		super.myQuantity = quantity;
		super.myImage = image;
		super.product_type = PRODUCT_TYPE.HOME;
	}
	
	public String getMaterials()
	{
		return myMaterial;
	}
	
	public String toString() {
		return (myType + ", " + myMaterial + ": " + "$" + myPrice);
	}
	
}

