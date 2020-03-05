package Control;
import java.util.ArrayList;

import Model.Product;

public class Cart {
	
	public static ArrayList<Product> CartList = new ArrayList<Product>();

	public Cart (ArrayList<Product> Cart){
		CartList = Cart;
	}
	
	public ArrayList<Product> getCart() {
		return CartList;
	}

}
