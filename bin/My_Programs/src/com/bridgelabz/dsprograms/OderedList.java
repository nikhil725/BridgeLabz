package com.bridgelabz.dsprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class OderedList {

	public static void main(String[] args) throws IOException {
		
		Utility utility=new Utility();
		File file = new File("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/oderedlist.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String s;
		String arr[]=null;
		while((s=bufferedReader.readLine())!=null)
		{
			arr  = s.split(" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			list.add(Integer.parseInt(arr[i]));
		}
		System.out.println(list);
		list.sort(null);
		System.out.println(list);
		utility.orderedList(list,file);
		bufferedReader.close();
	}
}
