import java.awt.EventQueue;

public class Clothing_UI extends Product_UI{
	
	public static String name;
	public static double price;
	public static String size;
	
	public Clothing_UI(String name, double price, String size) {
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
	private static final long serialVersionUID = 1048257216723871342L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clothing_UI frame = new Clothing_UI(name, price, size);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
