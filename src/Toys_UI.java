

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
		lblAmazon.setVisible(false);
		i = test;
		ProductLists.addToyProducts();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 363);
		getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(ProductLists.listOfToyProducts.get(i).myImage)); 
		lblImage.setHorizontalAlignment(JLabel. CENTER);
		//lblImage.setOpaque(true);
		//lblImage.setBackground(Color.PINK);
		lblImage.setBounds(28, 35, 96, 96);
		getContentPane().add(lblImage);
		
		JLabel txtrProduct = new JLabel();
		txtrProduct.setForeground(new Color(255, 255, 255));
		txtrProduct.setText(" Product: " + ProductLists.listOfToyProducts.get(i).myType);
		txtrProduct.setBounds(6, 171, 174, 32);
		getContentPane().add(txtrProduct);
		txtrProduct.setOpaque(true);
		txtrProduct.setBackground(new Color(34, 139, 34));
		
		JLabel txtrPrice = new JLabel();
		txtrPrice.setForeground(new Color(255, 255, 255));
		txtrPrice.setText("Price: $" + ProductLists.listOfToyProducts.get(i).myPrice);
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		txtrPrice.setOpaque(true);
		txtrPrice.setBackground(new Color(34, 139, 34));
		
		JLabel txtrAttribute = new JLabel();
		txtrAttribute.setForeground(new Color(255, 255, 255));
		txtrAttribute.setText("Brand: " + ProductLists.listOfToyProducts.get(i).myBrand);
		txtrAttribute.setBounds(193, 66, 132, 32);
		getContentPane().add(txtrAttribute);
		txtrAttribute.setOpaque(true);
		txtrAttribute.setBackground(new Color(34, 139, 34));

		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + ProductLists.listOfToyProducts.get(i).myQuantity);
		lblRemainingStock.setForeground(new Color(255, 255, 255));
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBackground(new Color(34, 139, 34));
		
		String[] quantity = {"1","2","3","4","5"};
		JComboBox quantityList = new JComboBox(quantity);
		quantityList.setForeground(new Color(0, 0, 0));
		quantityList.setBounds(195, 140, 73, 44);
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
		btnAddCart.setBounds(195, 199, 217, 45);
		getContentPane().add(btnAddCart);
		btnAddCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (String)quantityList.getSelectedItem();
				int quant = Integer.parseInt(text);
				ProductLists.listOfToyProducts.get(i).myQuantity = ProductLists.listOfToyProducts.get(i).myQuantity - quant;
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfToyProducts.get(i).myQuantity);
			}
		});
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+1)%3;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfToyProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfToyProducts.get(i).myPrice);
				txtrAttribute.setText("Color: " + ProductLists.listOfToyProducts.get(i).myBrand);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfToyProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfToyProducts.get(i).myImage));
			}
		});
		btnNext.setBounds(335, 35, 105, 23);
		getContentPane().add(btnNext);
	
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+2)%3;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfToyProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfToyProducts.get(i).myPrice);
				txtrAttribute.setText("Color: " + ProductLists.listOfToyProducts.get(i).myBrand);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfToyProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfToyProducts.get(i).myImage));
			}
		});
		btnPrevious.setBounds(335, 66, 105, 23);
		getContentPane().add(btnPrevious);
		
	}
}
