package boikoro.marsrovers;

public class Rover {

	private Position currentPosition;

	public Rover(Position initialPosition) {
		this.currentPosition = initialPosition;
	}

	public Position getCurrentPosition() {
		return currentPosition.getCopy();
	}

	public void move(String step) {
		currentPosition = currentPosition.nextPosition(step);
	}
}
