package com.javapolymorphism;

public class JavaPolymorphism {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(10);
        BangunDatar persegi = new Persegi(5);
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Luas Persegi : " + persegi.luas());
    }

}
