package boikoro.marsrovers;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoverTest {

	@Test
	public void shouldBeAbleToSetInitialPositionViaConstructor() {
		Position initialPosition = new Position(1, 2, "N");
		Rover rover = new Rover(initialPosition);
		Position currentPosition = rover.getCurrentPosition();
		assertThat(currentPosition, is(equalTo(initialPosition)));
	}
}
