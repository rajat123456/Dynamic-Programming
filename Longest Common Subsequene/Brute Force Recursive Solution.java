//Program returns first LCS of 2 strings

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		
		System.out.println(LCS(first,second,""));
	}
	
	
	static String LCS(String first, String second,String output)
	{
	    if(first.length()==0 || second.length()==0)
	    return output;
	    
	    if(first.charAt(0)==second.charAt(0))
	    output+=LCS(first.substring(1),second.substring(1),first.charAt(0)+"");
	    
	    else
	    {
	        String one=LCS(first.substring(1),second,output);
	        String sec=LCS(first,second.substring(1),output);
	        String thi=LCS(first.substring(1),second.substring(1),output);
	        
	        if(one.length()>=sec.length() && one.length()>=thi.length())
	        return one;
	        
	        else if(sec.length()>=one.length() && sec.length()>=thi.length())
	        return sec;
	        
	        else
	        return thi;
	    }
	    return output;
	}
}
