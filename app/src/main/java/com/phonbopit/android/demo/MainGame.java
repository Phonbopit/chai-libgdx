package com.phonbopit.android.demo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by creatived on 2/19/14.
 */
public class MainGame extends Game implements ApplicationListener {
    @Override
    public void create() {

    }

    @Override
    public void resize(int i, int i2) {

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor( 0f, 1f, 0f, 1f );
        Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
