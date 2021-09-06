import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius,area;
		
		System.out.print("원의 반지름을 입력하세요 : ");
		radius= input.nextDouble();
		
		area=Math.PI*radius*radius;
		
		System.out.println(area);
		

	}

}
