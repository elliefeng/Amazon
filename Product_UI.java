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
		
		JLabel lblNewLabel = new JLabel("Image Goes Here");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(28, 31, 132, 138);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product Name: Shirt");
		lblNewLabel_1.setBounds(193, 20, 212, 39);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblProductPrice = new JLabel("Product Price: $19.99");
		lblProductPrice.setBounds(193, 71, 212, 39);
		getContentPane().add(lblProductPrice);
		
		JLabel lblProductSize = new JLabel("Product Size: M");
		lblProductSize.setBounds(193, 122, 212, 39);
		getContentPane().add(lblProductSize);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setBounds(184, 173, 217, 45);
		getContentPane().add(btnNewButton);
		
		
		
	}
}
