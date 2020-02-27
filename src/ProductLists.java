import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ProductLists {

	public static ArrayList<Clothing> listOfClothingProducts = new ArrayList<Clothing>();
	public static ArrayList<Electronics> listOfElectronicProducts =  new ArrayList<Electronics>();
	
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
		Clothing shirt = new Clothing(19.99,"teal","shirt",100,"src/nike.jpg");
		Clothing shoes = new Clothing(30.99,"black","shoes",50,"src/shoes.jpg");
		Clothing pants = new Clothing(25.99,"green","pants",25,"src/pants.jpg");
		listOfClothingProducts.add(shirt);
		listOfClothingProducts.add(shoes);
		listOfClothingProducts.add(pants);
	}
	
	
	public static void addElectronicProducts() {
		Electronics phone = new Electronics(112.95, "Nokia", "The brick phone", "phone");
		Electronics tv = new Electronics(699.99, "Samsung", "420 inch 8k smart tv", "television");
		Electronics laptop =  new Electronics(399.99, "Apple", "totaly litty quantum computer 3000", "laptop");
		listOfElectronicProducts.add(phone);
		listOfElectronicProducts.add(tv);
		listOfElectronicProducts.add(laptop);
	}
	
}
