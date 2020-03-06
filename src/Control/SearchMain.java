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
    		  Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shirt");
		      frame.setVisible(true); 
    		  break;
    	  case "pants":
    		  Generic_UI frame1 = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Pants");
		      frame1.setVisible(true); 
  			break;
    	  case "shoes":
    		  Generic_UI frame2 = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shoes");
		      frame2.setVisible(true); 
  			break;
    	  
    	  //TOYS
    	  case "ninjagodragon":
    		  Generic_UI frame6 = new Generic_UI(PRODUCT_TYPE.TOYS, "Ninjago Dragon");
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
    		  Generic_UI frame9 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Phone");
    		  frame9.setVisible(true);
    		  break;
    	  case "laptop":
    		  Generic_UI frame10 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Laptop");
			  frame10.setVisible(true);
  			  break;
    	  case "television":
    		  Generic_UI frame11 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Television");
			  frame11.setVisible(true);
  			break;
    	  
    	  //HOME
    	  case "sofa":
    		  Generic_UI frame12 = new Generic_UI(PRODUCT_TYPE.HOME, "Sofa");
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