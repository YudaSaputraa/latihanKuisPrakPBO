package com.javapolymorphism;

public class Persegi extends BangunDatar {
    int s;

    public Persegi(int s) {
        this.s = s;
    }

    @Override
    double luas() {
        return s * s;

    }

    @Override
    double keliling() {
        return s * 4;
    }
}
