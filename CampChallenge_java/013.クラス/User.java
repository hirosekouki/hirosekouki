/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack;

import java.util.ArrayList;

/**
 *
 * @author hnori
 */

public class User extends Human {
    
    ArrayList<Boolean> t = new ArrayList<>();
            public void setCard(ArrayList<Integer> a){//
                for(int i =0 ;  i < a.size(); i++)
                       myCards.add(a.get(i));
            }

            public int open(){
               int sum = 0;
                for(int i = 0;i< myCards.size(); i++){
                    sum+=myCards.get(i);
                }
                return sum;

            }
            public boolean checkSum(){
                int sum = 0;
                for(int i = 0;i< myCards.size(); i++){
                    sum+=myCards.get(i);
                }
                    if (sum <= 16 ){//合計してから処理する
                        return true;
                    }
                    else{
                        return false;
                    }
}
}
