import java.util.Scanner;

public class Umpire 
{
	Guesser g=new Guesser();
	Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	Scanner scan=new Scanner(System.in);
	
	public void Begin()
	{
		g.gNum();
		
		System.out.println("Player 1 enter a num:");
		p1.pNum(scan.nextInt());
		System.out.println("Player 2 enter a num:");
		p2.pNum(scan.nextInt());
		System.out.println("Player 3 enter a num:");
		p3.pNum(scan.nextInt());
	}
	
	public void compare()
	{
		if(g.n==p1.n)
		{
			System.out.println("Player 1 won");
		}
		else if(g.n==p2.n)
		{
			System.out.println("Player 2 won");
		}
		else if(g.n==p3.n)
		{
			System.out.println("Player 3 won");
		}
		else
		{
			System.out.println("Better luck next time");
		}
	}
}
