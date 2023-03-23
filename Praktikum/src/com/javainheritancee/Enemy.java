package com.javainheritancee;

public class Enemy {
    String nama;
    int nyawa;

    public Enemy(String nama, int nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
    }

    void attack() {
        System.out.println(nama + " menyerang kamu");
    }

}
