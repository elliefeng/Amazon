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
    	  //CLOTHING
    	  case "shirt":
    		  /*Clothing_UI frame = new Clothing_UI("Shirt",19.99,"Teal");
			  frame.setVisible(true);  */
    		  Clothing_UI frame = new Clothing_UI(0);
		      frame.lblImage.setIcon(new ImageIcon("src/nike.jpg")); 
		      frame.setVisible(true); 
    		  break;
    	  case "pant":
    		  /*Clothing_UI frame2 = new Clothing_UI("Pant",25.99,"Green");
  			  frame2.setVisible(true);*/
    		  Clothing_UI frame1 = new Clothing_UI(2);
		      frame1.lblImage.setIcon(new ImageIcon("src/pants.jpg")); 
		      frame1.setVisible(true); 
  			break;
    	  case "shoe":
    		  /*Clothing_UI frame3 = new Clothing_UI("Shoe",30.99,"Black");
  			  frame3.setVisible(true);  */
    		  Clothing_UI frame2 = new Clothing_UI(1);
		      frame2.lblImage.setIcon(new ImageIcon("src/shoes.jpg")); 
		      frame2.setVisible(true); 
  			break;
    	  
    	  //TOYS
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
  			
  		  //ELECTRONICS
    	  case "phone":
    		  /*Electronics_UI frame9 = new Electronics_UI("iPhone", 500.00, "Apple");
			  frame9.setVisible(true); */
    		  Electronics_UI frame9 = new Electronics_UI(/*"iPhone", 500.01, "Apple"*/0);
    		  frame9.lblImage.setIcon(new ImageIcon("src/nokia.jpg")); 
    		  frame9.setVisible(true);
    		  break;
    	  case "computer":
    		  /*Electronics_UI frame10 = new Electronics_UI("Computer", 600.00, "Microsoft");
  			  frame10.setVisible(true); */
    		  Electronics_UI frame10 = new Electronics_UI(/*"Computer", 600.01, "Microsoft"*/1);
			  frame10.lblImage.setIcon(new ImageIcon("src/computer.jpg")); 
			  frame10.setVisible(true);
  			break;
    	  case "TV":
    		  /*Electronics_UI frame11 = new Electronics_UI("TV", 800.00, "Sony");
  			  frame11.setVisible(true); */
    		  Electronics_UI frame11 = new Electronics_UI(/*"TV", 800.01, "Sony"*/2);
			  frame11.lblImage.setIcon(new ImageIcon("src/tv.jpg")); 
			  frame11.setVisible(true);
  			break;
    	  
    	  //HOME
    	  case "couch":
    		  Home_UI frame12 = new Home_UI("Coach",350.00, "15 ft x 5 ft");
			  frame12.setVisible(true);  
    		  break;
    	  case "table":
    		  Home_UI frame13 = new Home_UI("Table", 100.00, "10 ft x 15 ft");
  			  frame13.setVisible(true); 
  			break;
    	  
    	  
    	  default:
    			Search_UI frame4 = new Search_UI();
    			P.errorMessage.setText("ERROR PRODUCT NOT FOUND :(");
    			frame4.setVisible(true);

    }
   }
 }