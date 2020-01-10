import java.util.Scanner;

public class StrProb1 {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int vc=0,cc=0,sc=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
				   s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
			else if(s.charAt(i)>='0'&&s.charAt(i)<='9'||s.charAt(i)==' ')
			{				
			}
			else
			{
				sc++;
			}
		}
		System.out.println("Vowels="+vc);
		System.out.println("Consonants="+cc);
		System.out.println("Special char="+sc);
		scan.close();
	}

}
