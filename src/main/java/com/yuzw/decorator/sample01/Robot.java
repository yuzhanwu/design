package com.yuzw.decorator.sample01;

public class Robot extends Changer
{
	public Robot(Transform transform)
	{
		super(transform);
		System.out.println("变形");
	}
	
	public void say()
	{
		System.out.println("我是机器人");
	}
}