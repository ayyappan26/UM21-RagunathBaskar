package com.week3.Assingnments;

public class StringExcersise2 {
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("This is StringBuffer");
		sb.append("This is a sample program");
		System.out.println(sb);
		sb.insert(21,"Object");
		System.out.println(sb);
		sb.replace(14,19,"Builder");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
