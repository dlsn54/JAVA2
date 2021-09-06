import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("정수를 입력하세요 : ");
		number=sc.nextInt();
		
		if(number%2==0) 
		{
			System.out.println(number+"는 짝수입니다");
		}
		else 
		{
			System.out.println(number+"는 홀수입니다");
		}

	}

}
