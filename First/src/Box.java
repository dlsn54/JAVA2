import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w,h,area,perimeter;

		System.out.print("사각형의 높이를 입력하세요 : ");
		h=input.nextDouble();
		System.out.print("사각형의 너비를 입력하세요 : ");
		w=input.nextDouble();
		
		
		area=w+h;
		
		perimeter=2.0*(w+h);
		
		System.out.println("사각형의 면적은 "+area);
		System.out.println("사각형의 둘레는 "+perimeter);
		
		
		
		

	}

}
