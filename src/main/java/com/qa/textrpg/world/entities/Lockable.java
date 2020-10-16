package com.qa.textrpg.world.entities;

public interface Lockable {
	String open();
	String unlock();
	String lock();
	Lock getLockState();
}
