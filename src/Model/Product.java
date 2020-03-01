package Model;
public abstract class Product {
	
	public static enum PRODUCT_TYPE {CLOTHING, ELECTRONICS, HOME, TOYS};
	public PRODUCT_TYPE product_type;
	public String myType;
	public double myPrice;
	public int myQuantity;
	public String myImage;
	
	public double getPrice() {
		return myPrice;
	}
	public String getType() {
		return myType;
	}
	public String getQuantity() {
		return Integer.toString(myQuantity);
	}
	
	public static void addToCart(double price) {		
	}
	
}
