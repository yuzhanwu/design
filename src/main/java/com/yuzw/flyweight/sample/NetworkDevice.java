package com.yuzw.flyweight.sample;

public interface NetworkDevice
{
	public String getType();
	public void use(Port port);
}