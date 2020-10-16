package com.qa.textrpg.world.entities;

//===[ Imports ]===
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//===[ 
@AllArgsConstructor
@Getter
@Setter
public class Chest extends MapObject implements Lockable {
	//-[ Class Variables ]-
	boolean locked;
	ArrayList<Object> contents; // TODO replace with game-items	
	Lock state;
	
	//-[ UID Constructor ]-
	public Chest(int uid) {
		super();
		this.uid = uid;
		this.collideable = true;
		this.name = "Chest";
		this.state = Lock.LOCKED;
	}
	
	//-[ Chest Methods ]-
	public String open() {
		switch(this.state) {
		case LOCKED:
			return "The chest is locked. You need a key to open it.";
		case UNLOCKED:
			return "The chest creaks as you open it.";
			// TODO loop through, describe items
		default:
			return "The chest is locked. You need a key to open it.";
		}
	}
	
	public String unlock() {
		switch(this.state) {
		case LOCKED:
			this.state = Lock.UNLOCKED;
			return "You hear a click as you turn the key. The chest is unlocked.";
		case UNLOCKED:
			return "The chest is already unlocked.";
		default:
			return "You hear a click as you turn the key. The chest is unlocked.";
		}
	}
	
	public String lock() {
		switch(this.state) {
		case LOCKED:
			return "The chest is already locked.";
		case UNLOCKED:
			this.state = Lock.LOCKED;
			return "You hear a click as you turn the key. The chest is unlocked.";
		default:
			this.state = Lock.LOCKED;
			return "You hear a click as you turn the key. The chest is unlocked.";
		}
	}
	
	public void take(int index) {
		// TODO implement this method
	}
	
	public void take(String itemName) {
		// TODO implement this method
	}
	
	public void takeAll() {
		// TODO implement this method
	}

	public Lock getLockState() {
		return state;
	}
	
	
	//-[ Override ]-
	@Override
	public String printIcon() {
		return "C";
	}
}
