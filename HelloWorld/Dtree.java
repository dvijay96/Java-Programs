import java.util.Scanner;

public class Dtree {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter: ");
		int n=scan.nextInt();
		int d=scan.nextInt();
		int m=scan.nextInt();
		int count=0,sum=0;
//		System.out.println("Hello");
		for(int i=1;i<=d;i++)
		{
			for(int j=i;j<=d;)
			{
				if(j<sum)
				{
					sum=m;
					while(sum<n)
					{
						sum=sum+j;
						
					}
					if(sum==n)
					{
						count++;
					}
					else
						break;
				}
				else
				{
					sum=0;
					while(sum<n)
					{
						sum=sum+j;
					}
				}
			}
		}

	}

}
