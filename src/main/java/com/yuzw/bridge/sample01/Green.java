package com.yuzw.bridge.sample01;

public class Green implements Color
{
	@Override
	public void bepaint(String penType,String name)
	{
		System.out.println(penType + "绿色："+ name + ".");
	}
}