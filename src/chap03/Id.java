package chap03;

public class Id {
	private static int counter = 0; // 클래스 변수
	private int id; // 인스턴스 변수

	// 생성자
	public Id() { id = ++counter; }

	// counter를 반환하는 클래스 메서드
	public static int getCounter() { return counter; }

	// 아이디를 반환하는 인스턴스 메서드
	public int getId() {
		return id;
	}
}

