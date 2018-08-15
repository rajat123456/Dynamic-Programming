//Time Comp-> O(h), "h" is given height

public class Solution {

   static int m=1000000007;	
public static int balancedTreesOfHeightH(int height){

      int storage[]=new int[height+1];
      storage[0]=1;
      storage[1]=1;
      return ans(height,storage);
	}
  
  static int ans(int height, int[]storage)
  {
        if(storage[height]!=0)
        return storage[height];
      
      long x=ans(height-1,storage);
      long y=ans(height-2,storage);
      
      int first=(int)(((long)(x)*x)%m);
      int second=(int)(((long)(x)*2*y)%m);
      
      storage[height]= (int)(((long)(first) + second )%m);
      return storage[height]; 
  }
}
