package com.qa.textrpg.game;

import java.util.Scanner;

import com.qa.textrpg.world.Direction;

public class ActionListener {
	static Scanner in;
	
	public static void initialize() {
		in = new Scanner(System.in);	
	}
	
	public static void nextAction(Game game) {
		// Temp Vars
		Action nextAction = null;
		Direction direction = null;
		String input = "";
		
		// Propmpt User and await Input
		while (input.length() <= 0) { 
			System.out.print(">");
			input = in.nextLine()
					.toUpperCase(); // Get input & cast to upper-case
		}
		
		String[] commands = input.split("\s| ");
		nextAction = Action.match(commands[0]);
		if (commands.length > 1) {
			direction = Direction.match(commands[1]);
		}
		
		if (nextAction == null) {
			System.out.println("Not a valid command!");
			return;
		}
		
		switch(nextAction) {
		case WALK: 
			if (direction != null) {
				game.walk(direction);
			} else {
				System.out.println("Please enter a direction to walk in.");
			}		
			break;
		case DESCRIBE:
			game.describe();
			break;
		case UNLOCK:
			if (direction != null) {
				game.unlock(direction);
			} else {
				System.out.println("Please specify where to unlock. i.e: 'unlock left'");
			}
			break;
		case LOCK:
			if (direction != null) {
				game.lock(direction);
			} else {
				System.out.println("Please specify where to lock. i.e: 'lock left'");
			}
			break;
		case OPEN:
			if (direction != null) {
				game.open(direction);
			}
			 else {
					System.out.println("Please specify where to open. i.e: 'open left'");
				}
			break;
		case JUMP:
			game.jump();
			break;
		case MAP:
			game.getGameMap().printMap(
					game.getX(),
					game.getY());
			break;
		case QUIT:
			game.setLoop(false);
		}
	}
	
	public static void quit() {
		in.close();
	}
}
