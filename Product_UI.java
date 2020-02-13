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
		
		JLabel lblName = new JLabel("Product Name: Shirt");
		lblName.setOpaque(true);
		lblName.setBackground(new Color(240, 230, 140));
		lblName.setBounds(193, 20, 212, 39);
		getContentPane().add(lblName);
		
		JLabel lblProductPrice = new JLabel("Product Price: $19.99");
		lblProductPrice.setOpaque(true);
		lblProductPrice.setBackground(new Color(240, 230, 140));
		lblProductPrice.setBounds(193, 71, 212, 39);
		getContentPane().add(lblProductPrice);
		
		JLabel lblProductSize = new JLabel("Product Size: M");
		lblProductSize.setOpaque(true);
		lblProductSize.setBackground(new Color(240, 230, 140));
		lblProductSize.setBounds(193, 122, 212, 39);
		getContentPane().add(lblProductSize);
		
		JButton btnAddCart = new JButton("Add to Cart");
		btnAddCart.setOpaque(true);
		btnAddCart.setBackground(new Color(240, 230, 140));
		btnAddCart.setBounds(184, 173, 217, 45);
		getContentPane().add(btnAddCart);
		
		
		
	}
}
