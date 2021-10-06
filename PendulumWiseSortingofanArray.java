import java.util.*;
class pendulum
{
	int a[];
	int n;
	pendulum()
	{
		n=0;
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt(); 
		}
	}
	void sort()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j + 1])
				{
					int t=a[j]; 
					a[j]=a[j+1];
					a[j+1]=t; 
				}
			}
		}
	}
	void check()
	{
		int r[]=new int[n]; 
		int f=(n/2)+1; 
		int l=(n/2)-1; 
		r[n/2]=a[n-1];
		int k=0;
		for(int i=n-2;i>=0;i--)
		{
			if(k==0)
			{
				r[f]=a[i]; 
				f++;
			}
			else
			{
				r[l]=a[i]; 
				l--;
			}
			k=-k+1; 
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(r[i]+ "\t"); 
		}
	}
	void disp()
	{
		if(n%2!=0) 
		{
			sort();
			check();
		}
		else
		{
			System.out.println("wrong input");
		}
	}
	public static void main(String[]args)
	{
		pendulum ob=new pendulum(); 
		ob.accept(); 
		ob.disp();
	}
}
