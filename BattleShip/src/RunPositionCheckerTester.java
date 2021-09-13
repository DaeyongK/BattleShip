
public class RunPositionCheckerTester {
	//DO NOT CHANGE THIS METHOD. IF IT HAS ERRORS, FIX YOUR OWN CODE.
	public static void aliveness(){
		Position p1=new Position(0,0);
		Position p2=new Position('A',1);
		Position p3 = PositionChecker.checkPosition("");
	}

	public static void main(String[] args) {
		PositionCheckerTester pct = new PositionCheckerTester();
		pct.runTestCases();
	}

}
