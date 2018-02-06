package com.yuzw.adapter.sample01;

public class DogAdapter extends Dog implements Robot
{
	@Override
	public void cry()
	{
		System.out.print("哭");
		super.wang();
	}
	@Override
	public void move()
	{
		System.out.print("移动");
		super.run();
	}
}