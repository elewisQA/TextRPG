package com.qa.textrpg.world;

import java.util.List;

import com.qa.textrpg.world.entities.MapObject;

//===[ Map Definition ]===
public class Map {
	//-[ Map Variables ]-
	private List<List<MapObject>> worldGrid;
	
	//-[ Map Constructor ]-
	
	
	//-[ Map Methods ]-
	// Modifiers
	public MapObject getAt(int x, int y) {
		return worldGrid.get(x).get(y);
	}
	
	public void setAt(int x, int y, MapObject object) {
		worldGrid.get(x).set(y, object);
	}
}
