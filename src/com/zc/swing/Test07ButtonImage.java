package com.zc.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//带背景图片的按钮
public class Test07ButtonImage extends JFrame{
	public Test07ButtonImage(){
		this.setSize(300,300);
		//
		URL url=this.getClass().getResource("I.png");
		//
		Icon icon=new ImageIcon(url);
		
		setLayout(new GridLayout(3,2,5,5));
		
		Container c=getContentPane();
		for(int i=0;i<5;i++){
			//
			JButton btn=new JButton("按钮"+i,icon);
			btn.setHideActionText(true);
			btn.setToolTipText("图片按钮"+i);
			btn.setBorderPainted(false);//无边框
			c.add(btn);
		}
		this.setVisible(true);
	}
}
