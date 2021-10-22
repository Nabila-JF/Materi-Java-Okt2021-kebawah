/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author LENOVO
 */
public class Bola {
  private double jarijari;
  
  public void setJariJari(double jari2){
    this.jarijari = jari2;
  }

  public void showDiameter(){
    double result = this.jarijari * 2;
    System.out.println("Diameter nya adalah : "+ result + " cm");
  }

  public void showLuasPermukaan(){
    double result = 4 * Math.PI * Math.pow(this.jarijari, 2);
    System.out.println("Luas permukaannya adalah : "+ result + " cm kuadrat");
  }

  public void showVolume(){
    double result = (4/3) * Math.PI * Math.pow(this.jarijari, 3);
    System.out.println("Volumenya adalah : "+ result + " cm kubik");
  }
}
