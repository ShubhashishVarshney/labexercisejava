package lab2;
import java.util.Scanner;

class RemoveDuplicate
{
	int[] modifyArray(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++) //sort the array in descending order
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		int b[]=new int[n];
		b[0]=a[0];
		int j=1;
		int count=0;
		for(int i=1;i<n;i++) //remove duplicate elements
		{
			if(a[i]!=a[i-1])
			{
				b[j]=a[i];
				j++;
			}
			else
				count++;
		}
		
		int c[]=new int[n-count];
		for(int i=0;i<n-count;i++) //remove extra zeroes from the array
		{
			c[i]=b[i];
		}
		return c;
	}
}


public class Exercise4 
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
		RemoveDuplicate rd=new RemoveDuplicate();
		int result[]=new int[n];
		result=rd.modifyArray(arr);
		int len=result.length;
		System.out.println("Array after removing duplicates and sorting in descending order is : ");
		for(int i=0;i<len;i++)
		{
			System.out.print(result[i]+" ");
		}
		sc.close();
	}

}