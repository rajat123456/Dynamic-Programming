// Nth Fibonacci Number(Using Top Down DP)

import java.util.*;
class RR
{
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
        int[]storage=new int[n+1];
}

static int Itrfib(int n,int storage[])
	{
      storage[0]=0;
      storage[1]=1;
	  
      for(int i=2;i<=n;i++)
      {
         storage[i]=storage[i-1]+storage[i-2];
      }
        return storage[n];
	}
}
