package View;



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

import Control.Cart;
import Model.Product;

import javax.swing.JButton;
	import javax.swing.JComboBox;
	import java.awt.List;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
			setBounds(100, 100, 685, 459);
			
			getContentPane().remove(lblAmazon);
			getContentPane().setLayout(null);
			
			JLabel lblCart = new JLabel("My Cart");
			lblCart.setForeground(new Color(34, 139, 34));
			lblCart.setHorizontalAlignment(SwingConstants.CENTER);
			lblCart.setBounds(284, 21, 122, 55);
			lblCart.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
			lblCart.setOpaque(true);
			lblCart.setBackground(Color.WHITE);
			getContentPane().add(lblCart);
			
			JTextPane txtpnCart = new JTextPane();
			txtpnCart.setForeground(new Color(34, 139, 34));
			String text = "";
			for(int i=0;i<Cart.CartList.size();i++) {
				text += Cart.CartList.get(i).toString() + "\n";
			}
			txtpnCart.setText(text);
			txtpnCart.setBounds(51, 83, 596, 248);
			getContentPane().add(txtpnCart);
			
			JButton btnNewButton = new JButton("Proceed to Payment");
			btnNewButton.setForeground(new Color(34, 139, 34));
			btnNewButton.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
			btnNewButton.setBounds(228, 338, 239, 55);
			getContentPane().add(btnNewButton);
			

			
		}
	}


