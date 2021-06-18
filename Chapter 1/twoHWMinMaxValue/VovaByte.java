package twoHWMinMaxValue;

public class VovaByte {
	private byte val;
	public static final byte minVal=-128;
	public static final byte maxVal=127;
	
	public void incrementVal() {
		val++;
	}
	
	public void decrementVal() {
		val--;
	}
	
	public byte getVal() {
		return val;
	}
	
	public VovaByte(byte val) {
		this.val=val;
	}
		
}