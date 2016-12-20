import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * ����������
 * @author �����
 *
 */
@SuppressWarnings("serial")
public class FirstFrame extends JFrame {
	
	private JLabel back;//����
//	private JLabel label01, label02, label03, label04, label05, label06;
	private JButton button01, button02, button03;
	private FirstFrame f;
	
	public FirstFrame(int i) {
		super("ˮ��������");
		//����javaͼ��
		setIconImage(Toolkit.getDefaultToolkit ().getImage(getClass().getResource("/images/icon.png")));
		
		setSize(650, 500);//���ô����С
		
		setLayout(null);//������ֹ�����
				
		showBackground();//���ñ���
		if(i == 1) {
			LevelPanel level = new LevelPanel(this);
			level.setBounds(0,0,650,500);
			add(level);
			
			//�����رմ��尴ť
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//���ÿ���
			setVisible(true);
			//���ò�������
			setResizable(false);
		} else {
			showButton();//��ʾ����
			
			adapter();//����
		}
		
		f = this;
	}
	
	//����
	private void adapter() {
		// TODO Auto-generated method stub
		
		button01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toLevel();
			}
		});
		
		button02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Point p = StartMain.e1.getLocation();
				StartMain.e1.dispose();
				GameFrame gameFrame;
				gameFrame = new GameFrame(8,-1);
				//�����رմ��尴ť
				gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gameFrame.setLayout(null);//������ֹ�����
				
				//���ò�������
				gameFrame.setResizable(false);
				gameFrame.setLocation(p);
			}
		});
		
		button03.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Dialog(f,0,0,null);
			}
		});
		
	}
	//��ת������ҳ��
	public void toLevel() {
		Point p = this.getLocation();
		this.dispose();
		FirstFrame f = new FirstFrame(1);
		f.setLocation(p);
		
		
	}
	//��ʾ����	
	private void showButton() {
		// TODO Auto-generated method stub
		
		//���ð�ť
		button01 = new JButton("����ģʽ");
		button01.setFont(new Font("acefont-family", Font.BOLD, 25));
		button01.setBackground(Color.RED);
		button01.setBounds(260, 200, 150, 40);

		button02 = new JButton("��ʱģʽ");
		button02.setFont(new Font("acefont-family", Font.BOLD, 25));
		button02.setBackground(Color.GREEN);
		button02.setBounds(260, 250, 150, 40);
		 
		button03 = new JButton("����");
     	button03.setFont(new Font("acefont-family", Font.BOLD, 25));
     	button03.setBackground(Color.BLUE);
	    button03.setBounds(260, 300, 150, 40);
		
		 add(button01);
		 add(button02);
		 add(button03);
	}
	
	//���ñ���
	private void showBackground() {
		// TODO Auto-generated method stub
		//����ͼƬ
	 	ImageIcon background = new ImageIcon(getClass().getResource("/images/background.jpg"));
	  	//���ñ�����ǩ
        back = new JLabel(background);
        //���ñ���ͼƬλ�ô�С
        back.setBounds(0, 0, getWidth(), getHeight());
        //���͸��
        JPanel j = (JPanel)getContentPane();
        j.setOpaque(false);
        //���ñ���
        getLayeredPane().add(back, new Integer(Integer.MIN_VALUE));
	}

}
