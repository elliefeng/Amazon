package Model;
public abstract class Product {
	
	public static enum PRODUCT_TYPE {ALL, CLOTHING, ELECTRONICS, HOME, TOYS};
	protected PRODUCT_TYPE product_type;
	public String myType;
	protected double myPrice;
	protected int myQuantity;
	public String myImage;
	
	public PRODUCT_TYPE getProductType() {
		return product_type;
	}
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
