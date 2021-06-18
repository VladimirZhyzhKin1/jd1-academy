public class Task2 {
		byte min_Byte=-128;
		byte max_Byte=127;
		short min_Short=-32768;
		short max_Short=32767;
		int min_Int=-2147483648;
		int max_Int=2147483647;
		long min_Long=-9223372036854775808L;
		long max_Long=9223372036854775807L;
		float min_Float=1.4e-45F;
		float max_Float=3.4e+38F;
		double min_Double=4.9e-324;
		double max_Double=1.7e+308;
		
		public void incrementMaxIntegerVariable() {
			max_Byte++;
			max_Short++;
			max_Int++;
			max_Long++;
		}
		
		public void decrementMinIntegerVariable() {
			min_Byte--;
			min_Short--;
			min_Int--;
			min_Long--;
			
		}
		
		public void printlnVariable() {
			System.out.println("Type <byte> "+"min="+min_Byte+"; "+"max="+max_Byte+";");
			System.out.println("Type <short> "+"min="+min_Short+"; "+"max="+max_Short+";");
			System.out.println("Type <int> "+"min="+min_Int+"; "+"max="+max_Int+";");
			System.out.println("Type <long> "+"min="+min_Long+"; "+"max="+max_Long+";");
			System.out.println("Type <float> "+"min="+min_Float+"; "+"max="+max_Float+";");
			System.out.println("Type <double> "+"min="+min_Double+"; "+"max="+max_Double+";");
		}
		
		public static void main(String[] args) {
			Task2 task=new Task2();
			task.printlnVariable();
			task.incrementMaxIntegerVariable();		
			task.printlnVariable();
			task.decrementMinIntegerVariable();	
			task.printlnVariable();
		}
}