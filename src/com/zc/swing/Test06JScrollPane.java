package com.zc.swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Test06JScrollPane extends JFrame{
	public Test06JScrollPane(){
		//this.setLayout(null);
		this.setSize(300,300);
		Container c=getContentPane();
		JLabel lab1=new JLabel("标题");
		JTextArea ta=new JTextArea(50,60);
		ta.setText("滚动");
		JPanel jp1=new JPanel();
		jp1.add(lab1);
		jp1.add(ta);
		
		JScrollPane js=new JScrollPane(jp1);
		c.add(js);
		
		this.setVisible(true);
	}
}
