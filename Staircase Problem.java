/* Problem Statement: 
   A child going up a staircase with n steps, can hop up 1, 2, or 3 steps at a time. How many ways can the child reach the top? */

public class Solution {
public static long staircase(int n){
	
     //Storage Array
     long[]storage=new long[n+1];
     storage[1]=1;
     return stair(n,storage);
  } 
  static long stair(int n, long[]storage)
  {
    //Computing problems, only if they are not computed
    if(storage[n]==0)
      
    {
      long count=0;
      if(n==0)
        return 1;
      
      if(n-1>=0)
        count+=stair(n-1,storage);
      
      if(n-2>=0)
        count+=stair(n-2,storage);
      
      if(n-3>=0)
        count+=stair(n-3,storage);
      
      storage[n]=count;
      return storage[n];
    }
    
    //If already computed, then just returning that stored value
    else
    return storage[n];
  }
}
