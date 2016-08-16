package com.zc.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//绝对布局
public class Test04AbsoluteLayout extends JFrame{
	public Test04AbsoluteLayout(){
		setTitle("absolute");
		setLayout(null);//取消默认布局
		setBounds(0,0,200,150);
		JButton btn1=new JButton("按钮1");
		btn1.setBounds(10, 10, 50,30);
		Container c = this.getContentPane();
		c.add(btn1);
		this.setVisible(true);
	}
	
}
