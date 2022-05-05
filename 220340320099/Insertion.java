import java.util.*;

class Insertion
{
	void Isorting(int a1[])
	{
		int n = a1.length;
		
		for(int i = n-1 ; i >0 ; i--)
		{
			int temp = a1[i];
			int j= i-1;
			
			while(j >= 0 && a1[j]>temp)
			{
				a1[j+1]=a1[j];
				j=j-1;
				display(a1);
	
			}
			
			a1[i]= temp;
		}
	}
	static void display(int a1[]);
	{
		int n = a1.length;
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(a1[i]+" ");
			
			System.out.println();
		}
	}
	

public static void main(String...args)
{
	Scanner sc = new Scanner(System.in);
	
	int n = a1.length;
	int a1[]= new int[n];
	for(int i = 0 ; i< n ;i++)
a1[i]= sc.nextInt();	

Insertion s = new Insertion();
	
	s.Isorting(a1);
	
	s.display(a1);
}
}