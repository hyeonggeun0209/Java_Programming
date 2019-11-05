
public class EnhancedForLoop {
	public static void main(String args[]) {
		String[] strs = {"Media",  "Labs", "SCH", "Internet", "Things", "IoT"};
		
		for(String x : strs) {
			if (x.length() > 4) {
				System.out.println("The length of " + "'" + x + "'" + " is " + x.length() + ".");
			}
		}
	}
}
