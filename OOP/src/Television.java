public class Television{
	private int volume;
	private int channel;
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	boolean onoff;
	
	void print() {
		System.out.println("채널은"+channel+"볼륨은"+volume);
	}
}