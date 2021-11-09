package com.example.computacaografica;

import com.example.computacaografica.AndGraphics.AGLayer;
import com.example.computacaografica.AndGraphics.AGScene;
import com.example.computacaografica.AndGraphics.AGSprite;

public class Cena extends AGScene {

    AGLayer camadaFundo = null;
    AGSprite personagem = null;

    @Override
    public void init() {

        personagem = createSprite(R.mipmap.personagem, 4,4);
        personagem.setScreenPercent(20,20);
        personagem.vrPosition.setX(getScreenWidth()/2);
        personagem.vrPosition.setY(personagem.getHeight()/2);
        personagem.addAnimation(1,true, 15);//0
        personagem.addAnimation(20,true, 15,14,13,12,11,10,9,8,7,6,5,4,3,2,12,0);//1

        camadaFundo = createLayer(R.mipmap.fundo, 512, 1024, 1,1);
        camadaFundo.setBrickScreenPercent(100,100);
        camadaFundo.setFrameIndex(0,0);
    }

    @Override
    public void stop() {

    }

    @Override
    public void restart() {

    }

    @Override
    public void loop() {
        camadaFundo.setSpeed(0,0);

        if (screenDown())
        {
            if (getLastTouchPosition().getX() > getScreenWidth() /2)
            {
                personagem.setCurrentAnimation(1);
                personagem.iMirror = AGSprite.HORIZONTAL;
                camadaFundo.setSpeed(-5,0);
            }
            else
            {
                personagem.setCurrentAnimation(1);
                personagem.iMirror = AGSprite.NONE;
                camadaFundo.setSpeed(5,0);

            }
        }
        else
        {
            personagem.setCurrentAnimation(0);
        }

        camadaFundo.scrollLayer();
    }
}
