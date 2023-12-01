package com.example.listviewcustom;

public class Animal {
    public String animalName;
    public int image;
    public String numitem;

    public Animal(int image, String numItem, String name) {
        this.image = image;
        this.numitem = numItem;
        this.animalName = name;

    }

    public String getName() {
        return animalName;  // Ganti pemanggilan variabel menjadi animalName
    }
}


