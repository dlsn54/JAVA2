
public class CommandLine2 {

	public static void main(String[] args) {
//		int[] s =new int[5];
//		s[0]=4;
//		s[1]=7;
//		s[2]=5;
//		s[3]=8;
//		s[4]=9;
		
		int s[] = {4,7,2,9,7};
		String[] cnt= {"One","Two","Three","Four","5"};
		
		
		int total=0;
		
		for (int i = 0; i < s.length; i++) {
			total +=s[i];
			System.out.println(cnt[i]);
			
		}
		
		
		
		System.out.println("Че = "+total+"ЦђБе = "+(double)total/s.length);
		
	}

}