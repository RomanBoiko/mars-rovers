package boikoro.marsrovers;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReversAcceptanceTest {

	@Test
	public void shouldProduceExpectedOutputOnTestScenarioWithTwoRovers() {
		String input = "5 5\n" +
						"1 2 N\n" +
						"LMLMLMLMM\n" +
						"3 3 E\n" +
						"MMRMMRMRRM";

		String expectedOutput = "1 3 N\n" +
								"5 1 E";
		
		assertThat(new MarsExpedition().getLendingResult(input), is(equalTo(expectedOutput)));
	}
}
