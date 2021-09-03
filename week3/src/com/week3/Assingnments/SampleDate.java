package com.week3.Assingnments;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SampleDate {
	public static void main(String args[]){
	Date mydate=new Date();
	System.out.println(mydate);
	SimpleDateFormat sf=new SimpleDateFormat("MM/dd/yy hh:mm aa");
	String str=sf.format(mydate);
	System.out.println(str);
	SimpleDateFormat sf1=new SimpleDateFormat("hh:mm:ss aa");
	String str1=sf1.format(mydate);
	System.out.println(str1);
	SimpleDateFormat sf2=new SimpleDateFormat("MMM dd,yyy hh:mm:ss aa");
	String str2=sf2.format(mydate);
	System.out.println(str2);
	SimpleDateFormat sf3=new SimpleDateFormat("hh:mm aa");
	String str3=sf3.format(mydate);
	System.out.println(str3);
	SimpleDateFormat sf4=new SimpleDateFormat("hh:mm:ss aa z");
	String str4=sf4.format(mydate);
	System.out.println(str4);
	SimpleDateFormat sf5=new SimpleDateFormat("MMM dd,yyy hh:mm: aa");
	String str5=sf5.format(mydate);
	System.out.println(str5);
	SimpleDateFormat sf6=new SimpleDateFormat("MMMM dd,yyy hh:mm:ss aa z");
	String str6=sf6.format(mydate);
	System.out.println(str6);
	
	
	
	}
}
