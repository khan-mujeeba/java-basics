package com.yash.javabasics.labassignments;

public class Exercise5 {

	public int calculateSum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum = sum+i;
			}
		}
		return sum;
	}
	
}
