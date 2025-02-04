package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RetrieveFromFile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("file.txt");
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		try (FileWriter writer = new FileWriter(f)) {
			writer.write("2021-05-07 00:01:30.034 Block 74.152.237.66\r\n"
					+ "2021-05-07 00:05:05.984 Block 79.118.67.43\r\n"
					+ "2021-05-07 00:05:52.435 Block 183.35.232.214\r\n"
					+ "2021-05-07 00:13:08.376 Release 74.152.237.66\r\n"
					+ "2021-05-07 00:15:23.802 Block 157.152.167.232\r\n"
					+ "\r\n"
					+ "");
		}
		
			String ip;
		try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
			int count=0;
			while((ip = reader.readLine())!=null) {
				count += (ip.contains("Block"))?1:0;
			}
			
			System.out.println("number of Blocked Ipaddress :"+count);
		}
	}
	

}
