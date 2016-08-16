package com.zc.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//流式布局
public class Test05FlowLayout {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		jf.setLayout(new FlowLayout(2,10,10));
		for(int i=0;i<20;i++){
			c.add(new JButton("按钮"+i));
		}
		jf.setSize(500,500);
		jf.setVisible(true);
	}
}
