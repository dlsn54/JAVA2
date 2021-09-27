
public class StringTest1 {

	public static void main(String[] args) {
		String a= "Hello";
		String b= "Hello";
		String c= new String("Hello");

		System.out.println(a.charAt(0));
		System.out.println(a==b);//주소가 같다
		System.out.println(b==c);//주소가 다르다
		System.out.println(c.equals(a));//주소가 다르지만 equals를 사용하여서 문자를 비교했다
		
	}

}
