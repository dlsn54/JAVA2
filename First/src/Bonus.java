import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TARGETSALES=1000;
		int mysales,bonus;
		String result;
		
		System.out.print("������ �Է��ϼ���(���� ����) :");
		mysales=sc.nextInt();
		
		if(mysales-TARGETSALES>0) 
		{
			result="���� �޼�";
			bonus=(mysales-TARGETSALES)/10;
		}
		else 
		{
			result="���� �̴޼�";
			bonus=0;
		}
		System.out.println(result+"���ʽ� = "+bonus);	
		sc.close();
	}
}