
public class UMLTeleTest {

	public static void main(String[] args) {
		UMLTele tv= new UMLTele();
		
		tv.turnOn();
		
		tv.setChannel(25);
		tv.setVolume(15);
		System.out.println(tv);

	}

}
