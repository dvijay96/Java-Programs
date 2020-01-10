import java.io.File;

public class FileCheck {

	public static void main(String[] args) 
	{
		String path1="C";
		File f=new File(path1);
		if(f.exists())
		{
			if(f.isFile())
			{
				System.out.println("Path contains a file");
			}
			else
			{
				System.out.println("Path contains a folder");
			}
		}
		else
		{
			System.out.println("Invalid Path");
		}
	}

}
