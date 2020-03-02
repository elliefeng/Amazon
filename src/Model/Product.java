package Model;
public abstract class Product {
	
	public static enum PRODUCT_TYPE {ALL, CLOTHING, ELECTRONICS, HOME, TOYS};
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
	
	public void setQuantity(int quantity) {
		this.myQuantity = quantity;
	}
	
	public int getQuantity() {
		return myQuantity;
	}
	
	public String toStringProduct() {
		return "Product: " + myType;
	}
	
	public String toStringPrice() {
		return "Price: $" + myPrice;
	}
	
	public String toStringQuantity() {
		return "Quantity: " + myQuantity;
	}
	
	public abstract String toStringCustom();
	
	public static void addToCart(double price) {		
	}
	
}
