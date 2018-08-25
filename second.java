import java.util.Scanner;

class second
{
public static void main(String args[])
{
	int temp,i,n;
int[] my=new int[20];
Scanner s=new Scanner(System.in);
    n=s.nextInt();   

 for( i=1; i<=n;i++)
	 
    {
   
     my[i]=s.nextInt();   
        
    }

   
    for ( i = 1; i <= n; i++) 
        {
            for (int j = i + 1; j <= n; j++) 
            {
                if (my[i] > my[j]) 
                {
                    temp = my[i];
                    my[i] = my[j];
                    my[j] = temp;
                }
            }
        }
	
	
	
     System.out.print(my[n-1]);   
   

   
}

}



