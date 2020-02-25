package src;
import java.util.ArrayList;

public class ProductLists {

	public static ArrayList<Clothing> listOfClothingProducts = new ArrayList<Clothing>();
	public static ArrayList<Electronics> listOfElectronicProducts =  new ArrayList<Electronics>();
	
	/*Clothing 
	shirt, 19.99 teal 
	shoes, 30.99 black
	pants, 25.99 green */
	
	
	public static void main(String[] args) {
		addClothingProducts();
		//System.out.println(listOfClothingProducts);
		
		for(int i=0;i<listOfClothingProducts.size();i++) {
		System.out.println(listOfClothingProducts.get(i).myType);
		}
		
	}
	
	public static void addClothingProducts() {
		Clothing shirt = new Clothing(19.99,"teal","shirt");
		Clothing shoes = new Clothing(30.99,"black","shoes");
		Clothing pants = new Clothing(25.99,"green","pants");
		listOfClothingProducts.add(shirt);
		listOfClothingProducts.add(shoes);
		listOfClothingProducts.add(pants);
	}
	
	
	
}
