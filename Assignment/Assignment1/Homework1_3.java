
public class Homework1_3 {
	public static void main(String[] args) {
		Dog[] pets = new Dog[5];
		pets[0] = new Dog();
		pets[1] = new Dog();
		pets[2] = new Dog();
		pets[3] = new Dog();
		pets[4] = new Dog();
		
		int i = 0;
		while (i < 5) {
			pets[i].size = 10 * (i+1);
			i++;
		}
		
		i = 0;
		int j = 0;
		while (i < 5) {
			System.out.print("Dog[" + i +"]: size=" + pets[i].size);
			System.out.print(", ");
			while(j < i+1) {
				pets[i].bark();
				j++;
			}
			System.out.println();
			j = 0;
			i++;
		}
	}
}
