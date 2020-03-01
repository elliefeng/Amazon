package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

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

import Control.ProductList;
import Model.Clothing;
import Model.Product;
import Model.Product.PRODUCT_TYPE;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clothing_UI extends Product_UI{
	int i;							// index for clothing items
	ArrayList<Object> clothes;
	Clothing item;

	public static JLabel lblImage = new JLabel("");	
	private static final long serialVersionUID = 1048257216723871342L;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ProductLists.addProducts(Product.PRODUCT_TYPE.CLOTHING);
					Clothing_UI frame = new Clothing_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Clothing_UI() {
		super();
		i = 0;
		lblAmazon.setVisible(false);
		clothes = super.products.FilteredProductList(PRODUCT_TYPE.CLOTHING);
		Clothing item = (Clothing) clothes.get(i);

		
		/*this.name = name;
		this.price = price;
		this.color = color;*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 360);
		getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("");
	    lblImage.setIcon(new ImageIcon(item.myImage));
		lblImage.setBounds(28, 35, 96, 96);
		getContentPane().add(lblImage);
		
		JLabel txtrProduct = new JLabel();
		txtrProduct.setForeground(new Color(255, 255, 255));
		txtrProduct.setText(" Product: <dynamic>");
		txtrProduct.setBounds(28, 181, 132, 32);
		getContentPane().add(txtrProduct);
		txtrProduct.setOpaque(true);
		txtrProduct.setBackground(new Color(34, 139, 34));
		
		JLabel txtrPrice = new JLabel();
		txtrPrice.setForeground(new Color(255, 255, 255));
		txtrPrice.setText("Price: $" + item.myPrice);
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		txtrPrice.setOpaque(true);
		txtrPrice.setBackground(new Color(34, 139, 34));
		
		JLabel txtrAttribute = new JLabel();
		txtrAttribute.setForeground(new Color(255, 255, 255));
		txtrAttribute.setText("Color: " + item.myColor);
		txtrAttribute.setBounds(193, 66, 132, 32);
		getContentPane().add(txtrAttribute);
		txtrAttribute.setOpaque(true);
		txtrAttribute.setBackground(new Color(34, 139, 34));

		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + item.myQuantity);
		lblRemainingStock.setForeground(new Color(255, 255, 255));
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBackground(new Color(34, 139, 34));

		
		String[] quantity = {"1","2","3","4","5"};
		JComboBox quantityList = new JComboBox(quantity);
		quantityList.setForeground(new Color(0, 0, 0));
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
		btnAddCart.setBounds(193, 203, 217, 45);
		getContentPane().add(btnAddCart);
		btnAddCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (String)quantityList.getSelectedItem();
				int quant = Integer.parseInt(text);
				item.myQuantity = item.myQuantity - quant;
				lblRemainingStock.setText("Remaining Stock: " + item.myQuantity);
			}
		});
		
		String[] size = {"S","M","L","XL"};
		JComboBox sizeList1 = new JComboBox(size);
		sizeList1.setBackground(new Color(34, 139, 34));
		sizeList1.setBounds(321, 143, 73, 44);
		getContentPane().add(sizeList1);
		
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(343, 130, 25, 16);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(34, 139, 34));

		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = (i+1)%clothes.size();
				System.out.println(i);
				Clothing item = (Clothing) clothes.get(i);

				txtrProduct.setText("Product: " + item.myType);
				txtrPrice.setText("Price: $" + item.myPrice);
				txtrAttribute.setText("Color: " + item.myColor);
				lblRemainingStock.setText("Remaining Stock: " + item.myQuantity);
				lblImage.setIcon(new ImageIcon(item.myImage));
			}
		});
		btnNext.setBounds(338, 40, 105, 23);
		getContentPane().add(btnNext);
	
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i = i > 0 ? (i-1) : (clothes.size()-1);
				System.out.println(i);
				Clothing item = (Clothing) clothes.get(i);

				txtrProduct.setText("Product: " + item.myType);
				txtrPrice.setText("Price: $" + item.myPrice);
				txtrAttribute.setText("Color: " + item.myColor);
				lblRemainingStock.setText("Remaining Stock: " + item.myQuantity);
				lblImage.setIcon(new ImageIcon(item.myImage));
			}
		});
		btnPrevious.setBounds(339, 71, 104, 23);
		getContentPane().add(btnPrevious);	
		
		
	}

	
}
