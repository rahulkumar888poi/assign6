import java.util.Scanner;
class complex
{
	int real;
	int img;
	int a;
	void display()
	{
		
     Scanner s=new Scanner(System.in);
     real=s.nextInt();
     img=s.nextInt();
	 
	System.out.print(real+"+"+img+"i");	
	}	
}
class real
{
public static void main(String args[])
{
	complex r=new complex();
r.display();  
}

}



