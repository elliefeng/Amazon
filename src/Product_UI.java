import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Product_UI extends Amazon_UI {
	private static String name;
	private static double price;
	private static String attribute;
	private static int stock=5;
	private JLabel lblImage;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product_UI frame = new Product_UI(name, price, attribute);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Product_UI(String myName, double myPrice, String myAttribute) {
		myName = name;
		myPrice = price;
		myAttribute = attribute;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
	    
	    lblImage = new JLabel("");
	    java.awt.Image image = new ImageIcon("nike.png").getImage();
	    lblImage.setIcon(new ImageIcon(image));
	    lblImage.setBounds(28,31, 135, 159);
	    getContentPane().add(lblImage);
		
		JLabel lblRemainingStock = new JLabel("Remaining Stock: " + stock);
		lblRemainingStock.setOpaque(true);
		lblRemainingStock.setBounds(193, 96, 212, 28);
		getContentPane().add(lblRemainingStock);
		
		JButton btnAddCart = new JButton("Add to Cart");
		btnAddCart.setOpaque(true);
		btnAddCart.setBackground(new Color(240, 230, 140));
		btnAddCart.setBounds(193, 188, 217, 45);
		getContentPane().add(btnAddCart);
		btnAddCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				--stock;
			}
		});
		
		String[] quantity = {"1","2","3","4","5"};
		JComboBox quantityList = new JComboBox(quantity);
		quantityList.setBounds(195, 143, 73, 44);
		getContentPane().add(quantityList);
		JLabel lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setBounds(203, 130, 54, 16);
		getContentPane().add(lblNewLabel);
		
	}
}
