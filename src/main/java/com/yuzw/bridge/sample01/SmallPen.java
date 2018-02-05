package com.yuzw.bridge.sample01;

public class SmallPen extends Pen
{
	@Override
	public void draw(String name)
	{
		String penType="小型笔";
		this.color.bepaint(penType,name);			
	}	
}