
public class UMLTele {
	private boolean isOn; 
	private int volume;
	private int channel;
	public int getVolume() { return volume; }
	public void setVolume(int volume) {	this.volume = volume;	}
	public int getChannel() {	return channel;	}
	public void setChannel(int channel) {	this.channel = channel;	}
	
	@Override
	public String toString() {	
		return "UMLTele [isOn=" + isOn + ", volume=" + volume + ", channel=" + channel + "]";
	}
	public void turnOn() {	this.isOn=true;	}
	

	public void turnOff() {	this.isOn=false; }
		
}
