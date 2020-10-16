package com.qa.textrpg.game;

public enum Action {
	WALK,
	DESCRIBE,
	UNLOCK,
	LOCK,
	OPEN,
	JUMP,
	MAP,
	QUIT
	;
	
	static Action match(String action) {	
		if (action.equals("WALK")) {
			return Action.WALK;
		} else if (action.equals("DESCRIBE")) {
			return Action.DESCRIBE;
		} else if (action.equals("UNLOCK")) {
			return Action.UNLOCK;
		} else if (action.equals("LOCK")) {
			return Action.LOCK;
		} else if (action.equals("OPEN")) {
			return Action.OPEN;
		} else if (action.equals("JUMP")) {
			return Action.JUMP;
		} else if (action.equals("MAP")) {
			return Action.MAP;
		} else if (action.equals("QUIT")) {
			return Action.QUIT;
		} else {
			return null;
		}
	}
}
