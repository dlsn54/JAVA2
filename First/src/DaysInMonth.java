import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int month,days,year;

		System.out.print("년도 입력하세요 : ");
		year=sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		month=sc.nextInt();
		
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			if(year%4==0 && year%200!=0 || year%400==0) {
				days=29;
			}else {
				days=28;
			}
			break;
		default:
			days=31;
			break;
		}
		
		
		System.out.println(year+"년 "+month+"월은 "+days+"일 입니다");
	}

}
