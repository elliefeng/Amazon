
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cart_UI extends Amazon_UI {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Cart_UI frame = new Cart_UI();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public Cart_UI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			getContentPane().setLayout(null);
			
			JLabel lblCart = new JLabel("My Cart");
			lblCart.setOpaque(true);
			lblCart.setBackground(Color.PINK);
			lblCart.setBounds(217, 19, 48, 28);
			getContentPane().add(lblCart);
			
			JLabel lblProduct1 = new JLabel("Product 1");
			lblProduct1.setOpaque(true);
			lblProduct1.setBackground(new Color(240, 230, 140));
			lblProduct1.setBounds(23, 59, 188, 28);
			getContentPane().add(lblProduct1);
			
			JLabel lblProduct2 = new JLabel("Product 2");
			lblProduct2.setOpaque(true);
			lblProduct2.setBackground(new Color(240, 230, 140));
			lblProduct2.setBounds(23, 99, 188, 28);
			getContentPane().add(lblProduct2);
			
			JLabel lblProduct3 = new JLabel("Product 3");
			lblProduct3.setOpaque(true);
			lblProduct3.setBackground(new Color(240, 230, 140));
			lblProduct3.setBounds(23, 139, 188, 28);
			getContentPane().add(lblProduct3);
			
			JButton btnRemove1 = new JButton("Remove Product 1");
			btnRemove1.setOpaque(true);
			btnRemove1.setBackground(new Color(240, 230, 140));
			btnRemove1.setBounds(271, 60, 162, 28);
			getContentPane().add(btnRemove1);
			
			JButton btnRemove2 = new JButton("Remove Product 2");
			btnRemove2.setOpaque(true);
			btnRemove2.setBackground(new Color(240, 230, 140));
			btnRemove2.setBounds(271, 100, 162, 28);
			getContentPane().add(btnRemove2);
			
			JButton btnRemove3 = new JButton("Remove Product 3");
			btnRemove3.setOpaque(true);
			btnRemove3.setBackground(new Color(240, 230, 140));
			btnRemove3.setBounds(271, 140, 162, 28);
			getContentPane().add(btnRemove3);
			

			
		}
	}


