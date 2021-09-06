package com.assignments;
class simple{
	public void CalculateSum(int n){
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0){
			sum=sum+i;
		}
		}
		System.out.println(sum);
	}
}

public class NaturalNumbers {
	public static void main(String[] args){
		simple res=new simple();
		res.CalculateSum(10);
	}

}
