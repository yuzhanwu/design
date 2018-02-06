package com.yuzw.bridge.sample01;

public class White implements Color
{
	@Override
	public void bepaint(String penType,String name)
	{
		System.out.println(penType + "白色"+ name + ".");
	}
}