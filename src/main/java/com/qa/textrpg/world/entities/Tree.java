package com.qa.textrpg.world.entities;

//===[ Imports ]===
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

//===[ Tree Definition ]===
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Tree extends MapObject {
	
	//-[ UID Constructor ]-
	public Tree(int uid) {
		super();
		this.collideable = true;
		this.uid = uid;
		this.name = "Tree";
	}
	
	//-[ Override ]-
	@Override
	public String printIcon() {
		return "T";
	}
}
