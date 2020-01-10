//import java.util.Scanner;
class ABC
{
	public void disp()
	{
		System.out.println("ABC");
	}
}
public class Example
{
	public static void main(String[] args)
	{
		ABC t=new ABC()
				{
					public void get()
					{
						System.out.println("Test");
					}
				};
				t.disp();
	}
}
