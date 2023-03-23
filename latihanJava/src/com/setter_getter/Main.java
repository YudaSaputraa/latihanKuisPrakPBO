package com.setter_getter;

class Data {
    public int intPublic;
    private int intPrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;

    }

    void output() {
        System.out.println("Value intPublic : " + this.intPublic);
        System.out.println("Value intPrivate : " + this.intPrivate);
    }

    public int getIntPrivate() {
        return this.intPrivate;
    }

    public void setIntPrivate(int value) {
        this.intPrivate = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Data object = new Data();
        object.intPublic = 10;
        System.out.println("Public : " + object.intPublic);

        // getter
        int angka = object.getIntPrivate();
        System.out.println("getter private : " + angka);

        // setter
        object.setIntPrivate(30);
        System.out.println("\n");
        object.output();

    }

}
