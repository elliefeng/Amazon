package View;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Control.ProductLists;

public class Home_UI extends Product_UI{

	/**
	 * 
	 */
	public static String name;
	public static double price;
	public static String dimensions;
	public static int i = 0;
	private static final long serialVersionUID = -5865436019373463725L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_UI frame = new Home_UI(i);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Home_UI(int test) {
		super();
		lblAmazon.setVisible(false);
		i = test;
		ProductLists.addHomeProducts();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 373);
		getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(ProductLists.listOfHomeProducts.get(i).myImage)); 
		lblImage.setHorizontalAlignment(JLabel. CENTER);
		//lblImage.setOpaque(true);
		//lblImage.setBackground(Color.PINK);
		lblImage.setBounds(28, 35, 96, 96);
		getContentPane().add(lblImage);
		
		JLabel txtrProduct = new JLabel();
		txtrProduct.setForeground(new Color(255, 255, 255));
		txtrProduct.setText(" Product: " + ProductLists.listOfHomeProducts.get(i).myType);
		txtrProduct.setBounds(28, 181, 132, 32);
		getContentPane().add(txtrProduct);
		txtrProduct.setOpaque(true);
		txtrProduct.setBackground(new Color(34, 139, 34));
		
		JLabel txtrPrice = new JLabel();
		txtrPrice.setForeground(new Color(255, 255, 255));
		txtrPrice.setText("Price: $" + ProductLists.listOfHomeProducts.get(i).myPrice);
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		txtrPrice.setOpaque(true);
		txtrPrice.setBackground(new Color(34, 139, 34));
		
		JLabel txtrAttribute = new JLabel();
		txtrAttribute.setForeground(new Color(255, 255, 255));
		txtrAttribute.setText("Dimensions: " + ProductLists.listOfHomeProducts.get(i).myDimensions);
		txtrAttribute.setBounds(193, 66, 132, 32);
		getContentPane().add(txtrAttribute);
		txtrAttribute.setOpaque(true);
		txtrAttribute.setBackground(new Color(34, 139, 34));

		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + ProductLists.listOfHomeProducts.get(i).myQuantity);
		lblRemainingStock.setForeground(new Color(255, 255, 255));
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBackground(new Color(34, 139, 34));
		
		String[] quantity = {"1","2","3","4","5"};
		JComboBox quantityList = new JComboBox(quantity);
		quantityList.setBounds(195, 143, 73, 44);
		getContentPane().add(quantityList);
		JLabel lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(203, 130, 54, 16);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(34, 139, 34));
		
		JButton btnAddCart = new JButton("Add to Cart");
		btnAddCart.setOpaque(true);
		btnAddCart.setBackground(new Color(218, 165, 32));
		btnAddCart.setBounds(193, 205, 217, 45);
		getContentPane().add(btnAddCart);
		btnAddCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (String)quantityList.getSelectedItem();
				int quant = Integer.parseInt(text);
				ProductLists.listOfHomeProducts.get(i).myQuantity = ProductLists.listOfHomeProducts.get(i).myQuantity - quant;
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfHomeProducts.get(i).myQuantity);
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+1)%2;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfHomeProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfHomeProducts.get(i).myPrice);
				txtrAttribute.setText("Color: " + ProductLists.listOfHomeProducts.get(i).myDimensions);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfHomeProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfHomeProducts.get(i).myImage));
			}
		});
		btnNext.setBounds(334, 35, 105, 23);
		getContentPane().add(btnNext);
	
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+1)%2;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfHomeProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfHomeProducts.get(i).myPrice);
				txtrAttribute.setText("Color: " + ProductLists.listOfHomeProducts.get(i).myDimensions);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfHomeProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfHomeProducts.get(i).myImage));
			}
		});
		btnPrevious.setBounds(334, 66, 105, 23);
		getContentPane().add(btnPrevious);
		
	}
}
