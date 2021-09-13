public class TheaterReserve {

	public static void main(String[] args) {
		final int SIZE = 10;
		int[] seats = new int[SIZE];
		
		while(true) {
			System.out.println("==================");
			for(int i = 0; i < SIZE; i++)
				System.out.printf("%3d", i);
			System.out.println();
			System.out.println("==================");
			for(int i = 0; i < SIZE; i++)
				System.out.printf("%3d", seats[i]);
			System.out.println();
			System.out.println("==================");
			
		}

	}

}