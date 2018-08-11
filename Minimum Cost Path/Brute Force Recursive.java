/* Problem-> 
Given an integer matrix of size m*n,you need to find out the value of minimum cost to reach from the cell (0, 0) to (m-1, n-1)

Sample Input:
3 4
3 4 1 2
2 1 8 9
4 7 8 1

Sample Output:
13
*/

import java.util.*;
public class Solution {
    
    static ArrayList<Integer>al=new ArrayList<>();
	public static int minCostPath(int input[][]) {

    search(input,0,0,0);
    int least=Integer.MAX_VALUE;  
    for(int q=0;q<al.size();q++)
    {
      if(al.get(q)<least)
        least=al.get(q);
    }
      return least;start, int end, int sum)
  {
    if(start==arr.length-1 && end==arr[0]
	}
  
  static void search(int[][]arr,int .length-1)
    {
      al.add(sum+arr[start][end]);
      return;
    }
    
    if(end+1<arr[0].length)
      search(arr,start,end+1,sum+arr[start][end]);
    
    if(start+1<arr.length)
      search(arr,start+1,end,sum+arr[start][end]);
    
    if(start+1<arr.length && end+1<arr[0].length)
      search(arr,start+1,end+1,sum+arr[start][end]);
  }
}
