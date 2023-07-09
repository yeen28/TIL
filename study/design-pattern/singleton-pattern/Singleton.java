public class Singleton {
	// singleton 객체를 static 변수로 선언
	private static Singleton instance;
	private String msg;

	private Singleton(String msg) {
		this.msg = msg;
	}

	// 인스턴스 전달
	public static Singleton getInstance(String msg) {
		if (instance == null) {
			instance = new Singleton(msg);
		}
		return instance;
	}

	public void print() {
		System.out.println(msg);
	}
}