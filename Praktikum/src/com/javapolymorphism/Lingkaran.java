package com.javapolymorphism;

public class Lingkaran extends BangunDatar {
    int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    double luas() {
        return Math.PI * r;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * r;

    }
}
