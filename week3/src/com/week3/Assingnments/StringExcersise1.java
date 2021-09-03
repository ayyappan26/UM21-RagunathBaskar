package com.week3.Assingnments;

public class StringExcersise1 {
	public static void main(String[] args){
		String str="Welcome to Java World";
		System.out.println(str);
		char ch=str.charAt(5);
		System.out.println(ch);
		String str1="Welcome";
		System.out.println(str.compareToIgnoreCase(str1));
		String str2="-Let Us Learn";
		System.out.println(str.concat(str2));
		System.out.println(str.indexOf('a'));
		String replaceString=str.replace('a','e');
		System.out.println(replaceString);
		System.out.println(str.substring(4,10));
		System.out.println(str.toLowerCase());
	}

}
