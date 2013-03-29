package boikoro.marsrovers;

public class Direction {
	public static final String NORTH = "N";
	public static final String EAST = "E";
	public static final String SOUTH = "S";
	public static final String WEST = "W";
	
	public static String turnDirection(String from, String step) {
		if(from.equals(NORTH)) {
			if(step.equals(Step.RIGHT)) {
				return EAST;
			} else {
				return WEST; 
			}
		}
		if(from.equals(EAST)) {
			if(step.equals(Step.RIGHT)) {
				return SOUTH;
			} else {
				return NORTH; 
			}
		}
		if(from.equals(SOUTH)) {
			if(step.equals(Step.RIGHT)) {
				return WEST; 
			} else {
				return EAST;
			}
		}
		if(from.equals(WEST)) {
			if(step.equals(Step.RIGHT)) {
				return NORTH;
			} else {
				return SOUTH; 
			}
		}
		return SOUTH;
	}

}
