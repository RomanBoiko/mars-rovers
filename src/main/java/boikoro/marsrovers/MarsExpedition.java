package boikoro.marsrovers;

import static java.lang.Integer.parseInt;


public class MarsExpedition {

	public String getLendingResult(String input) {
		StringBuffer output = new StringBuffer();
		String[] inputLines = input.trim().split("[\r]?\n");
//		String[] plateauSizeCoordinates = inputLines[0].split("\\s");
//		Point plateauLimitNorthEastPoint = new Point(parseInt(plateauSizeCoordinates[0]), parseInt(plateauSizeCoordinates[1]));
		for (Integer i = 1; i<= (inputLines.length-2); i=i+2) {
			String[] initialPositionCoordinates = inputLines[i].split("\\s");
			int xPosition = parseInt(initialPositionCoordinates[0]);
			int yPosition = parseInt(initialPositionCoordinates[1]);
			String direction = initialPositionCoordinates[2].trim();
			Rover rover = new Rover(new Position(xPosition, yPosition, Direction.fromString(direction)));
			for (char step : inputLines[i+1].toCharArray()) {
				rover.move(Step.fromString(Character.toString(step)));
			}
			output.append(rover.getCurrentPosition().toString()).append("\n");
		}
		return output.toString().trim();
	}

}
