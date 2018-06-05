/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SuperHero;

/**
 *
 * @author hnori
 */
public class SuperHero {
  
  public static void main (String[] args) {
      //インスタンス生成
      LegendHero H = new LegendHero();
      
      String name= "ロト";
      int hp = 100;
      
      H.setHero(name,hp);
      
      H.SuperHero();
      H.printHero();
     
  }  
}

