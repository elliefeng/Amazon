package src;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Search_UI extends Amazon_UI {
	
	private JPanel contentPane;
	public static String search;
	public static JLabel errorMessage = new JLabel("");
	
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
	
	public Search_UI() {
	getContentPane().setBackground(new Color(0, 191, 255));
	getContentPane().setLayout(null);
	
	JTextField txtSearchForA = new JTextField();
	txtSearchForA.setText("Search for a Product:");
	txtSearchForA.setBounds(6, 6, 296, 26);
	getContentPane().add(txtSearchForA);
	txtSearchForA.setColumns(10);
	
	JTextArea txtrClothingShirtPant = new JTextArea();
	txtrClothingShirtPant.setText("Clothing: Shirt, Pant, Shoe");
	txtrClothingShirtPant.setBounds(16, 44, 176, 16);
	getContentPane().add(txtrClothingShirtPant);
	
	JTextArea txtrToysLegoRubber = new JTextArea();
	txtrToysLegoRubber.setText("Toys: Lego, Rubber Chicken, Stuffed Animal");
	txtrToysLegoRubber.setBounds(16, 72, 277, 16);
	getContentPane().add(txtrToysLegoRubber);
	
	JTextArea txtrElectronics = new JTextArea();
	txtrElectronics.setText("Electronics: Phone, Computer, TV");
	txtrElectronics.setBounds(16, 103, 215, 16);
	getContentPane().add(txtrElectronics);
	
	JTextArea txtrHome = new JTextArea();
	txtrHome.setText("Home: Couch, Table");
	txtrHome.setBounds(16, 131, 134, 16);
	getContentPane().add(txtrHome);
	
	JButton btnSearch = new JButton("Search");
	btnSearch.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
	btnSearch.setForeground(new Color(0, 191, 255));
	btnSearch.setBounds(314, 6, 117, 39);
	getContentPane().add(btnSearch);
	btnSearch.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			search = txtSearchForA.getText();
			SearchMain.main();
		}
	});
	errorMessage.setForeground(Color.RED);
	errorMessage.setFont(new Font("Iowan Old Style", Font.BOLD, 15));
	
	errorMessage.setBounds(38, 159, 376, 46);
	getContentPane().add(errorMessage);
	errorMessage.setText("");
	


	}
}
