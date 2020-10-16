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
		
		// Propmpt User and await Input
		System.out.print(">");
		String input = in.nextLine().toUpperCase(); // Get input & cast to upper-case
		String[] commands = input.split("\s| ");
		
		nextAction = Action.match(commands[0]);
		if (commands.length > 1) {
			direction = Direction.match(commands[1]);
		}
		
		switch(nextAction) {
		case WALK: 
			game.walk(direction);
			break;
		case DESCRIBE:
			game.describe();
			break;
		case UNLOCK:
			game.unlock(direction);
			break;
		case LOCK:
			game.lock(direction);
			break;
		case OPEN:
			game.open(direction);
			break;
		case JUMP:
			game.jump();
			break;
		case QUIT:
			game.setLoop(false);
		}
	}
	
	public static void quit() {
		in.close();
	}
}
