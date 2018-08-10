//* Problem Statement-> 
Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. 
Output will be 1, as 1 is the minimum count of numbers required.
*/

//Using Botto Up DP
//Time Comp-> O(N*sqrt(N))

import java.util.*;
public class Solution {
	
	public static int minCount(int n) {
	
      int arr[]=new int[n+1];
      Arrays.fill(arr,Integer.MAX_VALUE);
      arr[0]=0;
      arr[1]=1;
      for(int i=2;i<=n;i++)
    {
      for(int q=1;q<=Math.sqrt(i);q++)
      {
        int sec=arr[i-(int)(Math.pow(q,2))];
        if(sec<arr[i])
          arr[i]=sec+1;
      }
    }
      return arr[n];
  }
}
