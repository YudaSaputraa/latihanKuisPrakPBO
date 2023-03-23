package com.objectOrientedDasar;

// Player
class Player {
   String name;
   double health;
   int level;

   Weapon weapon;
   Armor armor;

   Player(String name, double health) {
      this.name = name;
      this.health = health;
   }

   void attack(Player opponent) {
      double attackPower = this.weapon.attackPower;
      System.out.println(this.name + " Attacking " + opponent.name + " with power " + attackPower);

      opponent.defence(attackPower);
   }

   void defence(double attackPower) {

      double demage;
      if (this.armor.defencePower < attackPower) {
         demage = attackPower - this.armor.defencePower;
      } else {
         demage = 0;
      }
      this.health -= demage;
      System.out.println(this.name + " gets Demage " + demage);

   }

   void equipWeapon(Weapon weapon) {
      this.weapon = weapon;
   }

   void equipArmor(Armor armor) {
      this.armor = armor;
   }

   void output() {
      System.out.println("\nNama : " + this.name + "\nHealth : " + this.health + "hp");
      this.weapon.output();
      this.armor.output();
   }
}

// Weapon
class Weapon {
   String weaponName;
   double attackPower;

   Weapon(String weaponName, double attackPower) {
      this.weaponName = weaponName;
      this.attackPower = attackPower;
   }

   void output() {
      System.out.println("Weapon : " + this.weaponName + ", Attack Power : " + this.attackPower);
   }
}

// Armor
class Armor {
   String armorName;
   double defencePower;

   Armor(String armorName, double defencePower) {
      this.armorName = armorName;
      this.defencePower = defencePower;

   }

   void output() {
      System.out.println("Armor : " + this.armorName + ", defence Power : " + this.defencePower);
   }

}

public class Main {
   public static void main(String[] args) {

      // player
      Player player1 = new Player("otong", 100);
      Player player2 = new Player("ucup", 50);

      // weapon
      Weapon pedang = new Weapon("Pedang", 15);
      Weapon ketapel = new Weapon("ketapel", 1);

      // Armor
      Armor bajuBesi = new Armor("Baju Besi", 10);
      Armor bajuPlastik = new Armor("Baju plastik", 0);

      // equip player 1
      player1.equipWeapon(pedang);
      player1.equipArmor(bajuBesi);
      player1.output();

      // equip player 2
      // equip player 1
      player2.equipWeapon(ketapel);
      player2.equipArmor(bajuPlastik);
      player2.output();

      System.out.println("\nPERTEMPURAN");
      System.out.println("Round 1");
      player1.attack(player2);
      player1.output();
      player2.output();

      System.out.println("\nRound 2");
      player2.attack(player1);
      player2.output();
      player1.output();
   }
}