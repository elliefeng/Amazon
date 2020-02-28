

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Toys_UI extends Product_UI{

	/**
	 * 
	 */
	public static String name;
	public static double price;
	public static String ageGroup;
	public static int i = 0;
	private static final long serialVersionUID = -5865436019373463725L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Toys_UI frame = new Toys_UI(i);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Toys_UI(int test) {
		super();
		//lblAmazon.setVisible(false);
		i = test;
		ProductLists.addClothingProducts();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("Image Goes Here");
		lblImage.setHorizontalAlignment(JLabel. CENTER);
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.PINK);
		lblImage.setBounds(28, 31, 132, 138);
		getContentPane().add(lblImage);
		
		JLabel txtrProduct = new JLabel();
		txtrProduct.setText("Product: " + name);
		txtrProduct.setBounds(28, 181, 132, 32);
		getContentPane().add(txtrProduct);
		
		JLabel txtrPrice = new JLabel();
		txtrPrice.setText("Price: $" + price);
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		
		JLabel txtrAttribute = new JLabel();
		txtrAttribute.setText("Age Group: " + ageGroup);
		txtrAttribute.setBounds(193, 66, 132, 32);
		getContentPane().add(txtrAttribute);
		
		JButton btnAddCart = new JButton("Add to Cart");
		btnAddCart.setOpaque(true);
		btnAddCart.setBackground(new Color(240, 230, 140));
		btnAddCart.setBounds(193, 188, 217, 45);
		getContentPane().add(btnAddCart);
		
		String[] quantity = {"1","2","3","4","5"};
		JComboBox quantityList = new JComboBox(quantity);
		quantityList.setBounds(195, 143, 73, 44);
		getContentPane().add(quantityList);
		JLabel lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setBounds(203, 130, 54, 16);
		getContentPane().add(lblNewLabel);
	}
}
