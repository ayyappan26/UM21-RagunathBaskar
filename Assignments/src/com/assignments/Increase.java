package com.assignments;
import java.util.*;
class Method1{
	public void Check(){
		Scanner ib=new Scanner(System.in);
		int n=ib.nextInt();
		boolean flag=false;
		int a=n;
		int d=a%10;
		a=a/10;
		while(a>0){
			if(d<=a%10){
				flag=true;
				break;
			}
			d=a%10;
			a=a/10;
		}
		if(flag){
			System.out.println(n+" is not an increasing number");
		}
		else
			System.out.println(n+" is an increasing number");
	}
}

public class Increase {
	public  static void main(String[] args){
		Method1 tin=new Method1();
		tin.Check();
	
	}

}
