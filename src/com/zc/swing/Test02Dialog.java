package com.zc.swing;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Test02Dialog {
	public static void main(String[] args) {
		final JFrame jf=new JFrame();
		jf.setLayout(null);
		jf.setSize(300,400);
		Container c=jf.getContentPane();
		JLabel lab1=new JLabel("标题");
		lab1.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(lab1);
		
		JButton btn1=new JButton("弹出对话框");
		btn1.setBounds(10,10,50,20);
		c.add(btn1);
		jf.setVisible(true);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Dialog(jf, "呵呵");
			}
		});
		
	}
}
