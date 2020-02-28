import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ProductLists {

	public static ArrayList<Clothing> listOfClothingProducts = new ArrayList<Clothing>();
	public static ArrayList<Electronics> listOfElectronicProducts =  new ArrayList<Electronics>();
	public static ArrayList<Home> listOfHomeProducts = new ArrayList<Home>();
	public static ArrayList<Toys> listOfToyProducts = new ArrayList<Toys>();
	
	/*Clothing 
	shirt, 19.99 teal 
	shoes, 30.99 black
	pants, 25.99 green */
	
	/*
	 price brand model type
	 */
	
	
	public static void main(String[] args) {
		addClothingProducts();
		//System.out.println(listOfClothingProducts);
		
		for(int i=0;i<listOfClothingProducts.size();i++) {
		System.out.println(listOfClothingProducts.get(i).myColor);
		}
		
		//for(int x=0; x<listOfElectronicProducts.size(); x++);{
			//System.out.println(listOfElectronicProducts.get(x).myColor);
			
		//}
	}
	
	public static void addClothingProducts() {
		Clothing shirt = new Clothing(19.99,"Teal","Shirt",100,"src/nike.jpg");
		Clothing shoes = new Clothing(30.99,"Black","Shoes",50,"src/shoes.jpg");
		Clothing pants = new Clothing(25.99,"Green","Pants",25,"src/pants.jpg");
		listOfClothingProducts.add(shirt);
		listOfClothingProducts.add(shoes);
		listOfClothingProducts.add(pants);
	}
	
	
	public static void addElectronicProducts() {
		Electronics phone = new Electronics(112.95, "Nokia", "Phone", 420, "src/nokia.jpg");
		Electronics tv = new Electronics(699.99, "Samsung","Television", 69, "src/tv.jpg");
		Electronics laptop =  new Electronics(399.99, "Apple", "Laptop", 1234, "src/computer.jpg");
		listOfElectronicProducts.add(phone);
		listOfElectronicProducts.add(tv);
		listOfElectronicProducts.add(laptop);
	}
	
	public static void addHomeProducts() {
		Home table = new Home(24.99, "Titanium","Table", 345, "src/table.jpg");
		Home sofa = new Home(700.00, "Cashmere", "Sofa", 77, "src/couch.jpg");
		listOfHomeProducts.add(table);
		listOfHomeProducts.add(sofa);
	}
	
	public static void addToyProducts() {
		Toys rubberChicken = new Toys(27.99, "Mattel", "Rubber Chicken", 600, "src/rubberchicken.jpg");
		Toys stuffedAnimal = new Toys(4.95, "Hasbro", "Stuffed Animal", 9000, "src/stuffedanimal.jpg");
		Toys lego = new Toys(274.99, "LEGO Corporation", "Ninjago Dragon", 678, "src/lego.jpg");
		listOfToyProducts.add(rubberChicken);
		listOfToyProducts.add(stuffedAnimal);
		listOfToyProducts.add(lego);
	}
	
}
