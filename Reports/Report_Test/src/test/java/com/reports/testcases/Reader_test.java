/**
 * Reading the date range from the CSV file 
 * 
 * */

package com.reports.testcases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class Reader_test
{

	public static void main(String[] args) throws IOException
	{
		String csv_path = "/home/sandhya/Desktop/report.csv";

		CSVReader reader = new CSVReader(new FileReader(csv_path));
		
		List<String[]>  readAllData= reader.readAll();
		
		String value="";
		
		//String value1 = readAllData.get(2)[4];
		System.out.println(readAllData.get(2)[0]);
		for(int i=0; i<readAllData.size(); i++)
		{
			if(i==2)
			{
				int j = 0;
					while (readAllData.get(2)[j].isEmpty())
					{
						if(!readAllData.get(2)[j+1].isEmpty()) {
							value = readAllData.get(2)[j+1];
						}
						j++;
					}
			}
		}
		System.out.println(value);
		
		String from=value.substring(0, 10);
		String to=value.substring(14, 24);
	//	System.out.println("from date : "+from + "to date : "+to);
	}

}
