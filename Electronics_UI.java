import java.awt.EventQueue;

public class Electronics_UI extends Product_UI{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5865436019373463725L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electronics_UI frame = new Electronics_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
