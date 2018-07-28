// Nth Fibonacci Number(Simple Approach)

import java.util.*;
class main
{
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
        System.out.println(Normfib(n));
}

static int Normfib(int n)
	{
	  if(n==0 || n==1)
	  return n;
	  
	  return (Normfib(n-1)+Normfib(n-2));
	}
}
