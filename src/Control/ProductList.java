package Control;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import Model.Clothing;
import Model.Electronics;
import Model.Home;
import Model.Product;
import Model.Product.PRODUCT_TYPE;
import Model.Toys;

public class ProductList {

	public ArrayList<Object> listOfProducts = new ArrayList<Object>();
	
	public ProductList() {
		Product shirt = new Clothing(19.99,"Teal","Shirt",100,"src/nike.jpg");
		Product shoes = new Clothing(30.99,"Black","Shoes",50,"src/shoes.jpg");
		Product pants = new Clothing(25.99,"Green","Pants",25,"src/pants.jpg");
		Product phone = new Electronics(112.95, "Nokia", "Phone", 420, "src/nokia.jpg");
		Product tv = new Electronics(699.99, "Samsung","Television", 69, "src/tv.jpg");
		Product laptop =  new Electronics(399.99, "Apple", "Laptop", 1234, "src/computer.jpg");
		Product table = new Home(24.99, "Titanium","Table", 345, "src/table.jpg");
		Product sofa = new Home(700.00, "Cashmere", "Sofa", 77, "src/couch.jpg");
		Product rubberChicken = new Toys(27.99, "Mattel", "Rubber Chicken", 600, "src/rubberchicken.jpg");
		Product stuffedAnimal = new Toys(4.95, "Hasbro", "Stuffed Animal", 9000, "src/stuffedanimal.jpg");
		Product lego = new Toys(274.99, "LEGO Corporation", "Ninjago Dragon", 678, "src/lego.jpg");
		listOfProducts.add(shirt);
		listOfProducts.add(shoes);
		listOfProducts.add(pants);	
		listOfProducts.add(phone);
		listOfProducts.add(tv);
		listOfProducts.add(laptop);
		listOfProducts.add(table);
		listOfProducts.add(sofa);
		listOfProducts.add(rubberChicken);
		listOfProducts.add(stuffedAnimal);
		listOfProducts.add(lego);
	}
	
	public ArrayList<Object> FilteredProductList(PRODUCT_TYPE pt) {
		ArrayList<Object> filteredListOfProducts = new ArrayList<Object>();

		for (Object  o : listOfProducts ) {
			Product p = (Product) o;
			if (p.getProductType() == pt) {
				filteredListOfProducts.add(o);
			}
		}
		return filteredListOfProducts;
	}
	
	public ArrayList<Object> FilteredProductList(String filter) {
		ArrayList<Object> filteredListOfProducts = new ArrayList<Object>();

		for (Object  o : listOfProducts ) {
			Product p = (Product) o;
			if (p.toString().contains(filter)) {
				System.out.println(p);
				filteredListOfProducts.add(o);
			}
		}
		return filteredListOfProducts;
	}
	
	public ArrayList<Object> FilteredList(PRODUCT_TYPE pt, String filter)
	{
		ArrayList<Object> filteredListOfProducts = new ArrayList<Object>();

		if (filter.isEmpty()) {
			filteredListOfProducts = listOfProducts;
		} else {
			filteredListOfProducts = this.FilteredProductList(filter);
		}

		return filteredListOfProducts;	
	}
	
	public static void main(String[] args) {
		ProductList p = new ProductList(); 
		
		for(int i=0;i<p.listOfProducts.size();i++) {
			System.out.println( p.listOfProducts.get(i) );
		}
	
	}
	
}
