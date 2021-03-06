package lab2;
import java.util.Scanner;

class ReverseSort
{
	int[] getSorted(int a[])
	{
		int len=a.length;
		for(int i=0;i<len;i++) //Reversing the numbers
		{
			int num,rem=0,rev=0;
			num=a[i];
			while(num>0)
			{
				rem=num%10;
				num=num/10;
				rev=(rev*10)+rem;
			}
			a[i]=rev;		
		}
		int temp;
		for(int i=0;i<len;i++) //sort the array
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}

public class Exercise3 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ReverseSort rs=new ReverseSort();
		int b[]=new int[n];
		b=rs.getSorted(arr);
		System.out.println("Array after sorting is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
		sc.close();
	}
}