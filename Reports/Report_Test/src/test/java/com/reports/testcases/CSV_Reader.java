package com.reports.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class CSV_Reader 
{

	public static void main(String[] args) throws IOException
	{
		String csv_file = "/home/sandhya/Desktop/report.csv";
		CSVReader reader = new CSVReader(new FileReader(csv_file), ',', '"', 0);
		
		
		List<String[]> allRows= reader.readAll();
		
		int a=0;
		for(String[] row: allRows)
		{
			System.out.println(Arrays.toString(row));
				
			System.out.println("a = "+ ++a);
		}

	}

}
