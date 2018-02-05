package com.yuzw.bridge.sample01;

public class Black implements Color
{
	@Override
	public void bepaint(String penType,String name)
	{
		System.out.println(penType + "黑色"+ name + ".");
	}
}