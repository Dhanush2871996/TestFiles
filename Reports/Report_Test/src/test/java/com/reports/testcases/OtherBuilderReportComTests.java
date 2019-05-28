package com.reports.testcases;

import java.util.ArrayList;
import java.util.List;

public class OtherBuilderReportComTests 
{
	public static void main(String[] args)
	{
	List<String> list = new ArrayList<String>();
	list.add(new String("a"));
	list.add("B");
	list.add("C");
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	
	
	
	}
}
