package com.yuzw.adapter.sample01;

import javax.xml.parsers.*;

import org.springframework.util.ResourceUtils;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil
{
	public static Object getBean()
	{
		try
		{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			String dbfile = ResourceUtils.getFile("classpath:config.xml").getPath();
			doc = builder.parse(new File(dbfile));
		
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            Class c=Class.forName("com.yuzw.adapter.sample01."+cName);
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
