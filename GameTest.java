import org.junit.Test;


public class GameTest {
	
	@Test
	public void canMakeGame(){
		new Game();
	}
	
	@Test
	public void canRoll(){
		Game game = new Game();
		game.roll(0);
	}

	
}
