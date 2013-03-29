package boikoro.marsrovers;

import static boikoro.marsrovers.Step.LEFT;
import static boikoro.marsrovers.Step.RIGHT;
import static java.lang.String.format;

public enum Direction {
	NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
	
	private final String directionShortcut;

	private Direction(String directionShortcut) {
		this.directionShortcut = directionShortcut; 
	}

	public String toString() {
		return directionShortcut;
	}
	
	public static Direction fromString(String shortcut) {
		for(Direction direction: values()) {
			if(direction.directionShortcut.equals(shortcut)) {
				return direction;
			}
		}
		throw new IllegalArgumentException(format("Invalid direction given: %s", shortcut));
	}

	public static Direction turnDirection(Direction from, Step step) {
		if(step.equals(RIGHT)) {
			switch(from) {
				case NORTH: { return EAST; }
				case EAST: { return SOUTH; }
				case SOUTH: { return WEST; }
				case WEST: { return NORTH; }
			}
		} else if (step.equals(LEFT)) {
			switch(from) {
				case NORTH: { return WEST; }
				case EAST: { return NORTH; }
				case SOUTH: { return EAST; }
				case WEST: { return SOUTH; }
			}
		}
		throw new IllegalArgumentException(format("Invalid turn: from %s using %s", from, step));
	}
}
