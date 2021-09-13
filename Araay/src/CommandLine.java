public class CommandLine {

	public static void main(String[] args) {
		if(args.length>0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		if(args[0].equals("-version"))
		{
			System.out.println("버전을 확인하고 있네요");
		}
	}

}