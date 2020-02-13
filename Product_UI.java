import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.List;

public class Product_UI extends Amazon_UI {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product_UI frame = new Product_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Product_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblImage = new JLabel("Image Goes Here");
		lblImage.setHorizontalAlignment(JLabel. CENTER);
		lblImage.setOpaque(true);
		lblImage.setBackground(Color.PINK);
		lblImage.setBounds(28, 31, 132, 138);
		getContentPane().add(lblImage);
		
		String name = "Shirt";
		JLabel lblName = new JLabel("Product Name: " + name);
		lblName.setOpaque(true);
		lblName.setBackground(new Color(240, 230, 140));
		lblName.setBounds(28, 181, 132, 28);
		getContentPane().add(lblName);
		
		double price = 19.99;
		JLabel lblProductPrice = new JLabel("Product Price: $" + price);
		lblProductPrice.setOpaque(true);
		lblProductPrice.setBackground(new Color(240, 230, 140));
		lblProductPrice.setBounds(193, 19, 212, 28);
		getContentPane().add(lblProductPrice);
		
		JLabel lblRandomAttribute = new JLabel("Random Attribute: ");
		lblRandomAttribute.setOpaque(true);
		lblRandomAttribute.setBackground(new Color(240, 230, 140));
		lblRandomAttribute.setBounds(193, 59, 212, 28);
		getContentPane().add(lblRandomAttribute);
		
		JButton btnAddCart = new JButton("Add to Cart");
		btnAddCart.setOpaque(true);
		btnAddCart.setBackground(new Color(240, 230, 140));
		btnAddCart.setBounds(193, 188, 217, 45);
		getContentPane().add(btnAddCart);
		
		int stock = 1;
		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + stock);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBackground(new Color(240, 230, 140));
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		
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
}
