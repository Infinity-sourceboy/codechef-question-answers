/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner pr=new Scanner(System.in);
		int n1=pr.nextInt();
		while(n1-->0){
		int n=pr.nextInt();
		int f=pr.nextInt();
		int v=pr.nextInt();
		int fi=pr.nextInt();
		    int d=0;
	
		   d=f+fi;
		   if(n<=d && n<=v)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		   
		
			
			
		}
	}
}
