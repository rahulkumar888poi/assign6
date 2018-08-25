import java.util.Scanner;

class wave
{
public static void main(String args[])
{
	int temp,i,n,j;
int[] my=new int[20];
int[] mynew=new int[20];
Scanner s=new Scanner(System.in);
    n=s.nextInt();   

 for( i=1; i<=n;i++)
	 
    {
   
     my[i]=s.nextInt();   
        
    }

   
    for ( i = 1; i <= n; i++) 
        {
            for ( j = i + 1; j <= n; j++) 
            {
                if (my[i] > my[j]) 
                {
                    temp = my[i];
                    my[i] = my[j];
                    my[j] = temp;
                }
            }
        }
	
	
	
    for ( i = 1; i <= n; i+=2) 
        {
            for ( j = i + 1; j <= n; j+=2) 
            {
                if (my[j] > my[i]) 
                {
                    temp = my[j];
                    my[j] = my[i];
                    my[i] = temp;
                }
				break;
            }
        }
	
    
   
    for ( i = 1; i <= n; i++) 
        {
           System.out.print(my[i]);
        }
	

   
}

}



