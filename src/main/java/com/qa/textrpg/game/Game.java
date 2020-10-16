package com.qa.textrpg.game;

import com.qa.textrpg.world.Direction;
import com.qa.textrpg.world.Map;
import com.qa.textrpg.world.entities.Chest;
import com.qa.textrpg.world.entities.MapObject;

import lombok.Getter;

@Getter
public class Game {
	//-[ Game Variables ]-
	private int x, y; // PLAYER COORDINATES
	private Map gameMap;
	private boolean loop;
	Action nextAction;
	Direction nextDirection;

	//-[ Constructor ]-
	public Game() {
		try {
			this.gameMap = new Map(
					MapGenerator.generate());
			ActionListener.initialize();
			loop = true;
		} catch (Exception e) {
			loop = false;
			System.out.println("A fatal error occured");
		}	
			this.x = 0;
			this.y = 0;
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
		MapObject ahead;
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				ahead = this.gameMap.getAt(x, y + 1, 0);
				if (ahead != null) {
					if (ahead.isCollideable()) {
						System.out.println("Can't go that way! [1]");
						break;
					}
				} else {
					System.out.println("You take a step forward.");
					y++;
					return;
				}
			}
			System.out.println("Can't go that way! [2]");
			break;
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				ahead = this.gameMap.getAt(x, y - 1, 0);
				if (ahead != null) {
					if (ahead.isCollideable()) {
						System.out.println("Can't go that way! [1]");
						break;
					}
				} else {
					System.out.println("You take a step backwards.");
					y--;
					return;
				}
			}
			System.out.println("Can't go that way! [2]");
			break;
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				ahead = this.gameMap.getAt(x - 1, y, 0);
				if (ahead != null) {
					if (ahead.isCollideable()) {
						System.out.println("Can't go that way! [1]");
						break;
					}
				} else {
					System.out.println("You take a step left.");
					x--;
					return;	
				}
			}
			System.out.println("Can't go that way! [2]");
			break;
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				ahead = this.gameMap.getAt(x + 1, y, 0);
				if (ahead != null) {
					if (ahead.isCollideable()) {
						System.out.println("Can't go that way! [1]");
						break;
					}
				} else {
					System.out.println("You take a step right.");
					x++;
					return;	
				}
			}
			System.out.println("Can't go that way! [2]");
			break;
		default:
			System.out.println("Can't do that! [err]");
		}
	}
	
	public void describe() {
		
	}
	
	public void unlock(Direction dir) {
		MapObject toUnlock;
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				toUnlock = this.gameMap.getAt(x, y + 1, 0);
				break;
			}
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				toUnlock = this.gameMap.getAt(x, y - 1, 0);
				break;
			}
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				toUnlock = this.gameMap.getAt(x - 1, y, 0);
				break;
			}
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				toUnlock = this.gameMap.getAt(x + 1, y, 0);
				break;
			}
		default:
			toUnlock = null;
		}
		
		if (toUnlock instanceof Chest) {
			System.out.println(((Chest) toUnlock).unlock());
		} else if(toUnlock == null) {
			System.out.println("Nothing there to unlock!");
		} else {
			System.out.println("Can't do that! Not lockable entity!");
		}
	}
	
	public void lock(Direction dir) {
		MapObject toLock;
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				toLock = this.gameMap.getAt(x, y + 1, 0);
				break;
			}
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				toLock = this.gameMap.getAt(x, y - 1, 0);
				break;
			}
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				toLock = this.gameMap.getAt(x - 1, y, 0);
				break;
			}
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				toLock = this.gameMap.getAt(x + 1, y, 0);
				break;
			}
		default:
			toLock = null;
		}
		
		if (toLock instanceof Chest) {
			System.out.println(((Chest) toLock).lock());
		} else if(toLock == null) {
			System.out.println("Nothing there to lock!");
		} else {
			System.out.println("Can't do that! Not lockable entity!");
		}
	}
	
	public void open(Direction dir) {
		MapObject toOpen;
		switch(dir) {
		case FORWARD:
			if (this.gameMap.validCoord(x, y + 1)) {
				toOpen = this.gameMap.getAt(x, y + 1, 0);
				break;
			}
		case BACKWARD:
			if (this.gameMap.validCoord(x, y - 1)) {
				toOpen = this.gameMap.getAt(x, y - 1, 0);
				break;
			}
		case LEFT:
			if (this.gameMap.validCoord(x - 1, y)) {
				toOpen = this.gameMap.getAt(x - 1, y, 0);
				break;
			}
		case RIGHT:
			if (this.gameMap.validCoord(x + 1, y)) {
				toOpen = this.gameMap.getAt(x + 1, y, 0);
				break;
			}
		default:
			toOpen = null;
		}
		
		if (toOpen instanceof Chest) {
			System.out.println(((Chest) toOpen).open());
		} else if(toOpen == null) {
			System.out.println("Nothing there to open!");
		} else {
			System.out.println("Can't do that! Not lockable entity!");
		}
	}
	
	public void jump() {
		System.out.println("You jump. It does nothing.");
	}
}
