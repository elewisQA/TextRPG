package com.qa.textrpg.world.entities;

//===[ Imports ]===
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

//===[ Hedge Definition ]===
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Hedge extends MapObject {

	//-[ UID Constructor ]-
	public Hedge(int uid) {
		super();
		this.collideable = false;
		this.uid = uid;
		this.name = "Hedge";
	}
	
	
	//-[ Override ]-
	@Override
	public String printIcon() {
		return "H";
	}
}
