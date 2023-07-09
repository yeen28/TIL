public class SingletonPatternMain {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance("singleton1");
		Singleton instance2 = Singleton.getInstance("singleton2");

		instance1.print(); // 결과 : singleton1
		instance2.print(); // 결과 : singleton1
	}
}
