package com.qa.textrpg.game;

//===[ Imports ]===
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.qa.textrpg.world.entities.*;

//===[ Generator Method ]===
public class MapGenerator {
	static void generate() throws IOException {
		int uid = 0;
		
		// Load an Image from files
		BufferedImage mapImage = null;
		mapImage = ImageIO.read(new File("resources/map.png"));
		
		// Read-Pixels from Image - RGB Values all merged into one
        int[][] pixelArray = new int[mapImage.getWidth()][mapImage.getHeight()];
        for (int w = 0; w < mapImage.getWidth(); w++) {
            for (int h = 0; h < mapImage.getHeight(); h++) {
                pixelArray[w][h] = mapImage.getRGB(w, h);
            }
        }
        
        List<List<List<MapObject>>> mapGrid = new ArrayList<List<List<MapObject>>>();
        for (int x = 0; x < pixelArray.length; x++) {
        	List<List<MapObject>> column = new ArrayList<List<MapObject>>();
        	for (int y = 0; y < pixelArray[x].length; y++) {
        		List<MapObject> objectStack = new ArrayList<MapObject>();
        		if (pixelArray[x][y] == -65536) {
        			// Red (R: 255 G: 0 B: 0)
        			// Add a tree
        			objectStack.add(new Tree(uid));
        			uid++;
        		} else if(pixelArray[x][y] == -16777216) {
        			// Black (R: 0 G: 0 B: 0)
        			// Add a Hedge
        			objectStack.add(new Hedge(uid));
        		} else if(pixelArray[x][y] == -6282368) {
        			// Purple (R: 160 G: 35 B: 128)
        			// Add a Chest
        			objectStack.add(new Chest(uid));
        		} else {
        			objectStack.add(null);
        		}
        		column.add(objectStack);
        	}
        	mapGrid.add(column);
        }
	}
}
