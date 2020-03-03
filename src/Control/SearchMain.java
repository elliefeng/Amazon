package Control;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    		  Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "shirt");
		      frame.lblImage.setIcon(new ImageIcon("src/nike.jpg")); 
		      frame.setVisible(true); 
    		  break;
    	  case "pant":
    		  /*Clothing_UI frame2 = new Clothing_UI("Pant",25.99,"Green");
  			  frame2.setVisible(true);*/
    		  Generic_UI frame1 = new Generic_UI(PRODUCT_TYPE.CLOTHING, "pant");
		      frame1.lblImage.setIcon(new ImageIcon("src/pants.jpg")); 
		      frame1.setVisible(true); 
  			break;
    	  case "shoe":
    		  /*Clothing_UI frame3 = new Clothing_UI("Shoe",30.99,"Black");
  			  frame3.setVisible(true);  */
    		  Generic_UI frame2 = new Generic_UI(PRODUCT_TYPE.CLOTHING, "shoe");
		      frame2.lblImage.setIcon(new ImageIcon("src/shoes.jpg")); 
		      frame2.setVisible(true); 
  			break;
    	  
    	  //TOYS
    	  case "lego":
    		  Generic_UI frame6 = new Generic_UI(PRODUCT_TYPE.TOYS, "lego");
    		  frame6.lblImage.setIcon(new ImageIcon("src/lego.jpg")); 
    		  frame6.setVisible(true);  
    		  break;
    	  case "stuffed animal":
    		  Generic_UI frame7 = new Generic_UI(PRODUCT_TYPE.TOYS, "stuffed animal");
    		  frame7.lblImage.setIcon(new ImageIcon("src/stuffedanimal.jpg")); 
    		  frame7.setVisible(true); 
  			  break;
    	  case "rubber chicken":
    		  Generic_UI frame8 = new Generic_UI(PRODUCT_TYPE.TOYS, "rubber chicken");
    		  frame8.lblImage.setIcon(new ImageIcon("src/rubberchicken.jpg")); 
    		  frame8.setVisible(true);  
  			  break;
  			
  		  //ELECTRONICS
    	  case "phone":
    		  /*Electronics_UI frame9 = new Electronics_UI("iPhone", 500.00, "Apple");
			  frame9.setVisible(true); */
    		  Generic_UI frame9 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "phone");
    		  frame9.lblImage.setIcon(new ImageIcon("src/nokia.jpg")); 
    		  frame9.setVisible(true);
    		  break;
    	  case "computer":
    		  /*Electronics_UI frame10 = new Electronics_UI("Computer", 600.00, "Microsoft");
  			  frame10.setVisible(true); */
    		  Generic_UI frame10 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "computer");
			  frame10.lblImage.setIcon(new ImageIcon("src/computer.jpg")); 
			  frame10.setVisible(true);
  			  break;
    	  case "TV":
    		  /*Electronics_UI frame11 = new Electronics_UI("TV", 800.00, "Sony");
  			  frame11.setVisible(true); */
    		  Generic_UI frame11 = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "TV");
			  frame11.lblImage.setIcon(new ImageIcon("src/tv.jpg")); 
			  frame11.setVisible(true);
  			break;
    	  
    	  //HOME
    	  case "couch":
    		  Generic_UI frame12 = new Generic_UI(PRODUCT_TYPE.HOME, "couch");
    		  frame12.lblImage.setIcon(new ImageIcon("src/couch.jpg")); 
    		  frame12.setVisible(true);  
    		  break;
    	  case "table":
    		  Generic_UI frame13 = new Generic_UI(PRODUCT_TYPE.HOME, "table");
    		  frame13.lblImage.setIcon(new ImageIcon("src/table.jpg")); 
    		  frame13.setVisible(true); 
  			break;
    	  
    	  
    	  default:
    			Search_UI frame4 = new Search_UI();
    			P.errorMessage.setText("ERROR PRODUCT NOT FOUND :(");
    			frame4.setVisible(true);

    }
   }
 }