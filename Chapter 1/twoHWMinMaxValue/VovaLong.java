package twoHWMinMaxValue;

public class VovaLong {
	private long val;
	public static final long minVal = -9223372036854775808L;
	public static final long maxVal = 9223372036854775807L;
	
	public void incrementVal() {
		val++;
	}
	
	public void decrementVal() {
		val--;
	}
	
	public long getVal() {
		return val;
	}
	
	public VovaLong(long val) {
		this.val=val;
	}
}