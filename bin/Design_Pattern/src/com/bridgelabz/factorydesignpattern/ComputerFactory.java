package com.bridgelabz.factorydesignpattern;

import com.bridgelabz.factorydesignpattern.Pc;
import com.bridgelabz.factorydesignpattern.Server;

public class ComputerFactory {


		public static Computer getComputer(String type, String ram, String harddisk, String cpu, String processor)
		{
			if("PC".equalsIgnoreCase(type)) return new Pc(ram, harddisk, cpu, processor);
			else if("Server".equalsIgnoreCase(type)) return new Server(ram, harddisk, cpu, processor);
			
			return null;
		}
	}

