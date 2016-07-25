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
		roll(20, 0);
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void canScoreGameOfOnes(){
		roll(20, 1);
		assertEquals(game.score(), 20);
	}
	
	@Test
	public void canScoreSpareFollowedByThree(){
		game.roll(5);
		game.roll(5);
		game.roll(3);
		roll(17, 1);
		assertEquals(game.score(), 16);
	}
	
	private void roll(int times, int pinsDown){
		for(int i=0; i<times; i++){
			game.roll(pinsDown);
		}
	}

	
}
