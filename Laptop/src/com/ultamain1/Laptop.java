package com.ultamain1;

public class Laptop {
	private String make;
	private int model;
	private String companyname;
	private String processortype;
	private int ramSize;
	private int purchaseyear;
	public Laptop(){
	
	}
	public Laptop(String make){
		this.make=make;
	}
	public void setmake(String make){
		this.make=make;
	}
	public void setmake(int model){
		this.model=model;
	}
	public void setcompanyname(String companyname){
		this.companyname=companyname;
	}
	
	public void displayLaptopdetails(Laptop myLaptop){
		System.out.println("make         :"+this.make);
		System.out.println("model        :"+this.model);
		System.out.println("companyname  :"+this.companyname);
		System.out.println("processortype:"+this.processortype);
		System.out.println("ramSize      :"+this.ramSize);
		System.out.println("purchaseyear :"+this.purchaseyear);
	}
}
