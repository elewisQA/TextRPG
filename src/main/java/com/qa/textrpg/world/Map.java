package com.qa.textrpg.world;

import java.util.ArrayList;
import java.util.List;

import com.qa.textrpg.world.entities.MapObject;

import lombok.Getter;

//===[ Map Definition ]===
@Getter
public class Map {
	//-[ Map Variables ]-
	private List<List<List<MapObject>>> worldGrid; // X and Y coordinates, with list of objects that may be stacked atop-each-other
	private int width, height;
	
	//-[ Map Constructor ]-
	public Map() {
		worldGrid = new ArrayList<List<List<MapObject>>>();
		
		// Make a 10x10 Map
		for (int x = 0; x < 10; x++) {
			ArrayList<List<MapObject>> column = new ArrayList<List<MapObject>>();
			for (int y = 0; y < 10; y++) {
				List<MapObject> itemStack = new ArrayList<MapObject>();
				itemStack.add(null);
				column.add(itemStack);
			}
			this.worldGrid.add(column);
		}	
		
		
		this.width = 10;
		this.height = 10;
	}
	
	public Map(List<List<List<MapObject>>> worldGrid) {
		this.worldGrid = worldGrid;
		this.width = this.worldGrid.size();
		this.height = this.worldGrid.get(0).size();
	}
	
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
	
	public boolean validCoord(int x, int y) {
		if (x < 0 || x > this.width) {
			return false;
		}
		if (y < 0 || y > this.height) {
			return false;
		}
		return true;
	}
}
