package com.zc.graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class T01DrawCircle extends JFrame
{
    private final static int WIDTH = 80;

    private final static int HEIGHT = 80;

    public T01DrawCircle()
    {
        super();
        init();
    }

    private void init()
    {
        this.setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new DrawPanel());
        this.setTitle("绘图");
    }

    public static void main(String[] args)
    {
        new T01DrawCircle().setVisible(true);
    }

    class DrawPanel extends JPanel
    {
        //重写paint方法
        @Override
        public void paint(Graphics g)
        {
            super.paint(g);
            g.drawOval(10, 10, T01DrawCircle.WIDTH, T01DrawCircle.HEIGHT);
            g.drawOval(80, 10, T01DrawCircle.WIDTH, T01DrawCircle.HEIGHT);
            g.drawOval(150, 10, T01DrawCircle.WIDTH, T01DrawCircle.HEIGHT);
            g.drawOval(50, 70, T01DrawCircle.WIDTH, T01DrawCircle.HEIGHT);
        }
    }
}
