import java.util.Scanner;

public class Averages {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0,avg=0,c=1;
		for(int i=2; c<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				sum+=i;
				c++;
			}
		}
		avg=sum/n;
		System.out.println("\n"+sum+"\n"+avg);
		scan.close();
	}

}
