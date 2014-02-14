package intw.writtenexams;

import java.util.Scanner;

public class FibanociSeries {

/*	public static void main(String[] args) {
		int count=10;
		int[] feb=new int[count];
		feb[0]=0;
		feb[1]=1;
		
		for(int i=2;i<count;i++)
		{
			feb[i]=feb[i-1]+feb[i-2];
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(feb[i]+"");
		}
		
	}
*/
	public static long fact(int n){
	
		if(n<=1) return n;
		else return fact(n-1)+fact(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i +" : "+ fact(i));
		}
	}
}
