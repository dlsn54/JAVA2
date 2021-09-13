import java.util.Arrays;
import java.util.Scanner;

public class SortExample{
	public static void main(String[] args) {
		final int SIZE = 10;
		
		int[] number = new int[SIZE];
		
//		for (int i = 0; i < number.length; i++) {
//			number[i]=(int)(Math.random()*100);
//		}
		Scanner sc =new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			number[i]=sc.nextInt();
		}
		
		
		
		System.out.println("처음 생성된 배열");
		for (int i : number) {
			System.out.print(i+" ");
		}

		System.out.println("정렬된 배열");
		Arrays.sort(number);
		
		for (int i : number) {
			System.out.print(i+" ");
		}
		
	}
}