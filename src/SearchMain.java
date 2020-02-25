package src;

import javax.swing.ImageIcon;

public class SearchMain 
{
	
	private static ImageIcon shirtImage = new ImageIcon("nike.jpg");
	private static ImageIcon pantsImage = new ImageIcon("pants.jpg");
	private static ImageIcon shoesImage = new ImageIcon("shoes.jpg");
	
    public static void main() {
    	displayShirt();
    	displayPant();
    	displayShoe();
    	//FIX THIS
    	
    }
	
	
    public static void displayShirt() {
    	 	Search_UI P = new Search_UI(); 
    	 	String search = P.search;
    	 	if (search.replace(" ", "").toLowerCase().contains(P.search.replace(" ", "").toLowerCase())) {
    	 		Clothing_UI frame = new Clothing_UI("Shirt",19.99,"Teal", shirtImage);
				frame.setVisible(true);  
    	 	}
    }
    
    
    public static void displayPant() {
    	Search_UI P = new Search_UI(); 
	 	String search = P.search;
	 	if (search.replace(" ", "").toLowerCase().contains(P.search.replace(" ", "").toLowerCase())) {
	 		Clothing_UI frame = new Clothing_UI("Pant",25.99,"Green",pantsImage);
			frame.setVisible(true);  
	 		}
    }
    
    public static void displayShoe() {
    	Search_UI P = new Search_UI(); 
	 	String search = P.search;
	 	if (search.replace(" ", "").toLowerCase().contains(P.search.replace(" ", "").toLowerCase())) {
	 		Clothing_UI frame = new Clothing_UI("Shoe",30.99,"Black",shoesImage);
			frame.setVisible(true);  
	 		}
    }
            
 /*public static String main(String input2) {
           
        Python P = new Python(); 
        P.init();
        Swift S= new Swift();
     	S.init();
     	Ruby R = new Ruby();
     	R.init();
     	Java J = new Java();
     	J.init();
            
        String input=null;
        try {
                int aa = Integer.valueOf(input); //if input is 0, returns string that will terminate main method
                if(aa == 0) {
                    System.out.println("You are done searching");
                }
            } catch(NumberFormatException e) {
                int aa = 1;
            } 
            input2 = "^" + input2.toLowerCase() + "^"; //adds ^^ to the string
        
            // Check Python
        if(P.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               P.Creator.toLowerCase().indexOf(input2) >= 0 || 
               P.Owner.toLowerCase().indexOf(input2) >= 0 ||
               P.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               P.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               P.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               P.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               P.ide.toLowerCase().indexOf(input2) >= 0 || 
               P.frameworks.toLowerCase().indexOf(input2) >= 0) {
                return "Python";
            }
                
            // Check Java
         if(J.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               J.Creator.toLowerCase().indexOf(input2) >= 0 || 
               J.Owner.toLowerCase().indexOf(input2) >= 0 ||
               J.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               J.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               J.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               J.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               J.ide.toLowerCase().indexOf(input2) >= 0 || 
               J.frameworks.toLowerCase().indexOf(input2) >= 0) {
                return "Java";
            }
            
            //Check Ruby
          if(R.BirthDate.toLowerCase().indexOf(input2) >= 0 || 
               R.Creator.toLowerCase().indexOf(input2) >= 0 || 
               R.Owner.toLowerCase().indexOf(input2) >= 0 ||
               R.ReasonForDemand.toLowerCase().indexOf(input2) >= 0 || 
               R.GitHubUsageRank.toLowerCase().indexOf(input2) >= 0 || 
               R.KeyCompanies.toLowerCase().indexOf(input2) >= 0 || 
               R.AvgSalary.toLowerCase().indexOf(input2) >= 0 ||
               R.ide.toLowerCase().indexOf(input2) >= 0 || 
               R.frameworks.toLowerCase().indexOf(input2) >= 0) {
                return "Ruby";
            }
          return "false";
            }*/
}
            


