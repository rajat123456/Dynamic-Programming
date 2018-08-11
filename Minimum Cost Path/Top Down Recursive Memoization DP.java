import java.util.*;
public class Solution {
    
    static ArrayList<Integer>al=new ArrayList<>();
	public static int minCostPath(int input[][]) {

    int[][]storage=new int[input.length][input[0].length];
    for (int i=0;i<storage.length;i++)
    {
      for(int j=0;j<storage[i].length;j++)
      {
        storage[i][j]=-1;   
      }
    }
      return searchM(input,0,0,storage);
}

 static int searchM(int[][]arr, int start, int end,int storage[][])
    {
       if(start>=arr.length || end>=arr[0].length)
           return Integer.MAX_VALUE;
    
        //if stored already then not recomputing, just returning that value 
       if(storage[start][end]!=-1)
         return storage[start][end];
    
        //Base Case 
        if(start==arr.length-1 && end==arr[0].length-1)
       {
        storage[start][end]=arr[start][end];
        return storage[start][end];
       }
    
       int option1=searchM(arr,start,end+1,storage);
       int option2=searchM(arr,start+1,end,storage);
       int option3=searchM(arr,start+1,end+1,storage);
      
       //Storing the calculated result, and then returning it
       storage[start][end]=arr[start][end]+Math.min(option1,Math.min(option2,option3));
       return storage[start][end];
    }
  
}
