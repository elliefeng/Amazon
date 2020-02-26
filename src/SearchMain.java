package src;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class SearchMain 
{
	private static JPanel contentPane;
	
    public static void main() {
    	//String a;
    	Search_UI P = new Search_UI();
    	P.search = P.search.replace(" ", "").toLowerCase();
    	switch(P.search) {
    	  case "shirt":
    		  Clothing_UI frame = new Clothing_UI("Shirt",19.99,"Teal");
			  frame.setVisible(true);  
    		  break;
    	  case "pant":
    		  Clothing_UI frame2 = new Clothing_UI("Pant",25.99,"Green");
  			  frame2.setVisible(true); 
  			break;
    	  case "shoe":
    		  Clothing_UI frame3 = new Clothing_UI("Shoe",30.99,"Black");
  			  frame3.setVisible(true);  
  			break;
    	  
    	  
    	  case "lego":
    		  Toys_UI frame6 = new Toys_UI("Legos", 15.99, "8-11");
			  frame6.setVisible(true);  
    		  break;
    	  case "stuffed animal":
    		  Toys_UI frame7 = new Toys_UI("Stuffed animals", 8.99, "5-10");
  			  frame7.setVisible(true); 
  			break;
    	  case "rubber chicken":
    		  Toys_UI frame8 = new Toys_UI("Rubber Chicken", 10.99, "50+");
  			  frame8.setVisible(true);  
  			break;
  			
  		 
    	  
    	  default:
    			Search_UI frame4 = new Search_UI();
    			P.errorMessage.setText("ERROR PRODUCT NOT FOUND :(");
    			frame4.setVisible(true);

    }
   }
 }
            


