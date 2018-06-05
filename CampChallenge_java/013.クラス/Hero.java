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
public class Hero {
  public String name;
  public int hp;
  
 public void setHero(String n, int a){
   this.name = n;
//   n = "ロト";
   this.hp = a;
//   a = 100;

  }
 public void printHero(){
      System.out.print("勇者" + this.name +"降臨！");
      System.out.print("体力は" + this.hp + "だぞ！");
 }
}
