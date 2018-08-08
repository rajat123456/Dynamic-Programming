/* Problem Statement: 
   A child going up a staircase with n steps, can hop up 1, 2, or 3 steps at a time. How many ways can the child reach the top? */

//Using Bottom Up DP(Itertive)

public class Solution {
public static long staircase(int n){
	
     if(n==0 ||n==1)
       return 1;
  
     if(n==2)
       return 2;
  
     long[]storage=new long[n+1];
     storage[0]=1;
     storage[1]=1;
     storage[2]=2;
     
     for(int q=3;q<=n;q++)
     {
         storage[q]=storage[q-1]+storage[q-2]+storage[q-3];
     }
  return storage[n];
  } 
}
