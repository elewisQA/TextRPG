package com.qa.textrpg.world;

public enum Direction {
	FORWARD,
	BACKWARD,
	LEFT,
	RIGHT
	;
	
	public static Direction match(String direction) {
		switch (direction) {
		case "FORWARD": 
			return Direction.FORWARD;
		case "BACKWARD":
			return Direction.BACKWARD;
		case "LEFT":
			return Direction.LEFT;
		case "RIGHT": 
			return Direction.RIGHT;
		default:
			return null;
		}
	}
}
