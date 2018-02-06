package com.yuzw.facade.sample;

/**
 * 根据“单一职责原则”，在软件中将一个系统划分为若干个子系统有利于降低整个系统的复杂性
 * 外观模式也是“迪米特法则”的体现
 */
public class Client
{
	public static void main(String args[])
	{
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------------");	
		gsf.off();
	}
}