package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class coolgame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("D:\\testgame\\Assets\\ArrowNeutral.png");
		sprite = new Sprite(img);
		sprite.setPosition(
				Gdx.graphics.getWidth()/2 - sprite.getWidth()/2,
				Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);
		sprite.setRotation(90f);

	}

	@Override
	public void render () {
	if (Gdx.input.isKeyPressed(Input.Keys.A))
		sprite.translateX(-7f);
	if (Gdx.input.isKeyPressed(Input.Keys.D))
		sprite.translateX(7f);
	if (Gdx.input.isKeyPressed(Input.Keys.W))
		sprite.translateY(7f);
	if (Gdx.input.isKeyPressed(Input.Keys.S))
		sprite.translateY(-7f);

		ScreenUtils.clear(0, 1, 1, 1);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY(), 0, 0, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(),
				sprite.getScaleY(), sprite.getRotation());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
