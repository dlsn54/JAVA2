
public class CommandLine2 {

	public static void main(String[] args) 
		{
			if(args.length>0) {
				if(args[0].equals("-h"))
					System.out.println("help");
				else
					for (int i = 1; i < args.length; i++) 
					{
						System.out.println(args[i]);
					}
			}
			else
			{
				System.out.println("실행할 때 뒤에 아무 것도 없이 실행했네요");
			}
		}
}

