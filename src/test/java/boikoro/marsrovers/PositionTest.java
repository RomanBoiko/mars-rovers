package boikoro.marsrovers;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PositionTest {

	@Test
	public void shouldEqualToPositionWithSameCoordinatesAndDirection() {
		Position position1 = new Position(1, 2, "N");
		Position position2 = new Position(1, 2, "N");
		assertThat(position1, is(equalTo(position2)));
	}
	
	@Test
	public void shouldNotEqualToPositionWithDifferentCoordinates() {
		Position position1 = new Position(1, 2, "N");
		Position position2 = new Position(1, 3, "N");
		assertThat(position1, is(not(equalTo(position2))));
	}
	
	@Test
	public void shouldNotEqualToPositionWithSameCoordinatesButDifferentDirection() {
		Position position1 = new Position(1, 2, "N");
		Position position2 = new Position(1, 2, "S");
		assertThat(position1, is(not(equalTo(position2))));
	}
	
	@Test
	public void shouldEqualToItself() {
		Position position = new Position(1, 2, "N");
		assertThat(position, is(equalTo(position)));
	}
}
