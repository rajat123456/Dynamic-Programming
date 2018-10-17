//01 Knapsack Using Top Down Memoization DP

public class Solution {
	
	public static int knapsack(int[] weight,int value[],int maxWeight, int n){

      return knap(weight,value,maxWeight,0);
   }
     
  static int knap(int[]w,int[]v,int max,int index)
  {
    
    if(index>=w.length)
        return 0;

    int op1;
    
    if(max-w[index]>=0)
    op1=v[index]+knap(w,v,max-w[index],index+1);
    
    else op1=0;
    
    int op2=knap(w,v,max,index+1);
    
    return Math.max(op1,op2);
  }
}
