package com.qa.textrpg.game;

import com.qa.textrpg.world.Direction;
import com.qa.textrpg.world.Map;

public class Game {
	//-[ Game Variables ]-
	private int x, y; // PLAYER COORDINATES
	private Map gameMap;
	private boolean loop;
	Action nextAction;
	Direction nextDirection;

	//-[ Constructor ]-
	public Game() {
		this.gameMap = new Map();
		ActionListener.initialize();
		// TODO set player-coords
		start();
	}
	
	//-[ Game Loop ]-
	private void start() {
		String[] commands;
		while(loop) {
			// Get Next Action from user-input
			ActionListener.nextAction(this);
		}
		ActionListener.quit();
		System.out.println("Loop terminated..");
	}
	
	public void setLoop(boolean loop) {
		this.loop = loop;
	}
	
	// Game Commands
	public void walk(Direction dir) {
		switch(dir) {
		case FORWARD:
			// TODO check object in-front
		case BACKWARD:
			// TODO check object behind
		case LEFT:
			// TODO check object to the left
		case RIGHT:
			// TODO check object to the right
		default:
			System.out.println("Can't do that!");
		}
	}
	
	public void describe() {
		
	}
	
	public void unlock(Direction dir) {
		
	}
	
	public void lock(Direction dir) {
		
	}
	
	public void open(Direction dir) {
		
	}
	
	public void jump() {
		System.out.println("You jump. It does nothing.");
	}
}
