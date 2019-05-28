package com.reports.testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class practice
{

	public static void main(String[] args) throws IOException
	{
		String csv_path = "/home/sandhya/Desktop/report.csv";

		CSVReader reader = new CSVReader(new FileReader(csv_path));
		
		List<String[]>  readAllData= reader.readAll();
		
		String[] value;
		
		//String value1 = readAllData.get(2)[4];
		
		
		for(int i=0; i<readAllData.size(); i++)
		{
			if(i==2)
			{
				
				//if(readAllData.toString() != null)
				
					value = readAllData.get(i);
				
					System.out.println(Arrays.toString());
				
			
			}
		}
		
	}

}
