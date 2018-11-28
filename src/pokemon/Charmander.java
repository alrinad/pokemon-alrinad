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
public class Charmander {
     // Height in inches
     String name = "Char";
     double height = 24.00;
     double weight = 18.7;
     String category = "lizard";
     String ability = "blaze";
     String [] type = new String [] {"fire"};
     String [] weaknesses = new String [] {"ground", "rock", "water"};
     
     // Fighting stats
     int hp = 32;
     int pp = 10;
     
     // Create a random variable to control chance
     Random rand = new Random();
     
     /**
      * A method for the move blaze, which powers up fire-type moves.
      * @param inTrouble 
      */
     public static void blaze(boolean inTrouble) {
          if(inTrouble){
               System.out.println("Fire-type moves are now powered up!");
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
      * @param bulbasaur
      */
     public void tackle(Bulbasaur bulbasaur) {
          int damage = rand.nextInt(10) + 1;
          bulbasaur.hp -= damage;
          System.out.println(bulbasaur.name + " takes " + damage + " damage!");
     }
     
     
     
}
