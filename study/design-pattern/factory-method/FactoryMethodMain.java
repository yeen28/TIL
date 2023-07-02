/**
 * Factory Method Pattern
 */
public class FactoryMethodMain {
	public static void main(String[] args) {
		Animal bolt = new Dog();
		Animal kitty = new Cat();

		AnimalToy boltBall = bolt.getToy();
		AnimalToy kittyTower = kitty.getToy();

		boltBall.identify(); // 강아지
		kittyTower.identify(); // 고양이
	}
}
