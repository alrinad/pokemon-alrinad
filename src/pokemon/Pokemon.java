/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author rbowlen
 */
public class Pokemon {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Bulbasaur bulbasaur = new Bulbasaur();
          Charmander charmander = new Charmander();
          
          
          
          while((bulbasaur.hp > 0) && (charmander.hp > 0)) {
               if(charmander.hp > 0) {
                    charmander.tackle(bulbasaur);
               }
               if(bulbasaur.hp > 0) {
                    bulbasaur.tackle(charmander);
               }
              
          }
          
          if(bulbasaur.hp <= 0) {
               System.out.println("Charmander wins!");
          }
          
          if(charmander.hp <= 0) {
               System.out.println("Bulbasaur wins!");
          }
          
          

     }
     
}
