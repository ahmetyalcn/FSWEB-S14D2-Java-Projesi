package com.workintech.model;

public class Bedroom extends Room{

    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1,wall2,wall3,wall4,ceiling,lamp);
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }


    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + getName() + '\'' +
                ", wall1=" + getWall1() +
                ", wall2=" + getWall2() +
                ", wall3=" + getWall3() +
                ", wall4=" + getWall4() +
                ", ceiling=" + getCeiling() +
                ", bed=" + bed +
                ", lamp=" + getLamp() +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
