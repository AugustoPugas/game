package com.example.computacaografica;

import android.os.Bundle;

import com.example.computacaografica.AndGraphics.AGActivityGame;

public class MainActivity extends AGActivityGame {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.init(this, false);
        this.addScene(new Cena());
    }
}