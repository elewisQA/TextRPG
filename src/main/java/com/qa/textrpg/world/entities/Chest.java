package com.qa.textrpg.world.entities;

//===[ Imports ]===
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//===[ 
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Chest extends MapObject{
	//-[ Chest State ]-
	enum State {
		LOCKED,
		UNLOCKED,
		OPEN
	
	}
	//-[ Class Variables ]-
	boolean locked;
	ArrayList<Object> contents; // TODO replace with game-items
	State state;
	
	
	
	//-[ UID Constructor ]-
	public Chest(int uid) {
		super();
		this.uid = uid;
		this.collideable = true;
		this.name = "Chest";
		this.state = State.LOCKED;
	}
	
	//-[ Chest Methods ]-
	public String open() {
		switch(this.state) {
		case LOCKED:
			return "The chest is locked. You need a key to open it.";
		case UNLOCKED:
			return "The chest creaks as you open it.";
		case OPEN:
			return "The chest is already open.";
		default:
			return "The chest is locked. You need a key to open it.";
		}
	}
	
	public String unlock() {
		switch(this.state) {
		case LOCKED:
			this.state = State.UNLOCKED;
			return "You hear a click as you turn the key. The chest is unlocked.";
		case UNLOCKED:
			return "The chest is already unlocked.";
		case OPEN:
			return "The chest is already open.";
		default:
			return "You hear a click as you turn the key. The chest is unlocked.";
		}
	}
	
	public void take() {
		// TODO implement this method
	}
	
	public void takeAll() {
		// TODO implement this method
	}
}
