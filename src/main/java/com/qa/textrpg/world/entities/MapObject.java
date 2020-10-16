package com.qa.textrpg.world.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;

//===[ Object Definition ]===
@Getter
@EqualsAndHashCode
public abstract class MapObject {
	//-[ Object Variables ]-
	boolean collideable;
	int uid;
	String name;
	
	public String printIcon() {
		return "O";
	}
}
