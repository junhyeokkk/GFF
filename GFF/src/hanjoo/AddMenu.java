
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class AddMenu extends JFrame{
	private JTextField textField;
	private JTextField MenuNameTxt;
	private JTextField MenuPriceTxt;

	
	public AddMenu() {
		JPanel pnl = new JPanel();
		pnl.setBackground(new Color(198, 239, 206));
		
		getContentPane().add(pnl);
		pnl.setLayout(null);
		
		JLabel AddMenuLbl = new JLabel("메뉴추가");
		AddMenuLbl.setFont(new Font("휴먼모음T", Font.BOLD, 45));
		AddMenuLbl.setHorizontalAlignment(SwingConstants.CENTER);
		AddMenuLbl.setBounds(12, 10, 320, 65);
		pnl.add(AddMenuLbl);
		
		JLabel MenuName = new JLabel("메뉴이름");
		MenuName.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		MenuName.setBounds(12, 110, 97, 40);
		pnl.add(MenuName);
		
		MenuNameTxt = new JTextField();
		MenuNameTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MenuNameTxt.setBounds(110, 111, 180, 40);
		pnl.add(MenuNameTxt);
		MenuNameTxt.setColumns(10);
		
		JButton AddComplete = new JButton("추가완료");
		AddComplete.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		AddComplete.setBounds(40, 326, 97, 40);
		pnl.add(AddComplete);
		
		JButton AddBackWard = new JButton("닫기");
		AddBackWard.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		AddBackWard.setBounds(205, 326, 97, 40);
		pnl.add(AddBackWard);
		
		JLabel MenuPrice = new JLabel("메뉴가격");
		MenuPrice.setFont(new Font("휴먼모음T", Font.BOLD, 15));
		MenuPrice.setBounds(12, 160, 97, 40);
		pnl.add(MenuPrice);
		
		MenuPriceTxt = new JTextField();
		MenuPriceTxt.setFont(new Font("휴먼모음T", Font.PLAIN, 15));
		MenuPriceTxt.setColumns(10);
		MenuPriceTxt.setBounds(110, 161, 180, 40);
		pnl.add(MenuPriceTxt);
		
		setSize(360, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new AddMenu().setVisible(true);
	}
}