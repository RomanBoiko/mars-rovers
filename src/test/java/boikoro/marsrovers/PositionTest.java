package boikoro.marsrovers;

import static boikoro.marsrovers.Direction.NORTH;
import static boikoro.marsrovers.Direction.SOUTH;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PositionTest {

	@Test
	public void shouldEqualToPositionWithSameCoordinatesAndDirection() {
		Position position1 = new Position(1, 2, NORTH);
		Position position2 = new Position(1, 2, NORTH);
		assertThat(position1, is(equalTo(position2)));
	}
	
	@Test
	public void shouldNotEqualToPositionWithDifferentCoordinates() {
		Position position1 = new Position(1, 2, NORTH);
		Position position2 = new Position(1, 3, NORTH);
		assertThat(position1, is(not(equalTo(position2))));
	}
	
	@Test
	public void shouldNotEqualToPositionWithSameCoordinatesButDifferentDirection() {
		Position position1 = new Position(1, 2, NORTH);
		Position position2 = new Position(1, 2, SOUTH);
		assertThat(position1, is(not(equalTo(position2))));
	}
	
	@Test
	public void shouldEqualToItself() {
		Position position = new Position(1, 2, NORTH);
		assertThat(position, is(equalTo(position)));
	}

	@Test
	public void shouldGenerateCopyOfItselfWhichIsNotAReferenceToSameObject() {
		Position position = new Position(1, 2, NORTH);
		Position copyOfPosition = position.getCopy();
		assertNotSame(position, copyOfPosition);
	}

	@Test
	public void shouldGenerateEqualCopyOfItself() {
		Position position = new Position(1, 2, NORTH);
		Position copyOfPosition = position.getCopy();
		assertThat(position, is(equalTo(copyOfPosition)));
	}

	@Test
	public void shouldProvideToStringWhichWillShowStateOfPosition() {
		Position position = new Position(1, 2, NORTH);
		assertEquals("1 2 N", position.toString());
	}
}
