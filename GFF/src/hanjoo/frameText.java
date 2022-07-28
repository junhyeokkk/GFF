package hanjoo;

import java.awt.*;
import javax.swing.*;

public class frameText {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JPanel panel1 = new JPanel();
                JPanel panel2 = new JPanel();
                Box box = Box.createVerticalBox();
                for (int i = 0; i < 100; i++) {
                    box.add(new JLabel("Hello, StackOverflow!"));
                }
                Box box2 = Box.createVerticalBox();
                for (int i = 0; i < 100; i++) {
                    box2.add(new JLabel("Hello, StackOverflow!"));
                }
                panel1.add(box);
                panel2.add(box2);
                panel1.setBackground(Color.WHITE);
                panel2.setBackground(Color.WHITE);

                JTabbedPane tab = new JTabbedPane();
                JScrollPane scroll1 = new JScrollPane(panel1);
                JScrollPane scroll2 = new JScrollPane(panel2);
                scroll1.setPreferredSize(new Dimension(300, 300));
                scroll2.setPreferredSize(new Dimension(300, 300));
                tab.add(scroll1, "Panel 1");
                tab.add(scroll2, "Panel 2");

                JOptionPane.showMessageDialog(
                        null, tab, "Test Tabbed", JOptionPane.PLAIN_MESSAGE); 
            }
        });
    }
}
	
