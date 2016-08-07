import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		String num1=args[0];		
       int n=Integer.parseInt(num1);       
       int rem;
       int x[]=new int[10];
       int y;
       int i=0; 
       while(n>0)
       {    	   
    	   rem=n%10;
    	   x[i]=rem;
    	   n=n/10;
    	   i++;    	   
       }       
       for( i=0;i<num1.length();i++)
       {    
    	   for(int j=i+1;j<num1.length();j++)
    	   {
    	   if(x[i]>x[j])
    	   {
    		   y=x[i];
    		  x[i]=x[j];
    		  x[j]=y;    		   
    	   }
    	   } 
    	   System.out.println(x[i]);
       } 
       System.out.println("Enter the number of digits to delete");
       int k=input.nextInt();
       for(int j=0;j<num1.length()-k;j++)
       {
    	   System.out.print(x[j]);
       }
	}
}