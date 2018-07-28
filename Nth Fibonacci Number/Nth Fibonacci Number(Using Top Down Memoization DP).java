// Nth Fibonacci Number(Using Top Down Memoization DP)

import java.util.*;
class main
{
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
     		int n=sc.nextInt();
        int[]storage=new int[n+1];
        System.out.println(Memoizedfib(n,storage));
}

static int Memoizedfib(int n, int[]storage)
    {
        if(storage[n]!=0)
            return storage[n];
        
        if(n==0 || n==1)
        {
            storage[n]=n;
            return storage[n];
        }
        
        storage[n]=Memoizedfib(n-1,storage)+Memoizedfib(n-2,storage);
        return storage[n];
    }
}
