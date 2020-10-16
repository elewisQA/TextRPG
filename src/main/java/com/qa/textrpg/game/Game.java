package com.qa.textrpg.game;

import com.qa.textrpg.world.Map;

public class Game {
	//-[ Game Variables ]-
	private Map gameMap;
	private ActionListener listener;
	private int x, y; // Player

	//-[ Constructor ]-
	public Game() {
		gameMap = new Map();
	}
	
	//-[ Game Methods ]-
	
}
