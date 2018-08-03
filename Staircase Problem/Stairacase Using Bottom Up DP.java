/* Problem Statement: 
   A child going up a staircase with n steps, can hop up 1, 2, or 3 steps at a time. How many ways can the child reach the top? */

//Using Bottom Up DP(Itertive)

public class Solution {
public static long staircase(int n){
	
     long[]storage=new long[n+1];
     storage[1]=1;
     return stair(n,storage);
  } 
  static long stair(int n, long[]storage)
  {
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
    
    else
    return storage[n];
  }
}
