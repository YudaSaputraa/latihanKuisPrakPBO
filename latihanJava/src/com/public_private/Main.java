package com.public_private;

class Player {
    String nama; // default bisa ditulis dan dibaca dari luar class
    public int exp; // public bis ditulis dan dibaca dari luas class
    private int health;

    public Player(String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }

    void display() {
        setHealth();
        System.out.println("\nNama : " + this.nama);
        System.out.println("Exp : " + this.exp);
        System.out.println("Health : " + this.health);
    }

    void newName(String nameBaru) {
        this.nama = nameBaru;

    }

    private void setHealth() {
        this.health += 100;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucok", 0, 100);
        player1.display();

        player1.newName("Marlin");
        player1.display();
    }

}
