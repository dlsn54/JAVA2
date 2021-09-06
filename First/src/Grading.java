import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int score;
		
		System.out.print("점수를 입력하시오 : ");
		score=sc.nextInt();
		
		if(score>=90) 
		{
			System.out.println("A등급 입니다");
		}
		else if (score>=80) 
		{
			System.out.println("B등급 입니다");
		}
		else if (score>=70) 
		{
			System.out.println("C등급 입니다");
		}
		else if (score>=60) 
		{
			System.out.println("D등급 입니다");
		}
		else 
		{
			System.out.println("F등급 입니다");
		}
	}

}
