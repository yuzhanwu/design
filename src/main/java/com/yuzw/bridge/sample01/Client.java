package com.yuzw.bridge.sample01;

/**
 * 把两个不容易勾搭上的类，接到一起
 */
public class Client
{
	public static void main(String a[])
	{
		Color color;
		Pen pen;
		
		color=(Color)XMLUtilPen.getBean("color");
		pen=(Pen)XMLUtilPen.getBean("pen");
		
		pen.setColor(color);
		pen.draw("毛笔");
	}
}