package twoHWMinMaxValue;

public class VovaMain {
	
	public static void main(String[] args) {
		VovaByte minByte = new VovaByte(VovaByte.minVal);
		VovaByte maxByte = new VovaByte(VovaByte.maxVal);
		
		VovaShort minShort = new VovaShort(VovaShort.minVal);
		VovaShort maxShort = new VovaShort(VovaShort.maxVal);
		
		VovaInt minInt = new VovaInt(VovaInt.minVal);
		VovaInt maxInt = new VovaInt(VovaInt.maxVal);
		
		VovaLong minLong = new VovaLong(VovaLong.minVal);
		VovaLong maxLong = new VovaLong(VovaLong.maxVal);		
		
		System.out.println("Integers of simple type:");
		
		System.out.println("Byte min = "+minByte.getVal()+";");
		System.out.println("Byte max = "+maxByte.getVal()+";");
		
		System.out.println("Short min = "+minShort.getVal()+";");
		System.out.println("Short max = "+maxShort.getVal()+";");
		
		System.out.println("Int min = "+minInt.getVal()+";");
		System.out.println("Int max = "+maxInt.getVal()+";");
		
		System.out.println("Long min = "+minLong.getVal()+";");
		System.out.println("Long max = "+maxLong.getVal()+";");
		
		System.out.println();
		
		
		minByte.decrementVal();
		maxByte.incrementVal();
		
		minShort.decrementVal();
		maxShort.incrementVal();
		
		minInt.decrementVal();
		maxInt.incrementVal();
		
		minLong.decrementVal();
		maxLong.incrementVal();
		
		
		System.out.println("Values after operations (inc, dec):");
		
		System.out.println("Byte min = "+minByte.getVal()+";");
		System.out.println("Byte max = "+maxByte.getVal()+";");
		
		System.out.println("Short min = "+minShort.getVal()+";");
		System.out.println("Short max = "+maxShort.getVal()+";");
		
		System.out.println("Int min = "+minInt.getVal()+";");
		System.out.println("Int max = "+maxInt.getVal()+";");
		
		System.out.println("Long min = "+minLong.getVal()+";");
		System.out.println("Long max = "+maxLong.getVal()+";");
	}
}