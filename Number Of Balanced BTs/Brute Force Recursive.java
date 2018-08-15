//Time Comp->Exponential

public class Solution {

    static int m=1000000007;
	public static int balancedTreesOfHeightH(int height){

      if(height==0)
        return 1;
      
      if(height==1)
        return 1;
      
      int x=balancedTreesOfHeightH(height-1);
      int y=balancedTreesOfHeightH(height-2);
      
      //Convert x into long and then perform operation and then do this whole long operation value % "m" and then typecast to int
      int first=(int)(((long)(x)*x)%m);
      int second=(int)(((long)(x)*2*y)%m);
      
      return ((int)((long)(first)+second)%m);
	}
}






