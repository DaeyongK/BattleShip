public class testerForBattleShip {
	public static void main(String args[]) {
		Position pos = new Position(6,3);
		System.out.println(pos.row());
		System.out.println(pos.column());
		System.out.println(pos.rowIndex());
		System.out.println(pos.columnIndex());
		System.out.println(pos.toString());
		Position pos1 = new Position('H',2);
		System.out.println(pos1.row());
		System.out.println(pos1.column());
		System.out.println(pos1.rowIndex());
		System.out.println(pos1.columnIndex());
		System.out.println(pos1.toString());
		Position pos2 = new Position();
		System.out.println(pos2.row());
		System.out.println(pos2.column());
		System.out.println(pos2.rowIndex());
		System.out.println(pos2.columnIndex());
		System.out.println(pos2.toString());
		Position pos3 = new Position('K',8);
		System.out.println(pos3.row());
		System.out.println(pos3.column());
		System.out.println(pos3.rowIndex());
		System.out.println(pos3.columnIndex());
		System.out.println(pos3.toString());
	}
}
