package boikoro.marsrovers;

import static boikoro.marsrovers.Direction.NORTH;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class RoverTest {

	@Test
	public void shouldBeAbleToSetInitialPositionViaConstructor() {
		Position initialPosition = new Position(1, 2, NORTH);
		Rover rover = new Rover(initialPosition);
		Position currentPosition = rover.getCurrentPosition();
		assertThat(currentPosition, is(equalTo(initialPosition)));
	}

	@Test
	public void shouldMoveToPositionNextToCurrentAccordingToStepValue() {
		String step = "M";
		Position initialPosition = mock(Position.class);
		Position targetPosition = new Position(1, 2, Direction.NORTH);
		when(initialPosition.nextPosition(step)).thenReturn(targetPosition);
		Rover rover = new Rover(initialPosition);
		rover.move(step);
		verify(initialPosition).nextPosition(step);
		assertThat(rover.getCurrentPosition(), is(equalTo(targetPosition)));
	}
}
