package com.zc.event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class T02MouseEvent{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setSize(100,100);
		Container c=jf.getContentPane();
		JButton btn1=new JButton("按钮");
		btn1.setBounds(0,0, 80,30);
		c.add(btn1);
		jf.setVisible(true);
		btn1.addMouseListener(new MouseListener() {
			
			//释放
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				int i=e.getButton();
				if(i==MouseEvent.BUTTON1){
					System.out.println("释放左键");
				}else if(i==MouseEvent.BUTTON2){
					System.out.println("释放中键");
				}else if(i==MouseEvent.BUTTON3){
					System.out.println("释放右键");
				}
			}
			
			//按下
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int i=e.getButton();
				if(i==MouseEvent.BUTTON1){
					System.out.println("按下左键");
				}else if(i==MouseEvent.BUTTON2){
					System.out.println("按下中键");
				}else if(i==MouseEvent.BUTTON3){
					System.out.println("按下右键");
				}
			}
			
			//光标移出组件
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("光标移出组件");
			}
			
			//光标进入组件
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("光标进入组件");
			}
			
			//单击.从按下到释放结束算一次单击.且释放时鼠标不能移出组件
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int i=e.getButton();
				if(i==MouseEvent.BUTTON1){
					System.out.println("单击左键");
				}else if(i==MouseEvent.BUTTON2){
					System.out.println("单击中键");
				}else if(i==MouseEvent.BUTTON3){
					System.out.println("单击右键");
				}
			}
		});
	}
}
