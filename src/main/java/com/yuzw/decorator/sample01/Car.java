package com.yuzw.decorator.sample01;

public final class Car implements Transform
{
	public Car()
	{
		System.out.println("变身卡车");
	}
	@Override
	public void move()
	{
		System.out.println("我会移动");
	}
}