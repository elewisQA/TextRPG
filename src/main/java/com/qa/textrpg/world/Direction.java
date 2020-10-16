package com.qa.textrpg.world;

public enum Direction {
	FORWARD,
	BACKWARD,
	LEFT,
	RIGHT
	;
	
	public static Direction match(String direction) {
		if (direction.equals("FORWARD")) {
			return Direction.FORWARD;
		} else if(direction.equals("BACKWARD")) {
			return Direction.BACKWARD;
		} else if(direction.equals("LEFT")) {
			return Direction.LEFT;
		} else if(direction.equals("RIGHT")) {
			return Direction.RIGHT;
		} else {
			return null;
		}
	}
}
