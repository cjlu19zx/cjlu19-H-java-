
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 由Windows Builder构造
 * @author zx
 * 程序功能：
 * 显示一个对话框，输出班级，姓名，学号
 *
 */

public class test2 extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public void main() {
		try {
			test2 dialog = new test2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public test2() {
		setTitle("\u6D88\u606F");
		setBounds(100, 100, 396, 160);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			// 显示班级，学号，姓名
			JLabel lblNewLabel = new JLabel("19\u8BA1\u7B97\u673AH1\u73ED\uFF0C\u5B66\u53F733\uFF0C\u5F20\u9704");
			lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
			lblNewLabel.setBounds(40, 13, 292, 62);
			contentPanel.add(lblNewLabel);
		}
		
		// 显示内容“点击右上角关闭”
		JLabel lblNewLabel_1 = new JLabel("\u70B9\u51FB\u53F3\u4E0A\u89D2\u5173\u95ED");
		lblNewLabel_1.setBounds(242, 78, 122, 18);
		contentPanel.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		// “确定按钮”
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setVisible(true);
			}
		});
		btnNewButton.setBounds(122, 74, 113, 27);
		contentPanel.add(btnNewButton);
	}
}
