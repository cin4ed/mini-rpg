package com.ids.proyecto_final;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class MiniRpg extends Game {

    public SpriteBatch batch;
    private FreeTypeFontGenerator fontGenerator;
    private FreeTypeFontGenerator.FreeTypeFontParameter fontParameter;
    public BitmapFont font;
    private MainMenuScreen gameScreen;

    @Override
    public void create() {
        batch = new SpriteBatch();

        // font loading and configuration
        fontGenerator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/scientifica.ttf"));
        fontParameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        fontParameter.size = 100;
//        fontParameter.borderWidth = 5;
//        fontParameter.borderColor = Color.BLACK;
        fontParameter.color = Color.BLACK;
        font = fontGenerator.generateFont(fontParameter);

        this.gameScreen = new MainMenuScreen(this);
        this.setScreen(gameScreen);
    }

    public void render() {
        super.render();
    }

    public void dispose() {
        batch.dispose();
        font.dispose();
    }
}
