package twoHWMinMaxValue;

public class VovaShort {
	private short val;
	public static final short minVal = -32768;
	public static final short maxVal = 32767;
	
	public void incrementVal() {
		val++;
	}
	
	public void decrementVal() {
		val--;
	}
	
	public short getVal() {
		return val;
	}
	
	public VovaShort(short val) {
		this.val=val;
	}
}