public class PositionChecker {
	public static Position checkPosition(String inputPos) {
		Position pos;
		char let = Character.toUpperCase(inputPos.charAt(0));
		if(inputPos.charAt(1)=='-') {
			if((inputPos.substring(2).equals("1")||inputPos.substring(2).equals("2")||inputPos.substring(2).equals("3")
			||inputPos.substring(2).equals("4")||inputPos.substring(2).equals("5")||inputPos.substring(2).equals("6")
			||inputPos.substring(2).equals("7")||inputPos.substring(2).equals("8")||inputPos.substring(2).equals("9")
			||inputPos.substring(2).equals("10")) && (let=='A'||let=='B'||let=='C'||let=='D'||let=='E'||let=='F'
			||let=='G'||let=='H'||let=='I'||let=='J')) {
				pos = new Position(let, Integer.parseInt(inputPos.substring(2)));
			} else {
				pos = new Position('Z', 0);
			}
		} else {
			pos = new Position('Z', 0);
		}
		return pos;
	}
}
