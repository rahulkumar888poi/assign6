import java.util.Scanner;
class rectangle
{
	int length;
	int breadth;
	int a;
	void calculatearea()
	{
		
     Scanner s=new Scanner(System.in);
     length=s.nextInt();
     breadth=s.nextInt();
	 a=length*breadth;
	System.out.print("Area of Rectangle is "+a);	
	}	
}
class area
{
public static void main(String args[])
{
	rectangle r=new rectangle();
r.calculatearea();  
}

}



