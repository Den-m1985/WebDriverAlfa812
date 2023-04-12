package org.example.csvRead;

public class StructureCSV {
    private String name;
    private String artucul;
    private int price;
    private int item;

    public StructureCSV(String name, String artucul, int price, int item) {
        this.name = name;
        this.artucul = artucul;
        this.price = price;
        this.item = item;
    }


    public String getName() {
        return name;
    }

    public String getArtucul() {
        return artucul;
    }

    public int getPrice() {
        return price;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "name= " + name + ", artucul= " + artucul + ", price= " + price + ", item= " + item;
    }
}
