package com.workintech.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Style: "+style+"\n");
        builder.append("Pillows: "+pillows+"\n");
        builder.append("Height: "+height+"\n");
        builder.append("Sheets: "+sheets+"\n");
        builder.append("Quilt: "+quilt+"\n");
        return  builder.toString();
    }
}
