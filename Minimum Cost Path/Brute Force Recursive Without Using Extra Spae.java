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

//Solution-> Without Using Extra Space

import java.util.*;
public class Solution {
    
    static ArrayList<Integer>al=new ArrayList<>();
	public static int minCostPath(int input[][]) {

    return search(input,0,0);
}
  
    static int search(int[][]arr, int start, int end)
    {
        if(start==arr.length-1 && end==arr[0].length-1)
       {
        return arr[start][end];
       }
        
       if(start>=arr.length || end>=arr[0].length)
           return Integer.MAX_VALUE;
        
       int option1=search(arr,start,end+1);
       int option2=search(arr,start+1,end);
       int option3=search(arr,start+1,end+1);
      
       return arr[start][end]+Math.min(option1,Math.min(option2,option3));
    }
}
