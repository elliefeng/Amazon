package Model;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Clothing extends Product {
	String mySize;
	public String myColor;
	int commit;
	
	public Clothing (double price, String color, String type, int quantity, String image) {
		super.myPrice = price;
		myColor = color;
		super.myType = type;
		super.myQuantity = quantity;
		super.myImage = image;
		super.product_type = PRODUCT_TYPE.CLOTHING;
	}
	
	public String[] getSize() {
		String[] size = {"S","M","L","XL"};
		return size;
	}
	
	public String toString() {
		return (product_type + ". " +myType + ", " + myColor + ": " + "$" + myPrice);
	}

	@Override
	public String toStringCustom() {
		return "Color: " + myColor;
	}
	
}
