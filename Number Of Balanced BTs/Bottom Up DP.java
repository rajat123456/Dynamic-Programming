//Time Comp-> O(h), "h" is given height

public class Solution {

   static int m=1000000007;	
   public static int balancedTreesOfHeightH(int height){

      int storage[]=new int[height+1];
      storage[0]=1;
      storage[1]=1;
  
      for(int i=2;i<=height;i++)
     {
       int x=storage[i-1];
       int y=storage[i-2];
        
       int first=(int)(((long)(x)*x)%m);
       int sec=(int)(((long)(x)*2*y)%m);
        
       storage[i]=(int)(((long)(first)+sec)%m); 
     }
     return storage[height];
  }
}
