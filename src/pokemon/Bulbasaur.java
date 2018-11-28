/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Random;

/**
 *
 * @author rbowlen
 */
public class Bulbasaur {
     // Height in inches
     String name = "Bulby";
     double height = 28.00;
     double weight = 15.2;
     String category = "seed";
     String ability = "overgrow";
     String [] type = new String [] {"grass", "poison"};
     String [] weaknesses = new String [] {"fire", "flying", "ice", "psychic"};
     
     // Fighting stats
     int hp = 32;
     int pp = 10;
     
     // Create a random variable to control chance
     Random rand = new Random();
     
     /**
      * A method for the move overgrow, which powers up grass-type moves.
      * @param inTrouble 
      */
     public void overgrow(boolean inTrouble) {
          if(inTrouble) {
               System.out.println("Grass type moves are now powered up!");
          } else {
               System.out.println("Nothing happens...");
          }
     }
     
     /**
      * A method for growl, a move that lowers the enemy's defense.
      */
     public void growl() {
          System.out.println("Enemy pokemon's defense has lowered.");
     }
     
     /**
      * A method for tackle, a normal attack that damages the enemy pokemon.
      * @param charmander
      */
     public void tackle(Charmander charmander) {
          int damage = rand.nextInt(10) + 1;
          charmander.hp -= damage;
          System.out.println(charmander.name + " takes " + damage + " damage!");
     }
}
