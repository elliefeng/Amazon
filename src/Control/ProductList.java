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

	public ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	/*
	 * Initialization of Product using Product Model
	 */
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
	
	/*
	 * Used to reduce Product list based off of Product type
	 * 
	 * @parameter is type like Electronic, Home, Toys...
	 * @return is a filtered list of ProductList object
	 */
	public ArrayList<Product> FilteredProductList(PRODUCT_TYPE pt) {
		ArrayList<Product> filteredListOfProducts = new ArrayList<Product>();

		for (int i = 0; i<11; i++) {
			if (listOfProducts.get(i).getProductType() == pt)
				filteredListOfProducts.add(listOfProducts.get(i));
		}
		
		/*for (Product  o : listOfProducts ) {
			Product p = (Product) o;
			if (p.getProductType() == pt) {
				filteredListOfProducts.add(o);
			}
		}*/
		return filteredListOfProducts;
	}
	
	/*
	 * Used to reduce Product list based off of string filter, filters against toString
	 * 
	 * @parameter is any string
	 * @return is a filtered list of ProductList object
	 */
	public ArrayList<Product> FilteredProductList(String filter) {
		ArrayList<Product> filteredListOfProducts = new ArrayList<Product>();

		for (int i = 0; i<11; i++) {
			if (listOfProducts.get(i).toString().contains(filter))
				filteredListOfProducts.add(listOfProducts.get(i));
		}
		System.out.print(filteredListOfProducts);
		
		/*for (Product  o : listOfProducts) {
			Product p = (Product) o;
			if (p.toString().contains(filter)) {
				System.out.println(p);
				filteredListOfProducts.add(p);
			}
		}*/
		return filteredListOfProducts;
	}
	
	/*
	 * Two filters, combination of above
	 * 
	 * @parameter is Product Type plus a filtering string
	 * @return is a filtered list of ProductList object
	 */
	public ArrayList<Product> FilteredList(PRODUCT_TYPE pt, String filter)
	{
		ArrayList<Product> filteredListOfProducts = new ArrayList<Product>();

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
			System.out.println(p.listOfProducts.get(i) );
		}
	
	}
	
}
