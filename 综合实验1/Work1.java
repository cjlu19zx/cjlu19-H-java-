import java.awt.BorderLayout;
import java.math.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * @author zx
 * 程序主体思想：
 * 在随机数的过程中先用数组设置随机数，再挨个赋值
 * 将36个对话框设置为JTextField数组进行赋值
 * 
 * 在点击计算上设置监听器，可以实现一下操作：计算最大值，最小值与总和，
 * 并显示在相对应的不可更改的TextField上
 * 
 * 唯一美中不足的就是，在输入列和行的地方，应该也写一个异常
 * 当输入的数 大于6或者小于 1，判断为不合法，应当弹出对话框提醒
 * 在上交的报告过程中，会把大量的重复内容屏蔽，
 * 如果老师希望查看源码，我会在实验报告上写上地址
 * 
 */

public class Work1 extends JFrame {

	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField maxNumber;
	private JTextField minNumber;
	
	/*
	 * 建立了36个textField用来产生随机数文本框，其实用数组就可以。
	 * 由windows builders构成降低了代码可读性。
	 */
	
	private JTextField[][] A = new JTextField[10][10];
	
	// 用来存放数组
	private int[][] a = new int[10][10];
	
	// 计算总和
	private JTextField caclsum;
	
	/**
	 * 
	 * main程序，用匿名类进行程序运行，用异常来维护这个过程
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Work1 frame = new Work1();
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
	public Work1() {
		
		// 产生随机数组
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				a[i][j] = (int)(Math.random() * 100);
			}
		}
		
		// 始终显示在屏幕上
		setAlwaysOnTop(true);
		// 设置可以关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 坐标位置
		setBounds(100, 100, 520, 650);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// 随机放置设置
		contentPane.setLayout(null);
		
		// 用中文字符码表示标题
		JLabel lblNewLabel = new JLabel("                   \u4E00\u4E2A6*6\u7684\u968F\u673A\u77E9\u9635\u5982\u4E0B");
		lblNewLabel.setBounds(5, 5, 500, 21);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
	
		// 文本框：初始设置状态为按行计算，后面在选择列时会自动更换
		JLabel lblNewLabel_1 = new JLabel("按行计算");
		lblNewLabel_1.setBounds(90, 500, 80, 18);
		contentPane.add(lblNewLabel_1);
		
		// 组合框，提供两种选择：“按行” 或者 “按列”
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u6309\u884C", "\u6309\u5217"}));
		comboBox.setBounds(20, 500, 60, 24);
		// 在窗体上添加这个组合框选项
		contentPane.add(comboBox);
		// 动作窗口：选择"按行”时监听器监听，会在lblNewLabel_1上显示 “按行”， 按列同理
		comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent arg0) {
                lblNewLabel_1.setText(arg0.getItem().toString() + "计算");
            }
		});		
		
		// 输入查询的行数和列数区域
		textField = new JTextField();
		textField.setBounds(150, 500, 55, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// label标签，上面有三个大字：最大值
		JLabel lblNewLabel_2 = new JLabel("\u6700\u5927\u503C");
		lblNewLabel_2.setBounds(210, 500, 40, 24);
		contentPane.add(lblNewLabel_2);
		
		// 最大值的textfield输出区域
		maxNumber = new JTextField();
		// 设置为不能更改
		maxNumber.setEditable(false);
		maxNumber.setBackground(SystemColor.control);
		maxNumber.setBounds(255, 500, 40, 24);
		// 显示可见
		contentPane.add(maxNumber);
		maxNumber.setColumns(10);
		
		// label标签，标签内容为：最小值
		JLabel lblNewLabel_3 = new JLabel("\u6700\u5C0F\u503C");
		lblNewLabel_3.setBounds(300, 500, 60, 18);
		contentPane.add(lblNewLabel_3);
		
		// 最小值的textfield输出区域
		minNumber = new JTextField();
		minNumber.setEditable(false);
		minNumber.setBackground(SystemColor.control);
		minNumber.setBounds(350, 500, 40, 24);
		contentPane.add(minNumber);
		minNumber.setColumns(10);
		
		// “计算”按钮
		JButton btnNewButton = new JButton("\u8BA1\u7B97");
		// 监听事件
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = textField.getText();
				int num = Integer.parseInt(str);
				int mx = 0, mn = 1000;
				int sum = 0;
				
				// 如果按行，计算选择行的最大最小值。美中不足的地方时没有写异常，超出范围了无法准确判断边界
				if(comboBox.getSelectedItem().equals("按列")) {
					for(int i = 1; i <= 6; i++) {
						mx = Math.max(mx, a[i][num]);
						mn = Math.min(mn, a[i][num]);
						sum += a[i][num];
					}
				} else {
					for(int i = 1; i <= 6; i++) {
						mx = Math.max(mx, a[num][i]);
						mn = Math.min(mn, a[num][i]);
						sum += a[num][i];
					}
				}
				
				// 在相应位置输出最大，最小，累加和的大小
				maxNumber.setText(String.valueOf(mx));
				minNumber.setText(String.valueOf(mn));
				caclsum.setText(String.valueOf(sum));
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(200, 550, 113, 38);
		contentPane.add(btnNewButton);
		
		/*
		 * 36个对话框的赋值，以及将随机数显示在TextField框上面
		 */
		
		int x = 20, y = 60;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				A[i][j] = new JTextField();
				A[i][j].setEditable(false);
				A[i][j].setBounds(x, y, 70, 30);
				A[i][j].setColumns(15);
				A[i][j].setText(String.valueOf(a[i][j]));
				x += 80;
				contentPane.add(A[i][j]);
			}
			x = 20;
			y += 80;
		}
		
		// 累加和的label标签
		JLabel lblNewLabel_4 = new JLabel("\u7D2F\u8BA1\u503C");
		lblNewLabel_4.setBounds(395, 500, 50, 18);
		contentPane.add(lblNewLabel_4);
		
		// 学号
		caclsum = new JTextField();	
		JLabel AuthorNumber = new JLabel("19H034160133");
		AuthorNumber.setBounds(350, 550, 141, 18);
		contentPane.add(AuthorNumber);
		
		// 本人的班级，姓名
		JLabel AuthorName = new JLabel("19\u8BA1\u7B97\u673AH1 \u5F20\u9704");
		AuthorName.setBounds(350, 570, 143, 18);
		contentPane.add(AuthorName);

		// 累加和输出文本框
		caclsum.setEditable(false);
		caclsum.setBounds(440, 500, 50, 24);
		contentPane.add(caclsum);
		caclsum.setColumns(10);
	}
}
