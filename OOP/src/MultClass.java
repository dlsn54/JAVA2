class Television1{
	private int volume;
	private int channel;
	boolean onoff;
	
	public int getVolume() {return volume;}
	public void setVolume(int volume) {this.volume = volume;}
	public int getChannel() {return channel;}
	public void setChannel(int channel) {this.channel = channel;}
	
	void print() {System.out.println("채널은"+channel+"볼륨은"+volume);}
}


public class MultClass {
	public static void main(String[] args) {
		Television tv = new Television();
		
		tv.setChannel(7);
		tv.setVolume(5);
		tv.onoff=true;
		tv.print();
	}
}

