package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Model.Product.PRODUCT_TYPE;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ProductList_UI extends Amazon_UI {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		//private JPanel contentPane;
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Search_UI frame = new Search_UI();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public ProductList_UI() {
		getContentPane().setBackground(new Color(0, 0, 139));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Our Products");
		lblNewLabel.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(108, 99, 691, 39);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 181, 149, 340);
		getContentPane().add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(248, 181, 149, 340);
		getContentPane().add(scrollPane_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(492, 181, 149, 340);
		getContentPane().add(scrollPane_2);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollPane_2.setRowHeaderView(scrollBar_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(729, 181, 149, 340);
		getContentPane().add(scrollPane_3);
		
		JScrollBar scrollBar_3 = new JScrollBar();
		scrollPane_3.setRowHeaderView(scrollBar_3);
		
		JLabel lblNewLabel_1 = new JLabel("Alibaba");
		lblNewLabel_1.setBounds(0, 0, 935, 82);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("src/alibaba.png"));
		
		
		
		getContentPane().remove(lblAmazon);
		
		
		
	}
}
