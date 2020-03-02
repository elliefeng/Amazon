package View;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Control.ProductList;
import Model.Product.PRODUCT_TYPE;

import java.awt.BorderLayout;

/** Menu<br>
 * Entry point for project
 * 
 * @author 
 *
 *
 */
public class Amazon_UI extends JFrame {
	JLabel lblAmazon = new JLabel("");
	ProductList products = new ProductList();

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
					Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ALL,"");
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
		setBounds(100, 100, 738, 536);
		getContentPane().setBackground(new Color(0, 0, 139));
		setBackground(new Color(34, 139, 34));
		//setOpacity(true);
		
        // Menu Objects 
        JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
        
		JMenu mnClothing = new JMenu("Clothing");
		mnClothing.setForeground(new Color(34, 139, 34));
		menuBar.add(mnClothing);
		
		JMenuItem mntmShirt = new JMenuItem("Shirt");
		mnClothing.add(mntmShirt);
		mntmShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shirt");
		        frame.setVisible(true); 
			}
		});
		
		JMenuItem mntmPant = new JMenuItem("Pants");
		mnClothing.add(mntmPant);
		mntmPant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Pants");
		        frame.setVisible(true); 
			}
		});
		
		JMenuItem mntmShoe = new JMenuItem("Shoes");
		mnClothing.add(mntmShoe);
		mntmShoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shoes");
		        frame.setVisible(true); 
			}
		});
		
		JMenu mnToys = new JMenu("Toys");
		mnToys.setForeground(new Color(34, 139, 34));
		menuBar.add(mnToys);
		
		JMenuItem mntmChicken = new JMenuItem("Rubber Chicken");
		mnToys.add(mntmChicken);
		mntmChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.TOYS, "Rubber Chicken");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmLegos = new JMenuItem("Lego");
		mnToys.add(mntmLegos);
		mntmLegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.TOYS, "Lego");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmStuffedAnimals = new JMenuItem("Stuffed Animal");
		mnToys.add(mntmStuffedAnimals);
		mntmStuffedAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.TOYS, "Stuffed Animal");
				frame.setVisible(true);
			}
		});
		
		JMenu mnElectronics = new JMenu("Electronics");
		mnElectronics.setForeground(new Color(34, 139, 34));
		menuBar.add(mnElectronics);

		JMenuItem mntmPhone = new JMenuItem("Phone");
		mnElectronics.add(mntmPhone);
		mntmPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new Electronics_UI(0).setVisible(true);
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Phone");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmComputer = new JMenuItem("Computer");
		mnElectronics.add(mntmComputer);
		mntmComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Computer");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmTV = new JMenuItem("TV");
		mnElectronics.add(mntmTV);
		mntmTV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "TV");
				frame.setVisible(true);
			}
		});
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setForeground(new Color(34, 139, 34));
		menuBar.add(mnHome);
		
		JMenuItem mntmFurniture = new JMenuItem("Couch");
		mnHome.add(mntmFurniture);
		mntmFurniture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.HOME, "Couch");
				frame.setVisible(true);
			}
		});
		
		JMenuItem mntmDecor = new JMenuItem("Table");
		mnHome.add(mntmDecor);
		mntmDecor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.HOME, "Table");
				frame.setVisible(true);
			}
		});
		
		JMenu mnSearch = new JMenu("Search");
		mnSearch.setForeground(new Color(0, 0, 128));
		menuBar.add(mnSearch);
		
		JMenuItem mntmSearch = new JMenuItem("Search for a product");
		mnSearch.add(mntmSearch);
		mntmSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search_UI frame = new Search_UI();
				frame.setVisible(true);
			}
		});
		
		JMenu Cart = new JMenu("My Cart");
		Cart.setForeground(new Color(0, 0, 139));
		menuBar.add(Cart);
		
		JMenuItem mntmCheckout = new JMenuItem("Proceed to Checkout");
		Cart.add(mntmCheckout);
		getContentPane().setLayout(null);
		mntmCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart_UI frame = new Cart_UI();
				frame.setVisible(true);
			}
		});
		
		lblAmazon.setOpaque(true);
		//lblAmazon.setBackground(Color.ORANGE);
		//lblAmazon.setBounds(6, 6, 617, 377);
		getContentPane().add(lblAmazon); 
		lblAmazon.setIcon(new ImageIcon("src/ellie.jpg"));
		
	}
	
}
