package com.workintech.enums;

public enum PaintColor {
    BlUE(0),
    PURPLE(1),
    GREEN(2),
    WHITE(2);
    private int colorCode;

    PaintColor(int colorCode) {
        this.colorCode = colorCode;
    }
}
