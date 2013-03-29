package boikoro.marsrovers;

import static boikoro.marsrovers.Direction.EAST;
import static boikoro.marsrovers.Direction.NORTH;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoverSystemTest {

	@Test
	public void shouldNotChangeDirectionAfterMove() {
		String initialDirection = NORTH;
		Position initialPosition = new Position(1, 2, initialDirection);
		Rover rover = new Rover(initialPosition);
		rover.move("M");
		Position currentPosition = rover.getCurrentPosition();
		assertThat(currentPosition.direction(), is(equalTo(initialDirection)));
	}

	@Test
	public void shouldChangeDirectionAfterTurn() {
		String initialDirection = NORTH;
		Position initialPosition = new Position(1, 2, initialDirection);
		Rover rover = new Rover(initialPosition);
		rover.move("R");
		Position currentPosition = rover.getCurrentPosition();
		assertThat(currentPosition.direction(), is(equalTo(EAST)));
	}
}
