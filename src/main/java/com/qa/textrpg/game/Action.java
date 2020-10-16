package com.qa.textrpg.game;

public enum Action {
	WALK,
	DESCRIBE,
	UNLOCK,
	LOCK,
	OPEN,
	JUMP,
	QUIT
	;
	
	static Action match(String action) {
		switch(action) {
		case "WALK": 
			return Action.WALK;
		case "DESCRIBE":
			return Action.DESCRIBE;
		case "UNLOCK":
			return Action.UNLOCK;
		case "LOCK":
			return Action.LOCK;
		case "OPEN":
			return Action.OPEN;
		case "JUMP":
			return Action.JUMP;
		case "QUIT":
			return Action.QUIT;
		default:
			return null;
		}
	}
}
