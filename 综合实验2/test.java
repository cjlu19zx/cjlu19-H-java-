package 综合实验2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 515);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("\u6210\u957F\u7684\u6211");
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6211\u7684\u5C0F\u5B66");
		mnNewMenu.add(mntmNewMenuItem);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("宋体", Font.PLAIN, 23));
		textPane.setForeground(new Color(255, 255, 255));
		textPane.setText("\u7ECD\u5174\u5E02\u5143\u57F9\u4E2D\u5B66\u662F\u4EE5\u8FD1\u4EE3\u8457\u540D\u7684\u6C11\u4E3B\u9769\u547D\u5BB6\u3001\u6559\u80B2\u5BB6\u3001\u79D1\u5B66\u5BB6\u8521\u5143\u57F9\u5148\u751F\u540D\u5B57\u547D\u540D\u7684\uFF0C\u521B\u5EFA\u4E8E1991\u5E74\u30022002\u5E74\uFF0C\u5143\u57F9\u4E2D\u5B66\u4F5C\u4E3A\u7ECD\u5174\u5E02\u552F\u4E00\u7684\u4E00\u6240\u5165\u9009\u201C\u5168\u56FD\u540D\u6821600\u5BB6\u201D\u7684\u521D\u7EA7\u4E2D\u5B66\u3002");
		textPane.setBackground(new Color(0, 0, 0));
		textPane.setEditable(false);
		textPane.setBounds(146, 23, 340, 170);
		getContentPane().add(textPane);
		textPane.setVisible(false);

		JLabel lblNewLabel = new JLabel("\u5143\u57F9\u4E2D\u5B66\u7B80\u4ECB");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setBounds(14, 97, 112, 18);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JLabel picture = new JLabel(new ImageIcon("C:\\Users\\zx\\Desktop\\tt.jpg"));
		picture.setBounds(41, 13, 528, 416);
		getContentPane().add(picture);
		picture.setVisible(false);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u6211\u7684\u521D\u4E2D");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setVisible(true);
				lblNewLabel.setVisible(true);
				picture.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u6211\u7684\u9AD8\u4E2D");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u6E29\u99A8\u4E00\u523B");
		menuBar_1.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u513F\u65F6\u73A9\u4F34");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u5927\u5B66\u5BA4\u53CB");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setVisible(false);
				lblNewLabel.setVisible(false);
				picture.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("\u5173\u4E8E\u6211");
		menuBar_1.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u5173\u4E8E\u6211");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				test2 dialog = new test2();
				dialog.main();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Help");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		getContentPane().setLayout(null);

	}
}
