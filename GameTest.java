import static org.junit.Assert.*;

import org.junit.Test;


public class GameTest {
	
	
	@Test
	public void canScoreGutterGame(){
		Game game = new Game();
		for(int i=0; i<20; i++){
			game.roll(0);
		}
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void canScoreGameOfOnes(){
		Game game = new Game();
		for(int i=0; i<20; i++){
			game.roll(1);
		}
		assertEquals(game.score(), 20);
	}

	
}
