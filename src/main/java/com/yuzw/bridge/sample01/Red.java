package com.yuzw.bridge.sample01;

public class Red implements Color
{
	@Override
	public void bepaint(String penType,String name)
	{
		System.out.println(penType + "红色"+ name + ".");
	}
}