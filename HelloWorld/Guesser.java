import java.util.Scanner;

public class Guesser 
{
	int n;
	Scanner scan=new Scanner(System.in);
	public void gNum()
	{
		System.out.println("Guesser guess a no.");
		n=scan.nextInt();
	}
}
