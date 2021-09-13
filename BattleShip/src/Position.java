import java.util.Scanner;

public class Position {
	private char letter;
	private int number;
	public Position(char let, int num) {
		if((let=='A'||let=='B'||let=='C'||let=='D'||let=='E'||
		let=='F'||let=='G'||let=='H'||let=='I'||let=='J') &&
		(num==1||num==2||num==3||num==4||num==5||num==6
		||num==7||num==8||num==9||num==10)) {
			letter = let;
			number = num;
		} else {
			letter = 'Z';
			number = 0;
		}
	}
	public Position(int rowInd, int colInd) {
		if(rowInd==0) {
			letter = 'A';
		} else if (rowInd==1) {
			letter = 'B';
		} else if (rowInd==2) {
			letter = 'C';
		} else if (rowInd==3) {
			letter = 'D';
		} else if (rowInd==4) {
			letter = 'E';
		} else if (rowInd==5) {
			letter = 'F';
		} else if (rowInd==6) {
			letter = 'G';
		} else if (rowInd==7) {
			letter = 'H';
		} else if (rowInd==8) {
			letter = 'I';
		} else if (rowInd==9) {
			letter = 'J';
		} else {
			letter = 'Z';
		}
		if(colInd>=0 && colInd<=9) {
			number = colInd + 1;
		} else {
			number = 0;
		}
	}
	public Position() {
		Scanner sc = new Scanner(System.in);
		Position pos = PositionChecker.checkPosition(sc.nextLine());
		letter = pos.letter;
		number = pos.number;
	}
	public char row() {
		return Character.toUpperCase(letter);
	}
	public int column() {
		return number;
	}
	public int rowIndex() {
		if(row()=='A') {
			return 0;
		} else if(row()=='B') { 
			return 1;
		} else if(row()=='C') { 
			return 2;
		} else if(row()=='D') { 
			return 3;
		} else if(row()=='E') { 
			return 4;
		} else if(row()=='F') { 
			return 5;
		} else if(row()=='G') { 
			return 6;
		} else if(row()=='H') { 
			return 7;
		} else if(row()=='I') { 
			return 8;
		} else if(row()=='J') { 
			return 9;
		} else {
			return -1;
		}
	}
	public int columnIndex() {
		return column()-1;
	}
	public String toString() {
		return row()+"-"+column();
	}
}
