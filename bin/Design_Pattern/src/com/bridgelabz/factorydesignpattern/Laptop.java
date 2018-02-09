package com.bridgelabz.factorydesignpattern;

public class Laptop extends Computer{

	private String ram;
	private String hardDisk;
	private String processor;
	private String cpu;
	
	public Laptop(String ram, String harddisk, String cpu, String processor) {
		this.cpu = cpu;
	}
	
	
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hardDisk;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
	
	@Override
	public String getPROCESSOR() {
		return this.processor;
	}

}
