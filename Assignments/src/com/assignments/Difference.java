package com.assignments;
class Sample{
	public void CalculateDifference(int n){
		int i,sum=0,j,sum1=0;
		for(i=1;i<=n;i++){
			i=i*i;
			sum=sum+i;
		}
		for(j=1;j<=n;j++){
			sum1=sum1+j;
		}
		int sum2;
		sum2=sum1*sum1;
		int diff;
		diff=sum-sum2;
		System.out.println(diff);
		
	}
}

public class Difference {
	public static void main(String[] args){
		Sample red=new Sample();
		red.CalculateDifference(10);
	}

}
