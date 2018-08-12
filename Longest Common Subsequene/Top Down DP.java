//Time Comp-> O(m*n)-> This much Unique Calls
//Space Comp-> O(m*n)-> "m"=length of 1st string, "n"=length of 2nd string

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String first=sc.nextLine();
		String second=sc.nextLine();
		int[][]storage=new int[first.length()][second.length()];
		
		for(int[]x:storage)
		Arrays.fill(x,-1);
		
		System.out.println(LCS(first,second,storage,0,0));
	}
	
	
	static int LCS(String first, String second,int[][]storage,int start,int end)
	{
	    if(first.length()==0 || second.length()==0)
	    return 0;
	    
	    if(storage[start][end]!=-1)
	    return storage[start][end];
	    
	    if(first.charAt(0)==second.charAt(0))
	    {
	     storage[start][end]=1+LCS(first.substring(1),second.substring(1),storage,start+1,end+1);
	    }
	    
	    else
	    {
	     int one=LCS(first.substring(1),second,storage,start+1,end);
	     int sec=LCS(first,second.substring(1),storage,start,end+1);
	
	        storage[start][end]=Math.max(one,sec);
	    }
	    return storage[start][end];
	}
}
