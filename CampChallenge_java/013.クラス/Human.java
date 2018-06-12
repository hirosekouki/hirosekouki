/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack;

import java.util.*;

/**
 *
 * @author hnori
 */
public abstract class Human {
    ArrayList<Integer> myCards = new ArrayList<Integer>();
    //手札の合計値を計算するメソッド
   public abstract int open();
    //引いたカード
   public abstract void setCard(ArrayList<Integer> a);   
   //まだカードを引くべきか判断するメソッド
   public abstract boolean checkSum();
   
}
    