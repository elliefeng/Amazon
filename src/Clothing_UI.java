package src;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Clothing_UI extends Product_UI{
	
	private static String name;
	private static double price;
	private static String color;
	public static JLabel lblImage;
	
	private static final long serialVersionUID = 1048257216723871342L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clothing_UI frame = new Clothing_UI(name, price, color);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Clothing_UI(String name, double price, String color) {
		super(name, price, color);
		/*this.name = name;
		this.price = price;
		this.color = color;*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		//JLabel lblImage = new JLabel("");
	    //image = new ImageIcon(/*image*/).getImage();
	    //lblImage.setIcon(new ImageIcon(image));
		lblImage.setBounds(28, 31, 96, 96);
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
		txtrAttribute.setText("Color: " + color);
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
		
		String[] size = {"S","M","L","XL"};
		JComboBox sizeList1 = new JComboBox(size);
		sizeList1.setBounds(321, 143, 73, 44);
		getContentPane().add(sizeList1);
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setBounds(343, 130, 25, 16);
		getContentPane().add(lblNewLabel_1);
	}

	public static void DisplayPicture(Image image) {
		lblImage.setIcon(new ImageIcon(image));
	    lblImage.setBounds(28, 31, 132, 138);
	}
}
