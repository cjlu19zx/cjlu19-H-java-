package 综合实验1;

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
 * 通过Windows Builder构建了最基本的几个要求的东西：
 * 用标签输出标题，36个不可更改的TextField设置为随机数。
 * 在随机数的过程中先用数组设置随机数，再挨个赋值
 * (因为用Windows Builder代码重复率比较高，
 * 其实可以把JTextField这部分写成数组形式更容易表达，
 * 而且后期维护率也更加容易.这一点在以后的过程中需要改进)
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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	
	// 用来存放数组
	private int[][] a = new int[10][10];
	
	// 将数组转化为String类型，以便显示在textfield上
	private String[] aa = new String[50];
	
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
		int x = 0;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				a[i][j] = (int)(Math.random() * 100);
				aa[++x] = String.valueOf(a[i][j]);
			}
		}
		
		// 始终显示在屏幕上
		setAlwaysOnTop(true);
		// 设置可以关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 坐标位置
		setBounds(100, 100, 664, 435);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// 随机放置设置
		contentPane.setLayout(null);
		
		// 用中文字符码表示标题
		JLabel lblNewLabel = new JLabel("                   \u4E00\u4E2A6*6\u7684\u968F\u673A\u77E9\u9635\u5982\u4E0B");
		lblNewLabel.setBounds(45, 5, 514, 21);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
	
		// 文本框：初始设置状态为按行计算，后面在选择列时会自动更换
		JLabel lblNewLabel_1 = new JLabel("按行计算");
		lblNewLabel_1.setBounds(94, 303, 72, 18);
		contentPane.add(lblNewLabel_1);
		
		// 组合框，提供两种选择：“按行” 或者 “按列”
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u6309\u884C", "\u6309\u5217"}));
		comboBox.setBounds(25, 300, 55, 24);
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
		textField.setBounds(162, 300, 55, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// label标签，上面有三个大字：最大值
		JLabel lblNewLabel_2 = new JLabel("\u6700\u5927\u503C");
		lblNewLabel_2.setBounds(231, 303, 55, 18);
		contentPane.add(lblNewLabel_2);
		
		// 最大值的textfield输出区域
		maxNumber = new JTextField();
		// 设置为不能更改
		maxNumber.setEditable(false);
		maxNumber.setBackground(SystemColor.control);
		maxNumber.setBounds(285, 300, 55, 24);
		// 显示可见
		contentPane.add(maxNumber);
		maxNumber.setColumns(10);
		
		// label标签，标签内容为：最小值
		JLabel lblNewLabel_3 = new JLabel("\u6700\u5C0F\u503C");
		lblNewLabel_3.setBounds(354, 303, 72, 18);
		contentPane.add(lblNewLabel_3);
		
		// 最小值的textfield输出区域
		minNumber = new JTextField();
		minNumber.setEditable(false);
		minNumber.setBackground(SystemColor.control);
		minNumber.setBounds(408, 300, 55, 24);
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
				if(comboBox.getSelectedItem().equals("按行")) {
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
		btnNewButton.setBounds(269, 337, 113, 38);
		contentPane.add(btnNewButton);
		
		
		/*
		 * 从这部分开始，就是36个框框中显示的随机数了。
		 * 代码重复率极高，其实对于每个对话框可以设置行标列标累加就行
		 * 代码内容重复相同，为篇幅考虑删除大部分内容。具体代码在个人github上面公开
		 */
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(25, 39, 55, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(aa[1]);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(25, 76, 55, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setText(aa[2]);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(25, 120, 55, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setText(aa[3]);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(25, 163, 55, 24);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setText(aa[4]);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(25, 215, 55, 24);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		textField_7.setText(aa[5]);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(25, 252, 55, 24);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		textField_8.setText(aa[6]);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(105, 39, 86, 24);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		textField_9.setText(aa[7]);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setBounds(105, 76, 86, 24);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		textField_10.setText(aa[8]);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(105, 120, 86, 24);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		textField_11.setText(aa[9]);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(105, 163, 86, 24);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		textField_12.setText(aa[10]);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(105, 215, 86, 24);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		textField_13.setText(aa[11]);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setBounds(105, 252, 86, 24);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		textField_14.setText(aa[12]);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(218, 39, 86, 24);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		textField_15.setText(aa[13]);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setBounds(218, 76, 86, 24);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		textField_16.setText(aa[14]);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setBounds(218, 120, 86, 24);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		textField_17.setText(aa[15]);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setBounds(218, 163, 86, 24);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		textField_18.setText(aa[16]);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setBounds(218, 215, 86, 24);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		textField_19.setText(aa[17]);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setBounds(218, 252, 86, 24);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		textField_20.setText(aa[18]);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setBounds(320, 39, 86, 24);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		textField_21.setText(aa[19]);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setBounds(320, 76, 86, 24);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		textField_22.setText(aa[20]);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setBounds(320, 120, 86, 24);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		textField_23.setText(aa[21]);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setBounds(320, 163, 86, 24);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		textField_24.setText(aa[22]);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setBounds(320, 215, 86, 24);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
		textField_25.setText(aa[23]);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setBounds(320, 252, 86, 24);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		textField_26.setText(aa[24]);
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setBounds(420, 39, 86, 24);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		textField_27.setText(aa[25]);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setBounds(420, 76, 86, 24);
		contentPane.add(textField_28);
		textField_28.setColumns(10);
		textField_28.setText(aa[26]);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setBounds(420, 120, 86, 24);
		contentPane.add(textField_29);
		textField_29.setColumns(10);
		textField_29.setText(aa[27]);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setBounds(420, 163, 86, 24);
		contentPane.add(textField_30);
		textField_30.setColumns(10);
		textField_30.setText(aa[28]);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setBounds(420, 215, 86, 24);
		contentPane.add(textField_31);
		textField_31.setColumns(10);
		textField_31.setText(aa[29]);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setBounds(420, 252, 86, 24);
		contentPane.add(textField_32);
		textField_32.setColumns(10);
		textField_32.setText(aa[30]);
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setBounds(520, 39, 86, 24);
		contentPane.add(textField_33);
		textField_33.setColumns(10);
		textField_33.setText(aa[31]);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setBounds(520, 76, 86, 24);
		contentPane.add(textField_34);
		textField_34.setColumns(10);
		textField_34.setText(aa[32]);
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setBounds(520, 120, 86, 24);
		contentPane.add(textField_35);
		textField_35.setColumns(10);
		textField_35.setText(aa[33]);
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setBounds(520, 163, 86, 24);
		contentPane.add(textField_36);
		textField_36.setColumns(10);
		textField_36.setText(aa[34]);
		
		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setBounds(520, 215, 86, 24);
		contentPane.add(textField_37);
		textField_37.setColumns(10);
		textField_37.setText(aa[35]);
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setBounds(520, 252, 86, 24);
		contentPane.add(textField_38);
		textField_38.setColumns(10);
		textField_38.setText(aa[36]);
		
		// 累加和的label标签
		JLabel lblNewLabel_4 = new JLabel("\u7D2F\u8BA1\u503C");
		lblNewLabel_4.setBounds(472, 303, 72, 18);
		contentPane.add(lblNewLabel_4);
		
		// 输出累加和的位置
		caclsum = new JTextField();	
		JLabel AuthorNumber = new JLabel("19H034160133");
		AuthorNumber.setBounds(418, 334, 141, 18);
		contentPane.add(AuthorNumber);
		
		// 本人的班级，姓名，学号
		JLabel AuthorName = new JLabel("19\u8BA1\u7B97\u673AH1 \u5F20\u9704");
		AuthorName.setBounds(416, 357, 143, 18);
		contentPane.add(AuthorName);

		caclsum.setEditable(false);
		caclsum.setBounds(520, 300, 86, 24);
		contentPane.add(caclsum);
		caclsum.setColumns(10);
	}
}
