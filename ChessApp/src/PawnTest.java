
public class PawnTest extends junit.framework.TestCase{
	public void testCreate(){
		
		final String firstColour = "white";
		final String secondColour = "black";
		Pawn pawn = new Pawn(firstColour);
		assertEquals(firstColour, pawn.getColour());
		
		Pawn pawn2 = new Pawn(secondColour);
		assertEquals(secondColour, pawn2.getColour());
	}

}
