import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius,area;
		
		System.out.print("���� �������� �Է��ϼ��� : ");
		radius= input.nextDouble();
		
		area=Math.PI*radius*radius;
		
		System.out.println(area);
		

	}

}
