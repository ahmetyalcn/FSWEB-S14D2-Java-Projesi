package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create(){
        System.out.println("Ceiling with "+ height +" and color with " + paintedColor + " has been created");
    }

}
