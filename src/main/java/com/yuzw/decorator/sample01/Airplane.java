package com.yuzw.decorator.sample01;

public class Airplane extends Changer
{
	public Airplane(Transform transform)
	{
		super(transform);
		System.out.println("变为飞机");
	}
	
	public void fly()
	{
		System.out.println("我会飞");
	}
}