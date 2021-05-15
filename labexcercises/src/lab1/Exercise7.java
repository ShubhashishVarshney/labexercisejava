package lab1;
import java.util.Scanner;

class Increasing
{
	boolean checkNumber(int number)
	{
		int rem1,rem2;
		while(number>0)
		{
			rem1=number%10;
			number=number/10;
			rem2=number%10;
			if(rem2>rem1)
				return false;
		}
		return true;
	}
}
public class Exercise7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Increasing inc=new Increasing();
		boolean res=inc.checkNumber(num);
		if(res)
			System.out.println("Increasing Number");
		else
			System.out.println("Not an Increasing Number");
		sc.close();
	}
}