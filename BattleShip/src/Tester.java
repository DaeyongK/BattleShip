public class Tester {
	public static void main(String args[]) {
		Position p1 = new Position('e', 3);
		Position p2 = new Position('a', 1);
		System.out.println(p1.column());
		System.out.println(p1.row());
		System.out.println(p1.toString());
		System.out.println(p2.column());
		System.out.println(p2.row());
		System.out.println(p2.toString());
	}
}
