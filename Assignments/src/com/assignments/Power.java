package com.assignments;
import java.util.*;
class Method{
	public void CheckNumber(){
		Scanner tip=new Scanner(System.in);
		int n=tip.nextInt();
		int b=n;
		while(b%2==0)
		 {
		 b=b/2;
		 }
		 if(b==1)
		 {
		 System.out.println(n+" is a power of 2");
		 }
		 else
		 {
		 System.out.println(n+" is not a power of 2");
		 }
	}
}

public class Power {
	public static void main(String[] args){
		
		Method max=new Method();
		max.CheckNumber();
		
	}

}
