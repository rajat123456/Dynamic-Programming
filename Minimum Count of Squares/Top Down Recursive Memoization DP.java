/* Problem Statement-> 
Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. 
Output will be 1, as 1 is the minimum count of numbers required.
*/

//Using Top Down Memoization DP
//Time Comp-> O(n)

public class Solution {
	
	public static int minCount(int n) {
	
      int storage[]=new int[n+1];
      
      return Count(n,storage);
 }
  
  static int Count(int n, int[]arr)
  {
    if(arr[n]!=0)
      return arr[n];
    
    if(n==0)
      return 0;
      
      int high=Integer.MAX_VALUE;
      
      for(int i=1;i<=Math.sqrt(n);i++)
      {
        int count=1;
        int k=(int)(n-Math.pow(i,2));
        
        count+=Count(k,arr);
       
        if(count<high)
          high=count;
      }
      arr[n]=high;
      return arr[n];
	}
}
