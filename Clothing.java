public class Clothing extends Product {
	double myPrice;
	//String mySize;
	String myColor;
	String myType;
	
	public Clothing (/*double price, String size, String color, String type*/) {
		/*myPrice = price;
		//mySize = size;
		myColor = color;
		myType = type;*/
	}
	public double getPrice() {
		return myPrice;
	}
	public String[] getSize() {
		String[] size = {"S","M","L","XL"};
		return size;
	}
	public String getColor() {
		return myColor;
	}
	public String getType() {
		return myType;
	}
}
