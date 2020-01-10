//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class HelloWorld {

	public static void main(String[] args)
	{
		String path1=null;
		String path2=null;
		int temp=0;
		FileReader fr=null;
		FileWriter fw=null;
		//BufferedReader br=null;
		//BufferedWriter bw=null;
		
		
		path1="C:\\Users\\DVIJAY\\Desktop\\Aptitude\\input.txt";
		path2="C:\\Users\\DVIJAY\\Desktop\\Aptitude\\output.txt";
		try
		{
			fr=new FileReader(path1);
			fw=new FileWriter(path2);
		
			while((temp=fr.read())!=-1)
			{
				fw.write(temp);
			}
			fw.flush();
		}
		catch(Exception e)
		{
			System.out.println("IOProgramming Interrupted");
		}
		finally
		{
			try
			{
				fr.close();
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("Stream closing interrupted");
			}
		}
	}

}
