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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clothing_UI extends Product_UI{
	
	private static String name;
	private static double price;
	private static String color;
	public static int i = 0;
	
	public static JLabel lblImage = new JLabel("");
	
	private static final long serialVersionUID = 1048257216723871342L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductLists.addClothingProducts();
					Clothing_UI frame = new Clothing_UI(i);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Clothing_UI(int test) {
		super();
		//lblAmazon.setVisible(false);
		i = test;
		ProductLists.addClothingProducts();
		
		/*this.name = name;
		this.price = price;
		this.color = color;*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("");
	    lblImage.setIcon(new ImageIcon(ProductLists.listOfClothingProducts.get(i).myImage)); 
		lblImage.setBounds(28, 35, 96, 96);
		getContentPane().add(lblImage);
		
		JLabel txtrProduct = new JLabel();
		txtrProduct.setText("Product: " + ProductLists.listOfClothingProducts.get(i).myType);
		txtrProduct.setBounds(28, 181, 132, 32);
		getContentPane().add(txtrProduct);
		
		JLabel txtrPrice = new JLabel();
		txtrPrice.setText("Price: $" + ProductLists.listOfClothingProducts.get(i).myPrice);
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		
		JLabel txtrAttribute = new JLabel();
		txtrAttribute.setText("Color: " + ProductLists.listOfClothingProducts.get(i).myColor);
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
		
		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + ProductLists.listOfClothingProducts.get(i).myQuantity);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+1)%3;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfClothingProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfClothingProducts.get(i).myPrice);
				txtrAttribute.setText("Color: " + ProductLists.listOfClothingProducts.get(i).myColor);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfClothingProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfClothingProducts.get(i).myImage));
			}
		});
		btnNext.setBounds(321, 40, 105, 23);
		getContentPane().add(btnNext);
	
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+2)%3;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfClothingProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfClothingProducts.get(i).myPrice);
				txtrAttribute.setText("Color: " + ProductLists.listOfClothingProducts.get(i).myColor);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfClothingProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfClothingProducts.get(i).myImage));
			}
		});
		btnPrevious.setBounds(335, 71, 91, 23);
		getContentPane().add(btnPrevious);
		
		
		
		
	}

	public static void DisplayPicture(Image image) {
		lblImage.setIcon(new ImageIcon(image));
	    lblImage.setBounds(28, 31, 132, 138);
	}
}
