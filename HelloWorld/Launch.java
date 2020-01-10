import java.time.LocalDateTime;
import java.util.Scanner;

public class Launch {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int hcf=0;
		for(int i=Math.min(n,m);i>=2;i--)
		{
			if(n%i==0 && m%i==0)
			{
				System.out.println("hcf= "+i);
				hcf=i;
				break;
			}
		}
		int lcm=(n*m)/hcf;
		System.out.println("LCM= "+lcm);
		scan.close();
		System.out.println(LocalDateTime.now());
	}

}
