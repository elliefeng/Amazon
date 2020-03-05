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
//import javax.swing.JTextArea;
//import javax.swing.JTextField;

import Control.Cart;
import Control.ProductList;
import Model.Clothing;
import Model.Product;
import Model.Product.PRODUCT_TYPE;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Generic_UI extends Amazon_UI {
	// Product List control values
	public int index;
	public ArrayList<Product> list;
	public Product item;

	// Definitions to support Labels
	public JLabel lblImage;	
	private JLabel txtrProduct;
	private JLabel txtrPrice;
	private JLabel txtrAttribute;
	private JLabel lblRemainingStock;
	private JLabel lblNewLabel_1;
	private String[] size = {"S","M","L","XL"};
	private JComboBox<?> sizeList1;
	
	private static final long serialVersionUID = 1048257216723871342L;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ALL,"");
					//frame.setVisible(true);
					frame.setItem(PRODUCT_TYPE.CLOTHING, "shirt");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Generic_UI(PRODUCT_TYPE pt, String filter) {
		//super();
		lblAmazon.setVisible(false);
		
		// setup landing item based off of any filters
		index = setItem(pt, filter);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 360);
		getContentPane().setLayout(null);
		
		// Icon
		lblImage = new JLabel("");
		lblImage.setBounds(28, 35, 96, 96);
		getContentPane().add(lblImage);
		
		// Product
		txtrProduct = new JLabel();
		txtrProduct.setForeground(new Color(255, 255, 255));
		txtrProduct.setBounds(28, 181, 132, 32);
		getContentPane().add(txtrProduct);
		txtrProduct.setOpaque(true);
		txtrProduct.setBackground(new Color(34, 139, 34));
		
		// Price
		txtrPrice = new JLabel();
		txtrPrice.setForeground(new Color(255, 255, 255));
		txtrPrice.setBounds(193, 35, 132, 32);
		getContentPane().add(txtrPrice);
		txtrPrice.setOpaque(true);
		txtrPrice.setBackground(new Color(34, 139, 34));
		
		// Custom/Attribute
		txtrAttribute = new JLabel();
		txtrAttribute.setForeground(new Color(255, 255, 255));
		txtrAttribute.setBounds(193, 66, 132, 32);
		getContentPane().add(txtrAttribute);
		txtrAttribute.setOpaque(true);
		txtrAttribute.setBackground(new Color(34, 139, 34));

		// Stock
		lblRemainingStock = new JLabel("");
		lblRemainingStock.setForeground(new Color(255, 255, 255));
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBackground(new Color(34, 139, 34));

		// Order quantity
		String[] quantity = {"1","2","3","4","5"};
		JComboBox<?> quantityList = new JComboBox<Object>(quantity);
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
				item.setQuantity(item.getQuantity() - quant);
				lblRemainingStock.setText(item.toStringQuantity());
				Cart.CartList.add(item);
			}
		});
		
		// Size = {"S","M","L","XL"};
		sizeList1 = new JComboBox<Object>(size);
		sizeList1.setBackground(new Color(34, 139, 34));
		sizeList1.setBounds(321, 143, 73, 44);
		getContentPane().add(sizeList1);
		lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(343, 130, 25, 16);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = (index+1) % list.size();
				System.out.println(index);
				item = (Product) list.get(index);
				setText(item);
			}
		});
		btnNext.setBounds(338, 40, 105, 23);
		getContentPane().add(btnNext);
	
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index = index > 0 ? (index-1) : (list.size()-1);
				System.out.println(index);
				item = (Product) list.get(index);
				setText(item);
			}
		});
		
		// set text for buttons
		setText(item);
		
		btnPrevious.setBounds(339, 71, 104, 23);
		getContentPane().add(btnPrevious);	
		
		
	}
	
	/* 
	 * One place for setting text
	 */
	public void setText(Product item) {
		// set text for buttons
		txtrProduct.setText(item.toStringProduct());
		txtrPrice.setText(item.toStringPrice());
		txtrAttribute.setText(item.toStringCustom());
		lblRemainingStock.setText(item.toStringQuantity());
		lblImage.setIcon(new ImageIcon(item.myImage));
		
		if (item.getProductType() == PRODUCT_TYPE.CLOTHING) {
			sizeList1.setVisible(true);
			lblNewLabel_1.setVisible(true);
		} else {
			sizeList1.setVisible(false);
			lblNewLabel_1.setVisible(false);
		}
		
	}
	
	/*
	 * logic for selection of current item to display
	 */
	public int setItem(PRODUCT_TYPE pt, String filter) {
		int i = 0;
		
		if (pt == PRODUCT_TYPE.ALL) {
			list = super.products.FilteredList(pt, filter);
			item = (Product) list.get(i);

		} else {
			list = super.products.FilteredProductList(pt);
			for (Object p : list) {
				item = (Product) p;
				if (item.myType.contentEquals(filter))
					break;
				i++;
			}
		}
		return i;
	}
	
}
