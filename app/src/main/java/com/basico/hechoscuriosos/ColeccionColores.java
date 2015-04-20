package com.basico.hechoscuriosos;

import android.graphics.Color;

import java.util.Random;


public class ColeccionColores {

    public String[] mColores = {//agregamos este arreglo
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };

    public int ObtenerColor(){

        String mColor = "";

        Random genAlea = new Random();
        int numAlea = genAlea.nextInt(mColores.length);

        mColor = mColores [numAlea];

        int colorEntero = Color.parseColor(mColor);//funcion de la clase Color para q retorne el valor entero

        return colorEntero;
    }
}
