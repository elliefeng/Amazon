package View;
import javax.swing.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.SearchMain;
import Model.Product.PRODUCT_TYPE;

public class Search_UI extends Amazon_UI {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
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
		txtSearchForA.setFont(new Font("Myanmar MN", Font.PLAIN, 16));
		txtSearchForA.setText("Search for a Product:");
		txtSearchForA.setBounds(329, 22, 266, 39);
		getContentPane().add(txtSearchForA);
		txtSearchForA.setColumns(10);

		JLabel lblNewLabel = new JLabel("Our Products");
		lblNewLabel.setBounds(357, 96, 216, 39);
		lblNewLabel.setFont(new Font("Myanmar MN", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
	//CLOTHING PANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 147, 149, 373);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		JLabel shirtpic = new JLabel("shirtpic");
		shirtpic.setBounds(17, 0, 96, 96);
		shirtpic.setIcon(new ImageIcon("src/nike.jpg"));
		panel.add(shirtpic);
		JLabel pantspic = new JLabel("pantspic");
		pantspic.setBounds(17, 116, 96, 96);
		pantspic.setIcon(new ImageIcon("src/pants.jpg"));
		panel.add(pantspic);
		JLabel shoespic = new JLabel("shoespic");
		shoespic.setBounds(17, 234, 96, 96);
		shoespic.setIcon(new ImageIcon("src/shoes.jpg"));
		panel.add(shoespic);
		
		JButton btnShirt = new JButton("Shirt");
		btnShirt.setBounds(6, 94, 117, 29);
		panel.add(btnShirt);
		btnShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shirt");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnPants = new JButton("Pants");
		btnPants.setBounds(6, 208, 117, 29);
		panel.add(btnPants);
		btnPants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Pants");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnShoes = new JButton("Shoes");
		btnShoes.setBounds(6, 342, 117, 29);
		panel.add(btnShoes);
		btnShoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.CLOTHING, "Shoes");
			     frame.setVisible(true); 
			}
		});
		
		
	//ELECTRONICS PANEL
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(264, 147, 149, 373);
		getContentPane().add(scrollPane_1);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setViewportView(panel1);
		panel1.setLayout(null);
		JLabel phonepic = new JLabel("phonepic");
		phonepic.setBounds(17, 0, 96, 96);
		phonepic.setIcon(new ImageIcon("src/nokia.jpg"));
		panel1.add(phonepic);
		JLabel tvpic = new JLabel("tvpic");
		tvpic.setBounds(17, 116, 96, 96);
		tvpic.setIcon(new ImageIcon("src/tv.jpg"));
		panel1.add(tvpic);
		JLabel laptoppic = new JLabel("laptoppic");
		laptoppic.setBounds(17, 234, 96, 96);
		laptoppic.setIcon(new ImageIcon("src/computer.jpg"));
		panel1.add(laptoppic);
		
		JButton btnPhone = new JButton("Phone");
		btnPhone.setBounds(6, 96, 117, 29);
		panel1.add(btnPhone);
		btnPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Phone");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnTv = new JButton("Television");
		btnTv.setBounds(6, 210, 117, 29);
		panel1.add(btnTv);
		btnTv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Television");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnComputer = new JButton("Laptop");
		btnComputer.setBounds(6, 342, 117, 29);
		panel1.add(btnComputer);
		btnComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ELECTRONICS, "Laptop");
			     frame.setVisible(true); 
			}
		});
		
	//TOYS PANEL
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(492, 147, 149, 373);
		getContentPane().add(scrollPane_2);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setViewportView(panel2);
		panel2.setLayout(null);
		JLabel chickenpic = new JLabel("rubberchickenpic");
		chickenpic.setBounds(17, 0, 96, 96);
		chickenpic.setIcon(new ImageIcon("src/rubberchicken.jpg"));
		panel2.add(chickenpic);
		JLabel animalpic = new JLabel("stuffedanimalpic");
		animalpic.setBounds(17, 116, 96, 96);
		animalpic.setIcon(new ImageIcon("src/stuffedanimal.jpg"));
		panel2.add(animalpic);
		JLabel legopic = new JLabel("legopic");
		legopic.setBounds(17, 234, 96, 96);
		legopic.setIcon(new ImageIcon("src/lego.jpg"));
		panel2.add(legopic);
		
		JButton btnRubberChicken = new JButton("Rubber Chicken");
		btnRubberChicken.setBounds(0, 94, 124, 29);
		panel2.add(btnRubberChicken);
		btnRubberChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.TOYS, "Rubber Chicken");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnStuffedAnimal = new JButton("Stuffed Animal");
		btnStuffedAnimal.setBounds(0, 208, 124, 29);
		panel2.add(btnStuffedAnimal);
		btnStuffedAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.TOYS, "Stuffed Animal");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnLegos = new JButton("Ninjago Dragon");
		btnLegos.setBounds(0, 342, 124, 29);
		panel2.add(btnLegos);
		btnLegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.TOYS, "Ninjago");
			     frame.setVisible(true); 
			}
		});

	//HOME PANEL
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(721, 147, 149, 373);
		getContentPane().add(scrollPane_3);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setViewportView(panel3);
		panel3.setLayout(null);
		JLabel couchpic = new JLabel("couchpic");
		couchpic.setBounds(17, 0, 96, 96);
		couchpic.setIcon(new ImageIcon("src/couch.jpg"));
		panel3.add(couchpic);
		JLabel tablepic = new JLabel("tablepic");
		tablepic.setBounds(17, 116, 96, 96);
		tablepic.setIcon(new ImageIcon("src/table.jpg"));
		panel3.add(tablepic);
		
		JButton btnCouch = new JButton("Sofa");
		btnCouch.setBounds(6, 91, 124, 29);
		panel3.add(btnCouch);
		btnCouch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.HOME, "Couch");
			     frame.setVisible(true); 
			}
		});
		
		JButton btnTable = new JButton("Table");
		btnTable.setBounds(6, 208, 124, 29);
		panel3.add(btnTable);
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Generic_UI frame = new Generic_UI(PRODUCT_TYPE.HOME, "Table");
			     frame.setVisible(true); 
			}
		});

	//PRODUCT LABELS
		JLabel lblClothing = new JLabel("Clothing");
		lblClothing.setForeground(new Color(34, 139, 34));
		lblClothing.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		lblClothing.setBounds(68, 120, 95, 29);
		getContentPane().add(lblClothing);
		
		JLabel lblElectronics = new JLabel("Electronics");
		lblElectronics.setForeground(new Color(34, 139, 34));
		lblElectronics.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		lblElectronics.setBounds(279, 120, 116, 29);
		getContentPane().add(lblElectronics);
		
		JLabel lblToys = new JLabel("Toys");
		lblToys.setForeground(new Color(34, 139, 34));
		lblToys.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		lblToys.setBounds(537, 120, 58, 29);
		getContentPane().add(lblToys);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(new Color(34, 139, 34));
		lblHome.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		lblHome.setBounds(751, 120, 73, 29);
		getContentPane().add(lblHome);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		btnSearch.setForeground(new Color(34, 139, 34));
		btnSearch.setBounds(753, 22, 117, 39);
		getContentPane().add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search = txtSearchForA.getText();
				SearchMain.main();
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ALL, search);
		        
				frame.setVisible(true); 
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Alibaba");
		lblNewLabel_1.setBounds(0, 0, 935, 82);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("src/alibaba.png"));
		
		
		/*JTextArea txtrClothingShirtPant = new JTextArea();
		txtrClothingShirtPant.setForeground(new Color(255, 255, 255));
		txtrClothingShirtPant.setFont(new Font("YuGothic", Font.PLAIN, 20));
		txtrClothingShirtPant.setText("CLOTHING:\nShirt\nPant\nShoe");
		txtrClothingShirtPant.setBounds(68, 69, 155, 124);
		getContentPane().add(txtrClothingShirtPant);
		txtrClothingShirtPant.setBackground(new Color(34, 139, 34));
		
		JTextArea txtrToysLegoRubber = new JTextArea();
		txtrToysLegoRubber.setForeground(new Color(255, 255, 255));
		txtrToysLegoRubber.setFont(new Font("YuGothic", Font.PLAIN, 20));
		txtrToysLegoRubber.setText("TOYS:\nLego\nRubber Chicken\nStuffed Animal");
		txtrToysLegoRubber.setBounds(68, 205, 155, 124);
		getContentPane().add(txtrToysLegoRubber);
		txtrToysLegoRubber.setBackground(new Color(34, 139, 34));
		
		JTextArea txtrElectronics = new JTextArea();
		txtrElectronics.setForeground(new Color(255, 255, 255));
		txtrElectronics.setFont(new Font("YuGothic", Font.PLAIN, 20));
		txtrElectronics.setText("ELECTRONICS:\nPhone\nComputer\nTelevision");
		txtrElectronics.setBounds(260, 69, 124, 124);
		getContentPane().add(txtrElectronics);
		txtrElectronics.setBackground(new Color(34, 139, 34));
		
		JTextArea txtrHome = new JTextArea();
		txtrHome.setForeground(new Color(255, 255, 255));
		txtrHome.setFont(new Font("YuGothic", Font.PLAIN, 20));
		txtrHome.setText("HOME:\nCouch\nTable");
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
				Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ALL, search);
		        
				frame.setVisible(true); 
			}
		});*/
		
		errorMessage.setForeground(Color.RED);
		errorMessage.setFont(new Font("Dialog", Font.BOLD, 32));
		errorMessage.setBounds(197, 521, 527, 60);
		getContentPane().add(errorMessage);
		errorMessage.setText("");
		
		}
}
	


	
	/*JTextField txtSearchForA = new JTextField();
	txtSearchForA.setForeground(new Color(34, 139, 34));
	txtSearchForA.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
	txtSearchForA.setText("Search for a Product:");
	txtSearchForA.setBounds(6, 6, 296, 39);
	getContentPane().add(txtSearchForA);
	txtSearchForA.setColumns(10);
	
	JTextArea txtrClothingShirtPant = new JTextArea();
	txtrClothingShirtPant.setForeground(new Color(255, 255, 255));
	txtrClothingShirtPant.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrClothingShirtPant.setText("CLOTHING:\nShirt\nPant\nShoe");
	txtrClothingShirtPant.setBounds(68, 69, 155, 124);
	getContentPane().add(txtrClothingShirtPant);
	txtrClothingShirtPant.setBackground(new Color(34, 139, 34));
	
	JTextArea txtrToysLegoRubber = new JTextArea();
	txtrToysLegoRubber.setForeground(new Color(255, 255, 255));
	txtrToysLegoRubber.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrToysLegoRubber.setText("TOYS:\nLego\nRubber Chicken\nStuffed Animal");
	txtrToysLegoRubber.setBounds(68, 205, 155, 124);
	getContentPane().add(txtrToysLegoRubber);
	txtrToysLegoRubber.setBackground(new Color(34, 139, 34));
	
	JTextArea txtrElectronics = new JTextArea();
	txtrElectronics.setForeground(new Color(255, 255, 255));
	txtrElectronics.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrElectronics.setText("ELECTRONICS:\r\nPhone\r\nComputer\r\nTV");
	txtrElectronics.setBounds(260, 69, 155, 124);
	getContentPane().add(txtrElectronics);
	txtrElectronics.setBackground(new Color(34, 139, 34));
	
	JTextArea txtrHome = new JTextArea();
	txtrHome.setForeground(new Color(255, 255, 255));
	txtrHome.setFont(new Font("YuGothic", Font.PLAIN, 20));
	txtrHome.setText("HOME:\nCouch\nTable");
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
			Generic_UI frame = new Generic_UI(PRODUCT_TYPE.ALL, search);
	        
			frame.setVisible(true); 
		}
	});
	errorMessage.setForeground(Color.RED);
	errorMessage.setFont(new Font("Dialog", Font.BOLD, 32));
	
	errorMessage.setBounds(68, 359, 527, 60);
	getContentPane().add(errorMessage);
	errorMessage.setText("");
	
	}
}*/
