import java.util.Scanner;

public class Lager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,max;
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		x=sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		y=sc.nextInt();
		
//		if(x>y) 
//		{
//			max=x;
//		}else 
//		{
//			max=y;
//		}
		
		max=(x>y)?x:y;
		
		System.out.println("큰 수는 "+max +"입니다");

	}

}
