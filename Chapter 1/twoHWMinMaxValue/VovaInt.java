package twoHWMinMaxValue;

public class VovaInt {
	private int val;
	public static final int minVal = -2147483648;
	public static final int maxVal = 2147483647;
	
	public void incrementVal() {
		val++;
	}
	
	public void decrementVal() {
		val--;
	}
	
	public int getVal() {
		return val;
	}
	
	public VovaInt(int val) {
		this.val=val;
	}
}