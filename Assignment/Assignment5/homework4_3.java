import java.util.ArrayList;

public class homework4_3 {
	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();

		dog.add(new Dog());
		dog.add(new BigDog());
		dog.add(new MediumDog());
		dog.add(new SmallDog());

		dog.get(0).bark();
		dog.get(2).bark();
		dog.get(1).bark();
		dog.get(0).bark();
		dog.get(0).bark();
		dog.get(3).bark();
		dog.get(0).bark();
		dog.get(0).bark();
	}
}
