package com.ultramain2;
import com.ultamain1.Laptop;

public class Test {
	public static void main(String[] args){
		Laptop myLaptop=new Laptop();
		myLaptop.setmake("home");
		myLaptop.setmake(2010);
		myLaptop.setcompanyname("dell");
		
		myLaptop.displayLaptopdetails(myLaptop);
		
	}

}
