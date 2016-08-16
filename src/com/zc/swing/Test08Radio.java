package com.zc.swing;

import java.awt.Component;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Test08Radio {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		jf.setSize(300,300);
		JRadioButton rad1=new JRadioButton();
		JRadioButton rad2=new JRadioButton();
		JRadioButton rad3=new JRadioButton();
		ButtonGroup group=new ButtonGroup();

		group.add(rad1);
		group.add(rad2);
		group.add(rad3);
		JPanel panel=new JPanel();
		
		jf.setVisible(true);
	}
}
