package com.zc.swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Test01Swing {
	public static void main(String[] args) {
		JFrame jf=new JFrame("我的标题");
		//返回container容器.将窗体转换成容器
		Container c = jf.getContentPane();
		JLabel lab1=new JLabel("标签");
		lab1.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(lab1);
		
		c.setBackground(Color.white);
		
		jf.setVisible(true);
		jf.setSize(300,400);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
}
