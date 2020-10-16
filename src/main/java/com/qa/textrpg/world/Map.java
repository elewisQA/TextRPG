package com.qa.textrpg.world;

import java.util.ArrayList;
import java.util.List;

import com.qa.textrpg.world.entities.MapObject;

//===[ Map Definition ]===
public class Map {
	//-[ Map Variables ]-
	private List<List<List<MapObject>>> worldGrid; // X and Y coordinates, with list of objects that may be stacked atop-each-other
	
	//-[ Map Constructor ]-
	
	
	//-[ Map Methods ]-
	// Specific Coordinate Methods
	public MapObject getAt(int x, int y, int z) {
		return worldGrid.get(x).get(y).get(z);
	}
	
	public List<MapObject> getAt(int x, int y) {
		return worldGrid.get(x).get(y);
	}
	
	public void setAt(int x, int y, int z, MapObject object) {
		worldGrid.get(x).get(y).set(z, object);
	}
	
	public void setAt(int x, int y, MapObject object) {
		List<MapObject> newObject = new ArrayList<MapObject>();
		newObject.add(object);
		worldGrid.get(x).set(y, newObject);
	}
}
