import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;

/** Menu<br>
 * Entry point for project
 * 
 * @author 3rd Period Class
 *
 *
 */
public class Amazon_UI extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Amazon_UI frame = new Amazon_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Amazon_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// JLabel with image 
		/*JLabel pic = new JLabel("");        
        java.awt.Image image = new ImageIcon("APCompSci.jpeg").getImage();
        this.setIconImage(new ImageIcon("./AP_Exam/chandu.txt").getImage()); // easter egg
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(377, 111, 128, 128);
        
        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = getContentPane();
        content.setBackground(new Color(100,100,255));
        content.add(pic);*/
        
        // Menu Objects 
        JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
        
		JMenu mnClothing = new JMenu("Clothing");
		menuBar.add(mnClothing);
		
		JMenuItem mntmShirt = new JMenuItem("Shirt");
		mnClothing.add(mntmShirt);
		
		JMenuItem mntmPant = new JMenuItem("Pant");
		mnClothing.add(mntmPant);
		
		JMenuItem mntmShoe = new JMenuItem("Shoe");
		mnClothing.add(mntmShoe);
		
		JMenu mnToys = new JMenu("Toys");
		menuBar.add(mnToys);
		
		JMenuItem mntmChicken = new JMenuItem("Rubber Chicken");
		mnToys.add(mntmChicken);
		
		JMenuItem mntmLegos = new JMenuItem("Lego");
		mnToys.add(mntmLegos);
		
		JMenuItem mntmStuffedAnimals = new JMenuItem("Stuffed Animal");
		mnToys.add(mntmStuffedAnimals);
		
		JMenu mnElectronics = new JMenu("Electronics");
		menuBar.add(mnElectronics);
		
		JMenuItem mntmPhone = new JMenuItem("Phone");
		mnElectronics.add(mntmPhone);
		
		JMenuItem mntmComputer = new JMenuItem("Computer");
		mnElectronics.add(mntmComputer);
		
		JMenuItem mntmTV = new JMenuItem("TV");
		mnElectronics.add(mntmTV);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmFurniture = new JMenuItem("Furniture");
		mnHome.add(mntmFurniture);
		
		JMenuItem mntmPalindrom = new JMenuItem("Decor");
		mnHome.add(mntmPalindrom);
		
		JMenu Cart = new JMenu("My Cart");
		menuBar.add(Cart);
		
		JMenuItem mntmCheckout = new JMenuItem("Proceed to Checkout");
		Cart.add(mntmCheckout);
		
		
		
	}
	
}
