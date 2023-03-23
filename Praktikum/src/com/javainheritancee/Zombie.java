package com.javainheritancee;

public class Zombie extends Enemy {

    Zombie(String nama, int nyawa) {
        super(nama, nyawa);
    }

    void attack() {
        System.out.println(nama + " menyerang kamu");
    }

    void health() {
        System.out.println("Nyawa : " + nyawa);
    }

}
