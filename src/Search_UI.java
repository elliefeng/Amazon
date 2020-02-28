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
	getContentPane().setBackground(new Color(0, 0, 139));
	getContentPane().setLayout(null);
	
	getContentPane().remove(lblAmazon);
	
	JTextField txtSearchForA = new JTextField();
	txtSearchForA.setForeground(new Color(34, 139, 34));
	txtSearchForA.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
	txtSearchForA.setText("Search for a Product:");
	txtSearchForA.setBounds(6, 6, 296, 39);
	getContentPane().add(txtSearchForA);
	txtSearchForA.setColumns(10);
	
	JTextArea txtrClothingShirtPant = new JTextArea();
	txtrClothingShirtPant.setForeground(new Color(255, 255, 255));
	txtrClothingShirtPant.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrClothingShirtPant.setText("Clothing:\nShirt\nPant\nShoe");
	txtrClothingShirtPant.setBounds(68, 69, 155, 124);
	getContentPane().add(txtrClothingShirtPant);
	txtrClothingShirtPant.setBackground(new Color(34, 139, 34));
	
	JTextArea txtrToysLegoRubber = new JTextArea();
	txtrToysLegoRubber.setForeground(new Color(255, 255, 255));
	txtrToysLegoRubber.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrToysLegoRubber.setText("Toys:\nLego\nRubber Chicken\nStuffed Animal");
	txtrToysLegoRubber.setBounds(68, 205, 155, 124);
	getContentPane().add(txtrToysLegoRubber);
	txtrToysLegoRubber.setBackground(new Color(34, 139, 34));
	
	JTextArea txtrElectronics = new JTextArea();
	txtrElectronics.setForeground(new Color(255, 255, 255));
	txtrElectronics.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrElectronics.setText("Electronics:\nPhone\nComputer\nTV");
	txtrElectronics.setBounds(260, 69, 124, 124);
	getContentPane().add(txtrElectronics);
	txtrElectronics.setBackground(new Color(34, 139, 34));
	
	JTextArea txtrHome = new JTextArea();
	txtrHome.setForeground(new Color(255, 255, 255));
	txtrHome.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrHome.setText("Home:\nCouch\nTable");
	txtrHome.setBounds(260, 205, 124, 119);
	getContentPane().add(txtrHome);
	txtrHome.setBackground(new Color(34, 139, 34));
	
	JButton btnSearch = new JButton("Search");
	btnSearch.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
	btnSearch.setForeground(new Color(34, 139, 34));
	btnSearch.setBounds(314, 7, 117, 39);
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
