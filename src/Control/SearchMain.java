package Control;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Product;
import Model.Product.PRODUCT_TYPE;

import javax.swing.JFrame;
import View.*;

public class SearchMain 
{
	private static JPanel contentPane;
	
    public static void main() {
    	//String a;
    	Search_UI P = new Search_UI();
    	P.search = P.search.replace(" ", "").toLowerCase();
    	
    	switch(P.search) {
    	  //CLOTHING
    	  case "shirt":
    		  /*Clothing_UI frame = new Clothing_UI("Shirt",19.99,"Teal");
			  frame.setVisible(true);  */
    		  Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shirt");
    		  frame.index = frame.setItem(PRODUCT_TYPE.CLOTHING, "Shirt");
    		  frame.item = (Product) frame.list.get(frame.index);
    		  frame.setText(frame.item);
		      frame.setVisible(true); 
    		  break;
    	  case "pant":
    		  /*Clothing_UI frame2 = new Clothing_UI("Pant",25.99,"Green");
  			  frame2.setVisible(true);*/
    		  Generic_UI frame1 = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Pant");
    		  frame1.index = frame1.setItem(PRODUCT_TYPE.CLOTHING, "Pant");
    		  frame1.item = (Product) frame1.list.get(frame1.index);
    		  frame1.setText(frame1.item);
		      frame1.setVisible(true); 
  			break;
    	  case "shoe":
    		  /*Clothing_UI frame3 = new Clothing_UI("Shoe",30.99,"Black");
  			  frame3.setVisible(true);  */
    		  Generic_UI frame2 = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shoe");
    		  frame2.index = frame2.setItem(PRODUCT_TYPE.CLOTHING, "Shoe");
    		  frame2.item = (Product) frame2.list.get(frame2.index);
    		  frame2.setText(frame2.item);
		      frame2.setVisible(true); 
  			break;
    	  
    	  //TOYS
    	  case "lego":
    		  Generic_UI frame6 = new Generic_UI(PRODUCT_TYPE.TOYS, "Lego");
    		  frame6.setVisible(true);  
    		  break;
    	  case "stuffedanimal":
    		  Generic_UI frame7 = new Generic_UI(PRODUCT_TYPE.TOYS, "Stuffed Animal");
    		  frame7.setVisible(true); 
  			  break;
    	  case "rubberchicken":
    		  Generic_UI frame8 = new Generic_UI(PRODUCT_TYPE.TOYS, "Rubber Chicken");
    		  frame8.setVisible(true);  
  			  break;
  			
  		  //ELECTRONICS
    	  case "phone":
    		  /*Electronics_UI frame9 = new Electronics_UI("iPhone", 500.00, "Apple");
			  frame9.setVisible(true); */
    		  Generic_UI frame9 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Phone");
    		  frame9.setVisible(true);
    		  break;
    	  case "computer":
    		  /*Electronics_UI frame10 = new Electronics_UI("Computer", 600.00, "Microsoft");
  			  frame10.setVisible(true); */
    		  Generic_UI frame10 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Computer");
			  frame10.setVisible(true);
  			  break;
    	  case "tv":
    		  /*Electronics_UI frame11 = new Electronics_UI("TV", 800.00, "Sony");
  			  frame11.setVisible(true); */
    		  Generic_UI frame11 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Television");
			  frame11.setVisible(true);
  			break;
    	  
    	  //HOME
    	  case "couch":
    		  Generic_UI frame12 = new Generic_UI(PRODUCT_TYPE.HOME, "Couch");
    		  frame12.setVisible(true);  
    		  break;
    	  case "table":
    		  Generic_UI frame13 = new Generic_UI(PRODUCT_TYPE.HOME, "Table");
    		  frame13.setVisible(true); 
  			break;
    	  
    	  
    	  default:
    			Search_UI frame4 = new Search_UI();
    			P.errorMessage.setText("ERROR PRODUCT NOT FOUND :(");
    			frame4.setVisible(true);

    }
   }
 }