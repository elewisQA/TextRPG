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
			if (this.gameMap.validCoord(x, y + 1)) {
				if (!this.gameMap.getAt(x, y + 1, 0)
						.isCollideable()) {
					y++;
					return;
				}
			}
			System.out.println("Can't go that way!");
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				if (!this.gameMap.getAt(x, y - 1, 0)
						.isCollideable()) {
					y++;
					return;
				}
			}
			System.out.println("Can't go that way!");
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				if (!this.gameMap.getAt(x - 1, y, 0)
						.isCollideable()) {
					y++;
					return;
				}
			}
			System.out.println("Can't go that way!");
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				if (!this.gameMap.getAt(x + 1, y, 0)
						.isCollideable()) {
					y++;
					return;
				}
			}
			System.out.println("Can't go that way!");
		default:
			System.out.println("Can't do that!");
		}
	}
	
	public void describe() {
		
	}
	
	public void unlock(Direction dir) {
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				// TODO get object, check if lockable
			}
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				// TODO get object, check if lockable
			}
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				// TODO get object, check if lockable
			}
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				// TODO get object, check if lockable
			}
		default:
			System.out.println("Can't do that!");
		}
	}
	
	public void lock(Direction dir) {
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				// TODO get object, check if lockable
			}
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				// TODO get object, check if lockable
			}
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				// TODO get object, check if lockable
			}
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				// TODO get object, check if lockable
			}
		default:
			System.out.println("Can't do that!");
		}
	}
	
	public void open(Direction dir) {
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				
			}
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				
			}
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				
			}
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				
			}
		default:
			System.out.println("Can't do that!");
		}
	}
	
	public void jump() {
		System.out.println("You jump. It does nothing.");
	}
}
