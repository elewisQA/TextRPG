package com.qa.textrpg.world.entities;

import lombok.Getter;

//===[ Object Definition ]===
@Getter
public abstract class MapObject {
	//-[ Object Variables ]-
	boolean collideable;
	int uid;
	String name;
}
