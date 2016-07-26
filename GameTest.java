import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GameTest {
	
	private Game game;
	
	@Before
	public void setUp(){
		game = new Game();
	}
	
	@Test
	public void canScoreGutterGame(){
		game.roll( 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 );
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void canScoreGameOfOnes(){
		game.roll( 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1 );
		assertEquals(game.score(), 20);
	}
	
	@Test
	public void canScoreSpareFollowedByThree(){
		game.roll( 5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0 );
		assertEquals(game.score(), 16);
	}
	


	
}
