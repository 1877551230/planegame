import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * main����
 * @author �����
 *
 */
public class StartMain {
	static FirstFrame e1;
	static PlaySound p;//��������
	
	public static void main(String agrs[]) {	      
	    e1 = new FirstFrame(0);
		//�����رմ��尴ť
		e1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ÿ���
		e1.setVisible(true);
		//���ò�������
		e1.setResizable(false);
		
		if(p == null) {
			//��������
			p = new PlaySound();
				p.open("sounds/background.wav");	
				p.play();
				p.loop();
				p.start();
			
		}
   }
}
