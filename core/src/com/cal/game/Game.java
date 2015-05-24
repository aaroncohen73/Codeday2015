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
import com.cal.game.level.Platform;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Stage stage;
	Layer frontLayer;
	Layer backLayer;
	MainCharacter e;
	Platform p;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		stage = new Stage(new StretchViewport(640, 480));
		frontLayer = new Layer();
		backLayer = new Layer();
		stage.addActor(frontLayer);
		stage.addActor(backLayer);

		e = new MainCharacter();
		p = new Platform(100, 100, 200, 30);

		Gdx.input.setInputProcessor(new InputHandler(e));
	}

	@Override
	public void render () {
		stage.act(Gdx.graphics.getDeltaTime());

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}
}
