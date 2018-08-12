//Time Comp-> O(m*n) -> m=rows and n=cols
//Space Comp-> O(m*n)

import java.util.*;
public class Solution {
    
    public static int minCostPath(int input[][]) {

    int[][]storage=new int[input.length][input[0].length];
      
      return searchDP(input,storage);
      
}
  
    static int searchDP(int[][]arr,int[][]storage)
    {
      int rows=arr.length;
      int cols=arr[0].length;
      storage[arr.length-1][arr[0].length-1]=arr[arr.length-1][arr[0].length-1];
      
      for(int q=cols-2;q>=0;q--)
      {
        storage[rows-1][q]=storage[rows-1][q+1]+arr[rows-1][q];
      }
      
      for(int w=rows-2;w>=0;w--)
      {
        storage[w][cols-1]=storage[w+1][cols-1]+arr[w][cols-1];
      }
      
      for(int a=rows-2;a>=0;a--)
      {
        for(int g=cols-2;g>=0;g--)
        {
          int option1=storage[a][g+1];
          int option2=storage[a+1][g];
          int option3=storage[a+1][g+1];
          
          storage[a][g]=arr[a][g]+Math.min(option1,Math.min(option2,option3));
        }
      }
      return storage[0][0];
    }
}
