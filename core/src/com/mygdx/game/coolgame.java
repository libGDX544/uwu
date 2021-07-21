package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class coolgame extends ApplicationAdapter implements InputProcessor {
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	Texture uwu;
	Sprite sprite1;
	boolean movingRight = false;
	boolean movingLeft = false;
	boolean movingUp = false;
	boolean movingDown = false;



	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("D:\\testgame\\Assets\\ArrowUp.png");
		uwu = new Texture("D:\\testgame\\Assets\\ArrowDown.png");
		sprite = new Sprite(img);
		sprite1 = new Sprite(uwu);
		sprite.setPosition(
				Gdx.graphics.getWidth()/2 - sprite.getWidth()/2,
				Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);
		sprite.setRotation(0f);
		sprite1.setPosition(0, 0);

	}

	@Override
	public void render () {

		if (movingRight)
			sprite.translateX(7f);
		if(movingLeft)
			sprite.translateX(-7f);
		if(movingUp)
			sprite.translateY(7f);
		if(movingDown)
			sprite.translateY(-7f);
		ScreenUtils.clear(0, 1, 1, 1);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY(),0,0, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(),
		sprite.getScaleY(),sprite.getRotation());
		batch.draw(sprite1, sprite1.getX(), sprite1.getY(),0,0, sprite1.getWidth(), sprite1.getHeight(), sprite1.getScaleX(),
				sprite1.getScaleY(), sprite1.getRotation());

		Gdx.input.setInputProcessor(this);
		batch.end();




	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		if(keycode ==Input.Keys.A)
			movingLeft = true;

		if(keycode ==Input.Keys.D)
			movingRight = true;

		if (keycode == Input.Keys.W)
			movingUp = true;

		if(keycode == Input.Keys.S)
			movingDown = true;
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		if(keycode == Input.Keys.D)
			movingRight = false;
		if(keycode == Input.Keys.A)
			movingLeft = false;
		if(keycode == Input.Keys.W)
			movingUp = false;
		if(keycode == Input.Keys.S)
			movingDown = false;


		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}
}
