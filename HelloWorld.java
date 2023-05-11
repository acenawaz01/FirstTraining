import java.io.*;

class HelloWorld
{

	public static void main(String args[]) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String name = input.readLine();
		System.out.println("My name is "+name);
	}
}