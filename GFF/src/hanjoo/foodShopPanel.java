package hanjoo;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class foodShopPanel {
	private JLabel lbl;
	private JLabel shopName;
	private JButton remove;
	private JButton detail;
	
	public foodShopPanel(JLabel lbl, JLabel shopName, JButton remove, JButton detail) {
		super();
		this.lbl = lbl;
		this.shopName = shopName;
		this.remove = remove;
		this.detail = detail;
	}


	public JLabel getLbl() {
		return lbl;
	}

	public void setLbl(JLabel lbl) {
		this.lbl = lbl;
	}

	public JLabel getShopName() {
		return shopName;
	}

	public void setShopName(JLabel shopName) {
		this.shopName = shopName;
	}
	
	public JButton getRemove() {
		return remove;
	}

	public void setRemove(JButton remove) {
		this.remove = remove;
	}

	public JButton getDetail() {
		return detail;
	}

	public void setDetail(JButton detail) {
		this.detail = detail;
	}

	

	
	
	
	
	
	

}
