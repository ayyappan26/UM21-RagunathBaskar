package com.assingment1;

public class LuckyNumber {
	public static void main(String args[]){
		int i=27,sum=0;
		if(i%9==0){
			while(i<10){
				i=i%10;
				sum=sum+i;
				i=i/10;
			}
		}
		int a=i%9;
		System.out.println(a);
	}

}
