package com.zc.event;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class T01KeyListener extends JFrame{
	public T01KeyListener(){
		this.setVisible(true);
		this.setSize(300,300);
		Container c=getContentPane();
		JTextArea area=new JTextArea();
		this.add(area);
		area.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//返回键盘上的数字
				String keyText=KeyEvent.getKeyText(e.getKeyCode());
				System.out.println(keyText);
				int keyCode=e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_CONTROL:
					System.out.println("ctrl按下");
					break;
				case KeyEvent.VK_ALT:
					System.out.println("alt按下");
					break;
				case KeyEvent.VK_SHIFT:
					System.out.println("shift按下");
					break;
				default:
					break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
