

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Electronics_UI extends Product_UI{
 public static int i = 0;
 
 public static JLabel lblImage = new JLabel("");
	
	private static final long serialVersionUID = -5865436019373463725L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductLists.addElectronicProducts();
					Electronics_UI frame = new Electronics_UI(i);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Electronics_UI(int test) {
		super();
		lblAmazon.setVisible(false);
		i = test;
		ProductLists.addElectronicProducts();
		
		
		/*this.name = name;
		this.price = price;
		this.color = color;*/
		
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
		txtrProduct.setText("Product: " + ProductLists.listOfElectronicProducts.get(i).myType);
		txtrProduct.setBounds(28, 181, 132, 32);
		getContentPane().add(txtrProduct);
		
		JLabel txtrPrice = new JLabel();
		txtrPrice.setText("Price: $" + ProductLists.listOfElectronicProducts.get(i).myPrice);
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		
		JLabel txtrAttribute = new JLabel();
		txtrAttribute.setText("Brand: " + ProductLists.listOfElectronicProducts.get(i).myBrand);
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
		
		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + ProductLists.listOfElectronicProducts.get(i).myQuantity);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+1)%3;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfElectronicProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfElectronicProducts.get(i).myPrice);
				txtrAttribute.setText("Brand: " + ProductLists.listOfElectronicProducts.get(i).myBrand);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfElectronicProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfElectronicProducts.get(i).myImage));
			}
		});
		btnNext.setBounds(321, 40, 105, 23);
		getContentPane().add(btnNext);
	
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+2)%3;
				System.out.println(i);
				txtrProduct.setText("Product: " + ProductLists.listOfElectronicProducts.get(i).myType);
				txtrPrice.setText("Price: $" + ProductLists.listOfElectronicProducts.get(i).myPrice);
				txtrAttribute.setText("Brand: " + ProductLists.listOfElectronicProducts.get(i).myBrand);
				lblRemainingStock.setText("Remaining Stock: " + ProductLists.listOfElectronicProducts.get(i).myQuantity);
				lblImage.setIcon(new ImageIcon(ProductLists.listOfElectronicProducts.get(i).myImage));
				
			}
			
		});
		btnPrevious.setBounds(335, 71, 91, 23);
		getContentPane().add(btnPrevious);
		
	}
}
			
	

	
