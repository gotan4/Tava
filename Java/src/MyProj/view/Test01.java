package MyProj.view;

import java.awt.*;
import java.awt.Image.*;
import java.awt.event.*;
import javax.swing.*;

public class Test01 {
	JFrame frame;
	JButton btn1, btn2;
	JPanel p1, p2, pan, btnP, pan1, pan2;
	Image re1, re2;
	public Test01() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnP = new JPanel();
		btnP.setPreferredSize(new Dimension(300, 50));
		
		Image img1 = new ImageIcon("src/MyProj/view/img/img_avatar1.png").getImage();
		Image img2 = new ImageIcon("src/MyProj/view/img/img_avatar2.png").getImage();
		re1 = new ImageIcon(img1.getScaledInstance(250, 250, Image.SCALE_SMOOTH)).getImage();
		re2 = new ImageIcon(img2.getScaledInstance(250, 250, Image.SCALE_SMOOTH)).getImage();
		
		pan1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(re1, 20, 20, null);
			}
		};
		pan2 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(re2, 20, 20, null);
			}
		};
		
		
		pan = new JPanel();
		pan.setPreferredSize(new Dimension(300, 300));
		pan1.setVisible(false);
		pan2.setVisible(false);
		
		btn1 = new JButton("img1");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pan.setVisible(false);
				pan1.setVisible(true);
				pan2.setVisible(false);
				frame.remove(pan);
				frame.remove(pan1);
				frame.remove(pan2);
				frame.add(pan1, BorderLayout.CENTER);
			}
		});
		btn2 = new JButton("img2");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pan.setVisible(false);
				pan1.setVisible(false);
				pan2.setVisible(true);
				frame.remove(pan);
				frame.remove(pan1);
				frame.remove(pan2);
				frame.add(pan2, BorderLayout.CENTER);
			}
		});
		btnP.add(btn1);
		btnP.add(btn2);
		
		frame.add(pan2, BorderLayout.CENTER);
		frame.add(pan1, BorderLayout.CENTER);
		frame.add(pan, BorderLayout.CENTER);
		frame.add(btnP, BorderLayout.SOUTH);
		frame.setSize(300, 350);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
