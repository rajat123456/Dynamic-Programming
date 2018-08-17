//Time Comp-> O(m*n), m=length of 1st string , n=length of 2nd string, (this much unique calls)
//Space Comp-> O(m*n)

public class Main
{
	public static void main(String[] args) {
		
		String s="fracture";
		String t="erutcel";
		String out="";
		int[][]storage=new int[s.length()][t.length()];
		
		for(int i=0;i<s.length();i++)
		{
		    for(int j=0;j<t.length();j++)
		    {
		        if(s.charAt(i)==t.charAt(j))
		        {
		            if(i-1>=0 && j-1>=0)
		            storage[i][j]=1+storage[i-1][j-1];
		            
		            else
		            storage[i][j]=1;
		        }
		        
		        else
		        {
		            if(i-1>=0 && j-1>=0)
		            storage[i][j]=Math.max(storage[i-1][j],storage[i][j-1]);
		            
		            else if(i-1>=0)
		            storage[i][j]=storage[i-1][j];
		            
		            else if(j-1>=0)
		            storage[i][j]=storage[i][j-1];
		            
		            else
		            storage[i][j]=0;
		        }
		    }
		}
		
		System.out.println(storage[s.length()-1][t.length()-1]);
		System.out.println(out);
	}
}
