package com.cal.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.cal.game.entity.Entity;
import com.cal.game.entity.MainCharacter;
import com.cal.game.input.InputHandler;
import com.cal.game.level.Layer;
import com.cal.game.level.Level;
import com.cal.game.level.Platform;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Stage stage;
	Level level;
	Layer frontLayer;
	Layer backLayer;
	MainCharacter e;
	Platform p, p2, p3;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		level = new Level("Levels/testlevel.xml");
		/**frontLayer = new Layer();
		backLayer = new Layer();
		frontLayer.otherLayer = backLayer;
		backLayer.otherLayer = frontLayer;
		stage.addActor(backLayer);
		stage.addActor(frontLayer);

		e = new MainCharacter(200, 200);
		p = new Platform(100, 100, 200, 30);
		p2 = new Platform(200, 175, 200, 30);
		p3 = new Platform(300, 250, 200, 30);
		frontLayer.addActor(p);
		backLayer.addActor(p2);
		frontLayer.addActor(p3);
		frontLayer.addActor(e);
		backLayer.addActor(e.indicator);
		frontLayer.isCurrentLayer = true;
		backLayer.isBackLayer = true;*/
	}

	@Override
	public void render () {
		level.act(Gdx.graphics.getDeltaTime());

		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		level.draw();
	}
}
