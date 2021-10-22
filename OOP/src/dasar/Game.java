/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author LENOVO
 */
public class Game {
     public static void main(String[] args){

        // membuat objek player
        Player billa = new Player();

        // mengisi atribut player
        billa.name = "Nabila";
        billa.speed = 78;
        billa.healthPoin = 100;

        // menjalankan method
        billa.run();

        if(billa.isDead()){
            System.out.println("Game Over!");
        }

    }
}
