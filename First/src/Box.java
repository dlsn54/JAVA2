import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double w,h,area,perimeter;

		System.out.print("�簢���� ���̸� �Է��ϼ��� : ");
		h=input.nextDouble();
		System.out.print("�簢���� �ʺ� �Է��ϼ��� : ");
		w=input.nextDouble();
		
		
		area=w+h;
		
		perimeter=2.0*(w+h);
		
		System.out.println("�簢���� ������ "+area);
		System.out.println("�簢���� �ѷ��� "+perimeter);
		
		
		
		

	}

}
