import java.util.Scanner;

public class MatrixMul {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,1},{1,0,1},{2,1,2}};
		int b[][]= {{3,2,1},{4,5,6},{2,1,0}};
		int c[][]=new int[3][3];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ENter the 1st matrix:\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the 2nd Matrix:\n");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int k=0;k<c.length;k++)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					sum=sum+a[i][j]*b[j][k];
				}
				c[k][i]=sum;
				sum=0;
			}
		}
		System.out.println("Sum matrix=\n");
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
