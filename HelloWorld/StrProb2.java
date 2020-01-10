//import java.util.Scanner;

public class StrProb2 {

	public static void main(String[] args) 
	{
		 // Scanner scan=new Scanner(System.in);
          String s="Madam";
          s=s.toLowerCase();
          String t="";
          for(int i=0;i<s.length();i++)
          {
            if(s.lastIndexOf(s.charAt(i))==i && t.contains(""+s.charAt(i))==false)
               {
              		System.out.println(s.charAt(i));
              		break;
               }
            t=t+s.charAt(i);
           }
	}

}
