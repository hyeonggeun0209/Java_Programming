
public class SwitchString {
	public static void main(String args[]) {
		String [] strs = {"Java", "C", "C++", "C#", "Python"};
		
		for (String x : strs) {
			switch(x) {
			case "Java" :
				
			case "C" :
				System.out.println("We have learned " + x + ".");
				break;
			case "C++" :
				
			case "C#" :
				
			case "Python" :
				System.out.println("We have not learned " + x + " yet.");
				break;
			}
		}
	}
}
