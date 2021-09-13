import java.util.Iterator;

public class Interator {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print((int)(Math.random()+45+1));
			if(i < 5)
				System.out.print(" ,");
			else
				System.out.print(" ,");
		}

	}

}