import java.util.Scanner;

public class Lager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,max;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		x=sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		y=sc.nextInt();
		
//		if(x>y) 
//		{
//			max=x;
//		}else 
//		{
//			max=y;
//		}
		
		max=(x>y)?x:y;
		
		System.out.println("ū ���� "+max +"�Դϴ�");

	}

}
