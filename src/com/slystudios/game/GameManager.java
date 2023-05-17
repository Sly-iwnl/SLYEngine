package com.slystudios.game;

import java.util.ArrayList;

import com.slystudios.engine.AbstractGame;
import com.slystudios.engine.GameContainer;
import com.slystudios.engine.Renderer;
import com.slystudios.engine.gfx.Image;

public class GameManager extends AbstractGame {
	
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();

	public GameManager() {
		objects.add(new Player(2,2));
	}
	
	@Override
	public void init(GameContainer gc) {
		
	}

	@Override
	public void update(GameContainer gc, float dt) {
		for(int i = 0; i < objects.size(); i++) {
			objects.get(i).update(gc, this, dt);
			if(objects.get(i).isDead()) {
				objects.remove(i);
				i--;
			}
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		for(GameObject obj : objects) {
			obj.render(gc, r);
		}
	}

	public void loadLevel(String path) {
		
	}

	public static void main(String args[]) {
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}
}
