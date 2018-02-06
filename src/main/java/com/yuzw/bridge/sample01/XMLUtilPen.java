package com.yuzw.bridge.sample01;

import javax.xml.parsers.*;

import org.springframework.util.ResourceUtils;
import org.w3c.dom.*;
import java.io.*;
public class XMLUtilPen
{
	public static Object getBean(String args)
	{
		try
		{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			String dbfile = ResourceUtils.getFile("classpath:pen.xml").getPath();
			doc = builder.parse(new File(dbfile));
			NodeList nl=null;
			Node classNode=null;
			String cName=null;
			nl = doc.getElementsByTagName("className");
			
			if(args.equals("color"))
			{
	            classNode=nl.item(0).getFirstChild();
	            
			}
			else if(args.equals("pen"))
			{
	            classNode=nl.item(1).getFirstChild();
			}
			
	         cName=classNode.getNodeValue();
	         Class c = Class.forName("com.yuzw.bridge.sample01."+cName);
		  	 Object obj=c.newInstance();
	         return obj;		
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
